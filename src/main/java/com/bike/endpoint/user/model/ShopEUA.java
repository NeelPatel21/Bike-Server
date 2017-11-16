package com.bike.endpoint.user.model;

import com.bike.endpoint.util.bean.Link;

import java.util.ArrayList;
import java.util.List;

public class ShopEUA{

    private long shopId;
    private String shopName;
    private double latitude;
    private double longitude;
    private boolean isOpen;
    private List<Link> links = new ArrayList<>();

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public List<Link> getLinks() {
        return links;
    }
}
