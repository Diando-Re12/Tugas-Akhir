/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Diando07228_MahasiswaEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import Entity.Diando07228_JurusanEntity;

/**
 *
 * @author CLIENT
 */
public class Diando07228_MahasiswaController {

    int indexLogin;

    public Diando07228_MahasiswaEntity getDataMahasiswa(int index) {
        return Diando07228_AllObjectModel.mahasiswa.getProfileMahasiswa(index);
    }

    public Diando07228_MahasiswaEntity mahasiswaEntity(int index) {
        return Diando07228_AllObjectModel.mahasiswa.getProfileMahasiswa(index);
    }

    public void insertDataMahasiswa(String nama, String npm, String password, String no_telp, Date tanggal_lahir, String kelas, int index) {
        Diando07228_MahasiswaEntity mahasiswa = new Diando07228_MahasiswaEntity(nama, npm, password, no_telp, tanggal_lahir, kelas, index);
        Diando07228_AllObjectModel.mahasiswa.insertMahasiswaModel(mahasiswa);
    }

    public int loginMahasiswa(String npm, String password) {
        int index = -1;
        for (int i = 0; i < getSizeDataMahasiswa(); i++) {
            if (npm.equals(getDataMahasiswa(i).getNpm()) && password.equals(getDataMahasiswa(i).getPassword())) {
                index = i;
                break;
            }
            else{
                index=-1;
            }
        }
        return index;
    }

    public void cekData(String npm, String password) {

    }

    public int getSizeDataMahasiswa() {
        return Diando07228_AllObjectModel.mahasiswa.size();
    }

    public void deleteDataMahasiswa(int index) {
        Diando07228_AllObjectModel.mahasiswa.hapusMahasiswaModel(index);
    }

    public ArrayList<Diando07228_MahasiswaEntity> getDataMahasiswa() {
        return Diando07228_AllObjectModel.mahasiswa.getAllMahasiswa();
    }

    public void updateDataMahasiswa(int index, String data, String ubah, String tipe) throws ParseException {
        switch (tipe) {
            case "string":
                switch (ubah) {
                    case "npm":
                        Diando07228_AllObjectModel.mahasiswa.editNpmMahasiswaModel(index, data);
                        break;
                    case "nama":
                        Diando07228_AllObjectModel.mahasiswa.editNamaMahasiswaModel(index, data);
                        break;

                    case "kelas":
                        Diando07228_AllObjectModel.mahasiswa.editKelasMahasiswaModel(index, data);
                        break;
                }

            case "int":
                Diando07228_AllObjectModel.mahasiswa.editJurusanMahasiswaModel(index, Integer.parseInt(data));
                break;
        }
    }

    public DefaultTableModel datatab() {
        DefaultTableModel dttab = new DefaultTableModel();
        Object[] collom = {"index", "NPM", "Nama", "Jurusan", "Kelas"};
        dttab.setColumnIdentifiers(collom);
        int size = Controller.Diando07228_AllObjectModel.mahasiswa.size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[5];
            data[0] = String.valueOf(i);
            data[1] = Controller.Diando07228_AllObjectModel.mahasiswa.getAllMahasiswa().get(i).getNpm();
            data[2] = Controller.Diando07228_AllObjectModel.mahasiswa.getAllMahasiswa().get(i).getNama();
            data[3] = Entity.Diando07228_JurusanEntity.jurusan[Controller.Diando07228_AllObjectModel.mahasiswa.getAllMahasiswa().get(i).getJurusan()];
            data[4] = Controller.Diando07228_AllObjectModel.mahasiswa.getAllMahasiswa().get(i).getKelas();
            dttab.addRow(data);
        }
        return dttab;
    }

}
