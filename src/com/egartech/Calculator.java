package com.egartech;

import java.util.*;


public class Calculator {



    public void calculate(List<Product> products, Date lastDate) {
        double sum = 0;
        System.out.println("Стоимость  " + "Количество " + "Стоимость доставки");
        for(Product p: products){
            if(lastDate.after(p.getDate())) continue;
            sum += p.getAmount() * p.getCost() + p.getCostDelivery();
            System.out.println(p.getCost() + "           " +  p.getAmount() + "        " +   p.getCostDelivery());

        }
        sum = Math.round(sum * 100.0) / 100.0;
        System.out.println("ИТОГО : " + sum);
    }

    public List<Product> sortByAmount(List<Product> products ){
        Comparator<Product> comparator = new Comparator() {
            @Override
            public int compare(Object p1, Object p2) {
                return ((Product)p1).getAmount()- ((Product)p2).getAmount();
            }
        };
        Collections.sort(products, comparator);
        return products;
    }
}
