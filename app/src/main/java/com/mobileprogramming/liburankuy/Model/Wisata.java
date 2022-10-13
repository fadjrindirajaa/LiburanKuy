package com.mobileprogramming.liburankuy.Model;

public class Wisata {
    private int id_wisata;
    private String nama_wisata;
    private String desc_wisata;
    private String alamat_wisata;
    private String htm_wisata;
    private String jamBuka_wisata;
    private String gmaps_wisata;
    private int photoThumbnail;
    private int photoPoster;


    public Wisata(){

    }

    public Wisata(int id_wisata, String nama_wisata, String desc_wisata, String alamat_wisata, String htm_wisata, String jamBuka_wisata, String gmaps_wisata, int photoThumbnail, int photoPoster) {
        this.id_wisata = id_wisata;
        this.nama_wisata = nama_wisata;
        this.desc_wisata = desc_wisata;
        this.alamat_wisata = alamat_wisata;
        this.htm_wisata = htm_wisata;
        this.jamBuka_wisata = jamBuka_wisata;
        this.gmaps_wisata = gmaps_wisata;
        this.photoThumbnail = photoThumbnail;
        this.photoPoster = photoPoster;
    }

    public int getId_wisata() {
        return id_wisata;
    }

    public void setId_wisata(int id_wisata) {
        this.id_wisata = id_wisata;
    }

    public String getNama_wisata() {
        return nama_wisata;
    }

    public void setNama_wisata(String nama_wisata) {
        this.nama_wisata = nama_wisata;
    }

    public String getDesc_wisata() {
        return desc_wisata;
    }

    public void setDesc_wisata(String desc_wisata) {
        this.desc_wisata = desc_wisata;
    }

    public String getAlamat_wisata() {
        return alamat_wisata;
    }

    public void setAlamat_wisata(String alamat_wisata) {
        this.alamat_wisata = alamat_wisata;
    }

    public String getHtm_wisata() {
        return htm_wisata;
    }

    public void setHtm_wisata(String htm_wisata) {
        this.htm_wisata = htm_wisata;
    }

    public String getJamBuka_wisata() {
        return jamBuka_wisata;
    }

    public void setJamBuka_wisata(String jamBuka_wisata) {
        this.jamBuka_wisata = jamBuka_wisata;
    }

    public String getGmaps_wisata() {
        return gmaps_wisata;
    }

    public void setGmaps_wisata(String gmaps_wisata) {
        this.gmaps_wisata = gmaps_wisata;
    }

    public int getPhotoThumbnail() {
        return photoThumbnail;
    }

    public void setPhotoThumbnail(int photoThumbnail) {
        this.photoThumbnail = photoThumbnail;
    }

    public int getPhotoPoster() {
        return photoPoster;
    }

    public void setPhotoPoster(int photoPoster) {
        this.photoPoster = photoPoster;
    }
}
