
package Views;
import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import javax.swing.*;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Entity.Diando07228_JurusanEntity;

public class Diando07228_GUIutama {
    Diando07228_AllObjectController mhs=new Diando07228_AllObjectController();
    JFrame fu=new JFrame();
    JLabel ta,lg,lgb,daf,lnpm,lpass,dnpm,dname,dttl,dnotel,dpass,dkelas;
    JTextField npm,name,ttl,notel,npml,passl,kelas;
    JButton daftekan,tes;
    JPasswordField paslog,pasdaf;
    JComboBox cbjurusan=new JComboBox(Diando07228_JurusanEntity.jurusan);
    public Diando07228_GUIutama(){
       
        //membuat atasnnya
        fu.getContentPane().setBackground(Color.CYAN);
        daf=new JLabel("Selamat Datang di Aplikasi Pendataan Mahasiswa ITATS");
        daf.setBounds(90, 20, 1100, 100);
        daf.setFont(new Font("Arial",Font.BOLD,40));
        fu.add(daf);
        
        //membuat label login maba
        lg=new JLabel("Login Mahasiswa Baru");
        lg.setBounds(50, 150, 400, 100);
        lg.setFont(new Font("Times New Roman",Font.BOLD,35));
        fu.add(lg);
        
        //membuat label daftar maba
        lgb=new JLabel("Daftar Mahasiswa Baru");
        lgb.setBounds(800, 150, 400, 100);
        lgb.setFont(new Font("Times New Roman",Font.BOLD,35));
        fu.add(lgb);
        
        //membuat label npm login
        lnpm=new JLabel("NPM");
        lnpm.setBounds(50,230,400,100);
        lnpm.setFont(new Font("Times New Roman",Font.ITALIC,20));
        fu.add(lnpm);
        
        //membuat text field npm login
        npml=new JTextField();
        npml.setBounds(50,300,150,25);
        fu.add(npml);
        
        //membuat label daftar nama
        dname=new JLabel("Nama");
        dname.setBounds(800,200,400,100);
        dname.setFont(new Font("Times New Roman",Font.ITALIC,20));
        fu.add(dname);
        
        //membuat text field daftar nama
        name=new JTextField();
        name.setBounds(800, 260, 200, 25);
        name.setFont(new Font("Times New Roman",Font.ITALIC,20));
        fu.add(name);
        
        //membuat label login password
        lpass=new JLabel("Password");
        lpass.setBounds(50,310, 400, 100);
        lpass.setFont(new Font("Times New Roman",Font.ITALIC,20));
        fu.add(lpass);
        
        //membuat label daftar NPM
        dnpm=new JLabel("NPM");
        dnpm.setBounds(800,250,400,100);
        dnpm.setFont(new Font("Times New Roman",Font.ITALIC,20));
        fu.add(dnpm);
        
        //membuat text password password login
        paslog=new JPasswordField();
        paslog.setBounds(50, 380, 200, 25);
        paslog.setFont(new Font("Times New Roman",Font.ITALIC,20));
        fu.add(paslog);
        
        //membuat text field NPM daftar
        npm=new JTextField();
        npm.setBounds(800,315,200,25);
        fu.add(npm);
        
        //membuat label Password daftar
        dpass=new JLabel("Password");
        dpass.setBounds(800,345,200,25);
        dpass.setFont(new Font("Times New Roman",Font.ITALIC,20));
        fu.add(dpass);
        
        //membuat text password password daftar
        pasdaf=new JPasswordField();
        pasdaf.setBounds(800, 372, 200, 25);
        fu.add(pasdaf);
        
        //membuat label Nomor telpon daftar
        dnotel=new JLabel("No Telepon");
        dnotel.setBounds(800,400,200,25);
        dnotel.setFont(new Font("Times New Roman",Font.ITALIC,20));
        fu.add(dnotel);
        
        //membuat text field no telepon daftar
        notel=new JTextField();
        notel.setBounds(800, 430, 200, 25);
        fu.add(notel);
        
        
        //membuat label Tanggal Lahir daftar
        dttl=new JLabel("Tanngal Lahir (tanggal/bulan/tahun)");
        dttl.setBounds(800, 460, 350, 25);
        dttl.setFont(new Font("Times New Roman",Font.ITALIC,20));
        fu.add(dttl);
        
         //membuat text field Tanggal Lahir daftar
        ttl=new JTextField();
        ttl.setBounds(800, 490, 200, 25);
        fu.add(ttl);
        
        //membuat label kelas daftar
        dkelas=new JLabel("Kelas");
        dkelas.setBounds(800,520,200,25);
        dkelas.setFont(new Font("Times New Roman",Font.ITALIC,20));
        fu.add(dkelas);
        
        //membuat text field kelas daftar
        kelas=new JTextField();
        kelas.setBounds(800, 550, 200, 25);
        fu.add(kelas);
        
        //membuat index jurusan
        cbjurusan.setBounds(800, 600, 200, 30);
        fu.add(cbjurusan);
        
        
        
        //membuat tombol daftar
        
        daftekan=new JButton("Daftar");
        daftekan.setBounds(800, 670, 200, 30);
        daftekan.setBackground(Color.decode("#3564a1"));
        fu.add(daftekan);
        
        //membuat tombol login
        
        tes=new JButton("Masuk");
        tes.setBounds(60, 420, 150, 40);
        tes.setBackground(Color.decode("#3564a1"));
        fu.add(tes);
        
        tes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fu.dispose();
           
                    fu.dispose();
                    new Diando07228_LoginMahasiswaGUI();
                
                   
                
            
           }
        });
        
         daftekan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{ 
                Date ttlahir=new Date(ttl.getText());
                String nama=name.getText();
                String password=pasdaf.getText();
                String celas=kelas.getText();
                String npmd=npm.getText();
                String nt=notel.getText();
                int injurusan=cbjurusan.getSelectedIndex();
                mhs.mhs.insertDataMahasiswa(nama, npmd , password, nt ,ttlahir,celas,injurusan);
                JOptionPane.showMessageDialog(null, "Registrasi Sukses", "Information", JOptionPane.INFORMATION_MESSAGE);
                kosong();
                
                }
                
                catch(Exception ex){
                   JOptionPane.showMessageDialog(null, "Maaf,Format penulisan anda masih salah", "Information", JOptionPane.INFORMATION_MESSAGE);
                   kosong();
                }
               
            }

            
        });
        
        
         
         
        fu.setSize(1360, 800);
        fu.setLayout(null);
        fu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fu.setVisible(true);
        fu.setLocationRelativeTo(null);
    }
    void kosong() {
        npm.setText(null);
        name.setText(null);
        pasdaf.setText(null);
        notel.setText(null);
        ttl.setText(null);
        kelas.setText(null);
        cbjurusan.setSelectedIndex(0);
    }
}
