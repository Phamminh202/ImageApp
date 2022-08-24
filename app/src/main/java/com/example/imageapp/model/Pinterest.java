package com.example.imageapp.model;

import java.io.Serializable;

public class Pinterest implements Serializable {
    private String image;
    private String content;

    public Pinterest() {
    }

    public Pinterest(String image, String content) {
        this.image = image;
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
