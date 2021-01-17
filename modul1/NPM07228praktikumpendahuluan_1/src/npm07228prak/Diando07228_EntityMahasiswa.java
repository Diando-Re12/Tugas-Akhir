/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm07228prak;

import java.util.Date;

/**
 *
 * @author CLIENT
 */
public class Diando07228_EntityMahasiswa {
    String Diando07228_nama, Diando07228_pass, Diando07228_npm, Diando07228_notelp;
    int Diando07228_jurusan;
    Date Diando07228_tanggal_lahir;
    
    public Diando07228_EntityMahasiswa(String Diando07228_nama, Date Diando07228_tgl_lahir, String Diando07228_npm, String Diando07228_password, int Diando07228_jurusan, String Diando07228_notelp) {
        this.Diando07228_nama = Diando07228_nama;
        this.Diando07228_npm = Diando07228_npm;
        this.Diando07228_tanggal_lahir = Diando07228_tgl_lahir;
        this.Diando07228_pass = Diando07228_password;
        this.Diando07228_jurusan = Diando07228_jurusan;
    }
    
    String getNama() {
        return this.Diando07228_nama;
    }
    
    String getNpm() {
        return this.Diando07228_npm;
    }
    
    Date getTanggalLahir() {
        return this.Diando07228_tanggal_lahir;
    }
    
    String getPassword() {
        return this.Diando07228_pass;
    }
    
    String getNoTelp() {
        return this.Diando07228_notelp;
    }
    
    int getJurusan() {
        return this.Diando07228_jurusan;
    }
}