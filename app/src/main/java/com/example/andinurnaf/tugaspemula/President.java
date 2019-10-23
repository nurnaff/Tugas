package com.example.andinurnaf.tugaspemula;

import android.os.Parcel;
import android.os.Parcelable;

public class President implements Parcelable {
    private String name, remarks, photo, deskripsi, mulai, selesai;

    protected President(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        deskripsi = in.readString();
        mulai = in.readString();
        selesai = in.readString();
    }

    public static final Creator<President> CREATOR = new Creator<President>() {
        @Override
        public President createFromParcel(Parcel in) {
            return new President(in);
        }

        @Override
        public President[] newArray(int size) {
            return new President[size];
        }
    };

    public President() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLahir() {
        return mulai;
    }

    public void setLahir(String mulai) {
        this.mulai = mulai;
    }

    public String getWafat() {
        return selesai;
    }

    public void setWafat(String selesai) {
        this.selesai = selesai;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.remarks);
        parcel.writeString(this.photo);
        parcel.writeString(this.deskripsi);
        parcel.writeString(this.mulai);
        parcel.writeString(this.selesai);
    }
}
