package com.be.test.betest.entities;

import javax.persistence.*;

@Entity
@Table(name = "petani")
public class PetaniEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nama;
    private String code;
    private String alamat;
    private String noKtp;
    private String noTelp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    @Override
    public String toString() {
        return "PetaniEntity{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", code='" + code + '\'' +
                ", alamat='" + alamat + '\'' +
                ", noKtp='" + noKtp + '\'' +
                ", noTelp='" + noTelp + '\'' +
                '}';
    }
}
