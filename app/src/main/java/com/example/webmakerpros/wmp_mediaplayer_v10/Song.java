package com.example.webmakerpros.wmp_mediaplayer_v10;

public class Song {
    private String title;
    private String country;
    private int id;
    private String comment;



    public Song(int mId, String mTitle, String mCountry) {

        this.title = mTitle;
        this.country = mCountry;
        this.id = mId;
        //this.comment= mComment;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
    public void setId(int id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getComment() {
        return comment;
    }


}