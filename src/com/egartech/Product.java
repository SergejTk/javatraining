package com.egartech;


import java.util.Date;

public class Product {

    private float cost;

    private int amount;

    private float costDelivery;

    private Date date;

    public Product(float cost, int amount, float costDelivery, Date date) {
        this.cost = cost;
        this.amount = amount;
        this.costDelivery = costDelivery;
        this.date = date;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getCostDelivery() {
        return costDelivery;
    }

    public void setCostDelivery(float costDelivery) {
        this.costDelivery = costDelivery;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
