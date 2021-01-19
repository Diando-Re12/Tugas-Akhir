/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Diando07228_JurusanEntity;
import Entity.Diando07228_MahasiswaEntity;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Diando07228_MahasiswaModel{
    private ArrayList<Diando07228_MahasiswaEntity> mahasiswaEntityArrayList;
    
    public Diando07228_MahasiswaModel() {
        mahasiswaEntityArrayList = new ArrayList<Diando07228_MahasiswaEntity>();
    }
    
    public Diando07228_MahasiswaEntity getProfileMahasiswa(int index) {
        return mahasiswaEntityArrayList.get(index);
    }
    
    public ArrayList<Diando07228_MahasiswaEntity> getAllMahasiswa() {
        return mahasiswaEntityArrayList;
    }
    
    public void insertMahasiswaModel(Diando07228_MahasiswaEntity profileMahasiswa) {
        mahasiswaEntityArrayList.add(profileMahasiswa);
    }
    
    public void editNpmMahasiswaModel(int index, String data) {
        mahasiswaEntityArrayList.get(index).setNpm(data);
    }
    
    public void editNamaMahasiswaModel(int index, String data) {
        mahasiswaEntityArrayList.get(index).setNama(data);
    }
    
    public void editJurusanMahasiswaModel(int index, int data) {
       mahasiswaEntityArrayList.get(index).setJurusan(data);
    }
    
    public void editKelasMahasiswaModel(int index, String data) {
        mahasiswaEntityArrayList.get(index).setKelas(data);
    }
    
    public void editMahasiswaModel(int index, Date data) {
        mahasiswaEntityArrayList.get(index).setTglLahir(data);
    }
    
    public void cekMahasiswa(String npm,String password){
        int loop = 0;
        if (mahasiswaEntityArrayList.size() == 0) {
            loop = -1; // data kosong
        } else {
            for (int i = 0; i < mahasiswaEntityArrayList.size(); i++) {
                if (mahasiswaEntityArrayList.get(i).getNpm().equals(npm) &&
                        mahasiswaEntityArrayList.get(i).getPassword().equals(password)) {
                    loop = i;
                    break;
                } else if(!mahasiswaEntityArrayList.get(i).getNpm().equals(npm) &&
                            !mahasiswaEntityArrayList.get(i).getPassword().equals(password) &&
                                i < mahasiswaEntityArrayList.size()-1) {
                    continue;
                } else {
                    loop = -2;
                }
            }
    }
    }
    
    
    public void hapusMahasiswaModel(int index) {
        mahasiswaEntityArrayList.remove(mahasiswaEntityArrayList.get(index));
    }
    public int size (){
        
       return mahasiswaEntityArrayList.size();
        
    }
}
