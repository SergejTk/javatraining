package com.egartech;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        Calculator calculator = new Calculator();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            products.add(new Product(2.34f, 5, 3.67f, format.parse("10-02-2018")));
            products.add(new Product(2.65f, 3, 4.74f, format.parse("13-03-2018")));
            products.add(new Product(7.34f, 2, 4.99f, format.parse("05-04-2018")));
            calculator.calculate(products, format.parse("10-03-2018"));
        }catch (ParseException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        for(Product product : calculator.sortByAmount(products)){
            System.out.println(product.getCost() + "           " + product.getAmount() + "        " + product.getCostDelivery());
        }

        // ***  ДЗ от 21.05.2018  ч.2  ****
        List<User> l1 = new ArrayList<User>();
        List<User> l2 = new ArrayList<User>();

        l1.add(new User("Smit", "111", "aaa"));
        l1.add(new User("Bill", "222", "bbb"));
        l1.add(new User("jony", "333", "ccc"));
        l2.add(new User("Anny", "444", "ddd"));
        l2.add(new User("jony", "333", "ccc"));
        l2.add(new User("Fill", "555", "eee"));
        l2.add(new User("Bill", "222", "bbb"));

        List<User> jointUsers = new UsersAction().getJointUsers(l1,l2);
        System.out.println("   Общие клиенты :");
        for(User user : jointUsers) {
            System.out.println(user.getUsername() + "   " + user.getPassword() + "   " + user.getEmail());
        }
    }
}
