package com.atu.entity;

import lombok.Data;

@Data
public class Heroes {
    private int hid;
    private String name;
    private String type;
    private String background_story;
    private String image_url;

    @Override
    public String toString() {
        return "Heroes{" +
                "hid1=" + hid +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", background_story='" + background_story + '\'' +
                ", image_url='" + image_url + '\'' +
                '}';
    }

}
