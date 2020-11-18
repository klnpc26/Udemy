package Enumerate;

import entities.enums.Client;
import entities.enums.Order;
import entities.enums.OrderItem;
import entities.enums.OrderStatus2;
import entities.enums.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramExercicio {
    
    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        
        Client client = new Client(name, email, birthDate);
        
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus2 status = OrderStatus2.valueOf(sc.next());
        
        Order order = new Order(new Date(), status, client);
        
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.next();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            
            Product product = new Product(productName, productPrice);
            
            OrderItem it = new OrderItem(quantity, productPrice, product);
            
            order.addItem(it);
        }
        System.out.println();
        System.out.println(order);
    }
}
