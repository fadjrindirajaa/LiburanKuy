package com.mobileprogramming.liburankuy.Model;

public class Kuliner {
    private int id;
    private String nama_kuliner;
    private String deskripsi;
    private String alamat;
    private int menu;
    private String gmaps;
    private int photoThumbnail;
    private int fotoPoster;

    public Kuliner(){

    }

    public Kuliner(int id, String nama_kuliner, String deskripsi, String alamat, int menu, String gmaps, int photoThumbnail, int fotoPoster) {
        this.id = id;
        this.nama_kuliner = nama_kuliner;
        this.deskripsi = deskripsi;
        this.alamat = alamat;
        this.menu = menu;
        this.gmaps = gmaps;
        this.photoThumbnail = photoThumbnail;
        this.fotoPoster = fotoPoster;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_kuliner() {
        return nama_kuliner;
    }

    public void setNama_kuliner(String nama_kuliner) {
        this.nama_kuliner = nama_kuliner;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public String getGmaps() {
        return gmaps;
    }

    public void setGmaps(String gmaps) {
        this.gmaps = gmaps;
    }

    public int getPhotoThumbnail() {
        return photoThumbnail;
    }

    public void setPhotoThumbnail(int photoThumbnail) {
        this.photoThumbnail = photoThumbnail;
    }

    public int getFotoPoster() {
        return fotoPoster;
    }

    public void setFotoPoster(int fotoPoster) {
        this.fotoPoster = fotoPoster;
    }
}
