/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diando07228Controller;

/**
 *
 * @author CLIENT
 */
import Diando07228Entity.Diando07228MahasiswaEntity;
import Diando07228Model.Diando07228MahasiswaModel;
import java.util.ArrayList;
public class Diando07228MahasiswaController {
    Diando07228MahasiswaModel mhs=new Diando07228MahasiswaModel();
    public void Masuk07228(String nama,String password,String Umur){
        Diando07228MahasiswaEntity mahasiswa=new Diando07228MahasiswaEntity();
        mahasiswa.setNama("Saya adalah:"+nama);
        mhs.Masuk07228(mahasiswa);
    }
    public void Hapus07228(Diando07228MahasiswaEntity mhs){
        
    }
}
