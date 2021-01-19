
package Views;


import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class Diando07228_LoginMahasiswaGUI {

    JFrame dm = new JFrame();
    JLabel indexl, namal, npml, jurusanl, kelasl, atasl, are;
    JTextField aread;
    JButton kembalilah, edit, hapus;
    JTable tm = new JTable();
    JScrollPane stm = new JScrollPane(tm);

    public Diando07228_LoginMahasiswaGUI() {
        dm.setSize(1360, 800);
        dm.setLayout(null);
        dm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dm.setVisible(true);
        dm.setLocationRelativeTo(null);

        dm.getContentPane().setBackground(Color.CYAN);
        atasl = new JLabel("Tampilan Data Mahasiswa");
        atasl.setBounds(500, 45, 550, 30);
        atasl.setFont(new Font("Times New Roman", Font.BOLD, 35));
        dm.add(atasl);

        stm.setBounds(300, 100, 650, 500);
        tm.setModel(Diando07228_AllObjectController.mhs.datatab());
        dm.add(stm);

        are = new JLabel("Nomor");
        are.setBounds(1180, 170, 70, 35);
        dm.add(are);

        aread = new JTextField();
        aread.setBounds(1180, 200, 70, 35);
        dm.add(aread);

        kembalilah = new JButton("Back");
        kembalilah.setBackground(Color.red);
        kembalilah.setBounds(30, 700, 70, 35);
        dm.add(kembalilah);

        edit = new JButton("Edit");
        edit.setBackground(Color.white);
        edit.setBounds(1180, 400, 70, 35);

        dm.add(edit);

        hapus = new JButton("Hapus");
        hapus.setBackground(Color.red);
        hapus.setBounds(1180, 300, 70, 35);
        dm.add(hapus);

        kembalilah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dm.dispose();
                new Diando07228_GUIutama();
            }
        });

        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dm.dispose();
                int index = Integer.parseInt(aread.getText());
                new Diando07228_UbahMahasiswaGUI(index);
            }
        });

        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Diando07228_AllObjectController.mhs.getSizeDataMahasiswa() == 0) {
                    JOptionPane.showMessageDialog(null, "Data Masih Kosong", "Information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int im = Integer.parseInt(aread.getText());
                    int result = JOptionPane.showConfirmDialog(dm, "apakah anda yakin untuk menghapus ?", "Swing Tester",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE);
                    if (result == JOptionPane.YES_OPTION) {
                        Diando07228_AllObjectController.mhs.deleteDataMahasiswa(im);
                        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Information", JOptionPane.INFORMATION_MESSAGE);
                        tm.setModel(Diando07228_AllObjectController.mhs.datatab());
                        aread.setText(null);
                    }
                }
            }
        });

        tm.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tm.getSelectedRow();
                aread.setText(Diando07228_AllObjectController.mhs.datatab().getValueAt(i, 0).toString());
            }
        });

    }
}
