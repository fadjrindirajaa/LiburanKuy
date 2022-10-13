package com.mobileprogramming.liburankuy.Model;

public class Penginapan {
    private int no;
    private String nama;
    private String deskripsi;
    private String alamat;
    private String harga;
    private String fasilitas;
    private String gmaps;
    private float jarak;
    private String key;
    private int photo_thumbnail;
    private int photo_poster;

    public Penginapan(){

    }

    public Penginapan(int no, String nama, String deskripsi, String alamat, String harga, String fasilitas, String gmaps, float jarak, String key, int photo_thumbnail, int photo_poster) {
        this.no = no;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.alamat = alamat;
        this.harga = harga;
        this.fasilitas = fasilitas;
        this.gmaps = gmaps;
        this.jarak = jarak;
        this.key = key;
        this.photo_thumbnail = photo_thumbnail;
        this.photo_poster = photo_poster;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public String getGmaps() {
        return gmaps;
    }

    public void setGmaps(String gmaps) {
        this.gmaps = gmaps;
    }

    public float getJarak() {
        return jarak;
    }

    public void setJarak(float jarak) {
        this.jarak = jarak;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getPhoto_thumbnail() {
        return photo_thumbnail;
    }

    public void setPhoto_thumbnail(int photo_thumbnail) {
        this.photo_thumbnail = photo_thumbnail;
    }

    public int getPhoto_poster() {
        return photo_poster;
    }

    public void setPhoto_poster(int photo_poster) {
        this.photo_poster = photo_poster;
    }
}
