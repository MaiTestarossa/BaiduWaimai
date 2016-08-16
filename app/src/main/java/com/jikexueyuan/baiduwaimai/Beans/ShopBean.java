package com.jikexueyuan.baiduwaimai.Beans;

/**
 * Created by sola on 2016/8/14.
 */
public class ShopBean {
    private int imageResID;
    private boolean isNewdian,isQuan,isPiao,isFu,isPei;
    private String shopName,sales,distance,startingPrice,shipingPrice,time,jian,mian;
    private float ratingBar;
    public static final boolean IS_NEWDIAN = true;
    public static final boolean NOT_NEWDIAN = false;

    public ShopBean(int imageResID, boolean isNewdian, boolean isQuan, boolean isPiao, boolean isFu, boolean isPei, String shopName, String sales, String distance, String startingPrice, String shipingPrice, String time, String jian, String mian, float ratingBar) {
        this.imageResID = imageResID;
        this.isNewdian = isNewdian;
        this.isQuan = isQuan;
        this.isPiao = isPiao;
        this.isFu = isFu;
        this.isPei = isPei;
        this.shopName = shopName;
        this.sales = sales;
        this.distance = distance;
        this.startingPrice = startingPrice;
        this.shipingPrice = shipingPrice;
        this.time = time;
        this.jian = jian;
        this.mian = mian;
        this.ratingBar = ratingBar;
    }

    public int getImageResID() {
        return imageResID;
    }

    public void setImageResID(int imageResID) {
        this.imageResID = imageResID;
    }

    public boolean isNewdian() {
        return isNewdian;
    }

    public void setNewdian(boolean newdian) {
        isNewdian = newdian;
    }

    public boolean isQuan() {
        return isQuan;
    }

    public void setQuan(boolean quan) {
        isQuan = quan;
    }

    public boolean isPiao() {
        return isPiao;
    }

    public void setPiao(boolean piao) {
        isPiao = piao;
    }

    public boolean isFu() {
        return isFu;
    }

    public void setFu(boolean fu) {
        isFu = fu;
    }

    public boolean isPei() {
        return isPei;
    }

    public void setPei(boolean pei) {
        isPei = pei;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(String startingPrice) {
        this.startingPrice = startingPrice;
    }

    public String getShipingPrice() {
        return shipingPrice;
    }

    public void setShipingPrice(String shipingPrice) {
        this.shipingPrice = shipingPrice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getJian() {
        return jian;
    }

    public void setJian(String jian) {
        this.jian = jian;
    }

    public String getMian() {
        return mian;
    }

    public void setMian(String mian) {
        this.mian = mian;
    }

    public float getRatingBar() {
        return ratingBar;
    }

    public void setRatingBar(float ratingBar) {
        this.ratingBar = ratingBar;
    }
}
