package Diando07228Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CLIENT
 */
import Diando07228Entity.Diando07228MahasiswaEntity;
import java.util.ArrayList;
public class Diando07228MahasiswaModel {
    private ArrayList<Diando07228MahasiswaEntity> Mhs;
    public Diando07228MahasiswaModel(){
        this.Mhs=new ArrayList<>();
        
    }
    public void Masuk07228(Diando07228MahasiswaEntity mhs){
        Mhs.add(mhs);
    }
    public void Hapus07228(Diando07228MahasiswaEntity mhs){
        Mhs.remove(mhs);
    }
    public ArrayList<Diando07228MahasiswaEntity> getMhs(){
        return Mhs;
    }
}
