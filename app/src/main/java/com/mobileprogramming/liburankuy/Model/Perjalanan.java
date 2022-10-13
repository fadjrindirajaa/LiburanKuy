package com.mobileprogramming.liburankuy.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Perjalanan implements Parcelable {
    private int id;
    private String nama;
    private String desc;
    private String lokasi;
    private String harga;
    private String jam;
    private String fasilitas;
    private String gmaps;
    private int menu;
    private int photoThumbnail;
    private int photoPoster;


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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
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

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(nama);
        dest.writeString(desc);
        dest.writeString(lokasi);
        dest.writeString(harga);
        dest.writeString(jam);
        dest.writeString(fasilitas);
        dest.writeString(gmaps);
        dest.writeInt(photoThumbnail);
        dest.writeInt(photoPoster);

    }

    protected Perjalanan(Parcel in){
        id = in.readInt();
        nama = in.readString();
        desc = in.readString();
        lokasi = in.readString();
        harga = in.readString();
        jam = in.readString();
        fasilitas = in.readString();
        gmaps = in.readString();
        photoThumbnail = in.readInt();
        photoPoster = in.readInt();
    }

    public static final Parcelable.Creator<Perjalanan> CREATOR = new Parcelable.Creator<Perjalanan>() {

        @Override
        public Perjalanan createFromParcel(Parcel source) {
            return new Perjalanan(source);
        }

        @Override
        public Perjalanan[] newArray(int size) {
            return new Perjalanan[size];
        }
    };
}
