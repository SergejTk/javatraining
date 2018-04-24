package com.egartech;


public class Product {

    private float cost;

    private int amount;

    private float costDelivery;

    public Product(float cost, int amount, float costDelivery) {
        this.cost = cost;
        this.amount = amount;
        this.costDelivery = costDelivery;
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
}
