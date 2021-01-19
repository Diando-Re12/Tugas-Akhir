package Views;



import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
public class Diando07228_UbahMahasiswaGUI {
    JFrame edit=new JFrame();
    JLabel ta,lnpm,lname,ljurusan,lkelas;
    JTextField npm,name,kelas;
    JButton ednpm,edname,edjurusan,edkelas,kembalilah,edtekan;
    JComboBox jurusan=new JComboBox(Entity.Diando07228_JurusanEntity.jurusan);
    
    public Diando07228_UbahMahasiswaGUI(int index){
     
    edit.setSize(1360, 800);
    edit.setLayout(null);
    edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    edit.setVisible(true);
    edit.setLocationRelativeTo(null);
    
    edit.getContentPane().setBackground(Color.CYAN);
    ta =new JLabel("Tampilan Ubah Data Mahasiswa");
    ta.setBounds(500,45,550 ,30);
    ta.setFont(new Font("Times New Roman",Font.BOLD,35));
    edit.add(ta);
    
    lnpm=new JLabel("Npm");
    lnpm.setBounds(450,150,200,25);
    lnpm.setFont(new Font("Times New Roman",Font.BOLD,15));
    edit.add(lnpm);
    
    npm=new JTextField();
    npm.setBounds(450,180,200,25);
    edit.add(npm);
    
    ednpm=new JButton("Edit");
    ednpm.setBounds(660,180,70,20);
    edit.add(ednpm);
    
    lname=new JLabel("Nama");
    lname.setBounds(450,240,200,25);
    lname.setFont(new Font("Times New Roman",Font.BOLD,15));
    edit.add(lname);
    
    name=new JTextField();
    name.setBounds(450,270,200,25);
    edit.add(name);
    
    edname=new JButton("Edit");
    edname.setBounds(660,270,70,20);
    edit.add(edname);
    
    ljurusan=new JLabel("Jurusan");
    ljurusan.setBounds(450,330,200,25);
    ljurusan.setFont(new Font("Times New Roman",Font.BOLD,15));
    edit.add(ljurusan);
    
    
    jurusan.setBounds(450,360,200,25);
    edit.add(jurusan);
    
    edjurusan=new JButton("Edit");
    edjurusan.setBounds(660,360,70,20);
    edit.add(edjurusan);
    
    lkelas=new JLabel("Kelas");
    lkelas.setBounds(450,420,200,25);
    lkelas.setFont(new Font("Times New Roman",Font.BOLD,15));
    edit.add(lkelas);
    
    kelas=new JTextField();
    kelas.setBounds(450,450,200,25);
    edit.add(kelas);
    
    edkelas=new JButton("Edit");
    edkelas.setBounds(660,450,70,20);
    edit.add(edkelas);
    
    edtekan=new JButton("Update Data");
    edtekan.setBounds(480,510,200,25);
    edit.add(edtekan);
    
    
    kembalilah=new JButton("Back");
    kembalilah.setBackground(Color.red);
    kembalilah.setBounds(30, 700, 70, 35);
    edit.add(kembalilah);
    
    
    
        npm.setEnabled(false);
        name.setEnabled(false);      
        jurusan.setEnabled(false);
        kelas.setEnabled(false);
        
        npm.setText(Diando07228_AllObjectController.mhs.getDataMahasiswa(index).getNpm());
        name.setText(Diando07228_AllObjectController.mhs.getDataMahasiswa(index).getNama());
        jurusan.setSelectedIndex(Diando07228_AllObjectController.mhs.getDataMahasiswa(index).getJurusan());
        kelas.setText(Diando07228_AllObjectController.mhs.getDataMahasiswa(index).getKelas());
    
    kembalilah.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           edit.dispose();
           new Diando07228_LoginMahasiswaGUI();
        }});
    ednpm.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
               npm.setEnabled(true);
        }});
    
    edname.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            name.setEnabled(true);
            
        }});
    edjurusan.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jurusan.setEnabled(true);
            
        }});
    edkelas.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            kelas.setEnabled(true);
            
        }});
    edtekan.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                    if(npm.isEnabled()) {
                        Diando07228_AllObjectController.mhs.updateDataMahasiswa(index, npm.getText(), "npm", "string");
                    }
                    if(name.isEnabled()) {
                        Diando07228_AllObjectController.mhs.updateDataMahasiswa(index, name.getText(), "nama", "string");
                    }
                   if(jurusan.isEnabled()) {
                        Diando07228_AllObjectController.mhs.updateDataMahasiswa(index, String.valueOf(jurusan.getSelectedIndex()), "jurusan", "int");
                    }
                    if(kelas.isEnabled()) {
                        Diando07228_AllObjectController.mhs.updateDataMahasiswa(index, kelas.getText(), "kelas", "string");
                    }
                    
                    JOptionPane.showMessageDialog(null, "Update Berhasil", "Information", JOptionPane.INFORMATION_MESSAGE);
                    edit.dispose();
                    new Diando07228_GUIutama();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
   
        }
    });
    
    
    }
}
