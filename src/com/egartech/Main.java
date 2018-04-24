package com.egartech;

        import java.util.ArrayList;
        import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Product> products = new ArrayList<Product>();
        double sum = 0;
        products.add(new Product(2.34f, 5, 3.67f));
        products.add(new Product(2.65f, 3, 4.74f));
        products.add(new Product(7.34f, 2, 4.99f));
        System.out.println("Стоимость  " + "Количество " + "Стоимость доставки");
        for(Product p:products){
            sum += p.getAmount() * p.getCost() + p.getCostDelivery();
            System.out.println(p.getCost() + "           " +  p.getAmount() + "        " +   p.getCostDelivery());

        }
        sum = Math.round(sum * 100.0) / 100.0;
        System.out.println("ИТОГО : " + sum);
    }
}
