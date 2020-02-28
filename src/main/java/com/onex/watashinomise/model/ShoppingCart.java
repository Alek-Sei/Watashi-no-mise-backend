package com.onex.watashinomise.model;

public class ShoppingCart {
    private int id;
    private String name;
    private String price;
    private int amount;
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ShoppingCart(int id, String name, String price, int amount, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.image = image;
    }
}
