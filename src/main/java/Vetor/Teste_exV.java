package Vetor;

import java.text.ParseException;
import java.util.Scanner;

public class Teste_exV {
    
    public static void main(String[] args) throws ParseException{
        
        Scanner sc = new Scanner(System.in);
        
        Exercicio_Vetor[] ex = new Exercicio_Vetor[10];
        
        System.out.print("How many rooms will be rented: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            
            System.out.println();
            System.out.println("Rent #" + (i+1));
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.nextLine();
            
            System.out.print("Room: ");
            int room = sc.nextInt();
         
            ex[room] = new Exercicio_Vetor(name, email);
        }
        
        System.out.println();
        System.out.println("Busy rooms: ");
        for(int i = 0; i < 10; i++){
            if(ex[i] != null){
                System.out.println(i + ": " + ex[i]);
            }
        }
    }
}
