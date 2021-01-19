/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author User
 */
public class Diando07228_MahasiswaEntity extends Diando07228_ManusiaEntity{
    private String npm, password, no_telp;
    private String kelas;
    private int jurusan;
    public Diando07228_MahasiswaEntity(String nama,String npm ,String password,String no_telp ,Date tanggal_lahir, String kelas,int jurusan) {
        super(nama, tanggal_lahir);
        this.npm = npm;
        this.password = password;
        this.no_telp = no_telp;
        this.kelas = kelas;
        this.jurusan=jurusan;
    }
    
    public Diando07228_MahasiswaEntity() {
        
    }
    
    @Override
    public Date getTglLahir() {
        return tglLahir;
    }
    
    @Override
    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getJurusan() {
        return jurusan;
    }

    public void setJurusan(int jurusan) {
        this.jurusan = jurusan;
    }
    
    
}
