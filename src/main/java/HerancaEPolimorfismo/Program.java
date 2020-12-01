package HerancaEPolimorfismo;

import HerancaEPolimorfismo.ImportedProduct;
import HerancaEPolimorfismo.Product;
import HerancaEPolimorfismo.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) throws ParseException{
        
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        List<Product> list = new ArrayList<>();
        
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            
            if(ch == 'c'){
                Product p = new Product(name, price);
                list.add(p);
            }else if(ch == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product p = new ImportedProduct(customsFee, name, price);
                list.add(p);                
            }else{
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                
                Product p = new UsedProduct(date, name, price);
                list.add(p);
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        
        for(Product p : list){
            System.out.println(p.priceTag());
        }
    }
}
