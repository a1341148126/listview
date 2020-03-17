package com.example.listviewpractice;

public class Student {

    public Student(int imageId,String cquId){
        this.imageId=imageId;
        this.cquId=cquId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    private int imageId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getCquId() {
        return cquId;
    }

    public void setCquId(String cquId) {
        this.cquId = cquId;
    }

    private String cquId;

}
