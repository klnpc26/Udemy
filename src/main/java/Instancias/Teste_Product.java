package Instancias;

import java.util.Scanner;

public class Teste_Product {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Enter product data: ");
        System.out.print("Name: " );
        String name = entrada.nextLine();
        System.out.print("Price: " );
        double price = entrada.nextDouble();
       
        
        Product prod = new Product(name, price);
        
        System.out.println();
        System.out.println("Product data: " + prod);
        
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = entrada.nextInt();
        
        prod.setName("computador");
        
        prod.addProducts(quantity);
        
        System.out.println();
        System.out.print("Update data: " + prod);
        
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = entrada.nextInt();
        
        prod.removeProducts(quantity);
        
        System.out.println();
        System.out.print("Update data: " + prod);
    }
}
