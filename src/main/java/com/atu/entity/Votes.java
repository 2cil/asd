package com.atu.entity;

public class Votes {
    private int id;
    private int uid;
    private int hid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public Votes() {
    }

    public Votes(int id, int uid, int hid) {
        this.id = id;
        this.uid = uid;
        this.hid = hid;
    }
}
