package com.example;

public class Main {
    public static void main(String[] args) {
        Product producto1 = new Product("teclado", 19.99d, 2, "green", 167);
        Product producto2 = new Product("silla gammer",250.99,5,"blue",25);
        Product producto3 = new Product("escritorio gammer", 159.99, 8, "grey", 37 );
        Product producto4 = new Product("mouse", 35.99, 9, "black", 98 );
        Product producto5 = new Product("torre", 659.99, 68, "blue", 87);


        // Crear un array de productos

        int[] numbers = new int[5];
        int[] numbers2 = {1,2,3};

        Product[] products = {producto1, producto2, producto3, producto4, producto5};

        // Calcular el precio total

        Double totalPrice = (double) 0;


        for (Product product : products) {
            System.out.println(product.getPrice());
        }

    }

}
