package com.egartech;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            products.add(new Product(2.34f, 5, 3.67f, format.parse("10-02-2018")));
            products.add(new Product(2.65f, 3, 4.74f, format.parse("13-03-2018")));
            products.add(new Product(7.34f, 2, 4.99f, format.parse("05-04-2018")));
            Calculator calculator = new Calculator();
            calculator.calculate(products, format.parse("10-03-2018"));
        }catch (ParseException e){
            System.out.println(e.getMessage());
        }
    }
}
