package com.example.mainmenu;

public class ListStore {

    private String prName;
    private String prPrice ;
    private String prImg;

    public ListStore() {
    }

    public ListStore(String title2, String price, String  image1) {
        this.prName = title2;
        this.prPrice = price;
        this.prImg = image1;
    }

    public String getPrName() {
        return prName;
    }

    public void setPrName(String prName) {
        this.prName = prName;
    }

    public String getPrPrice() {
        return prPrice;
    }

    public void setPrPrice(String prPrice) {
        this.prPrice = prPrice;
    }

    public String getPrImg() {
        return prImg;
    }

    public void setPrImg(String prImg) {
        this.prImg = prImg;
    }
}
