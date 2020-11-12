package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste_ex_Lista {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        
        List<Exercicio_Listas> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Emplyoee #" + (i+1) + ": ");
            
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(list, id)){
                System.out.println("Id already taken! Try: again: ");
                id = sc.nextInt();
            }
            
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            
            System.out.print("Digite o Salario: ");
            double salary = sc.nextDouble();
            
            Exercicio_Listas ex = new Exercicio_Listas(id, name, salary);
            
            list.add(ex);
        }
        
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idSalary = sc.nextInt();
        
        Exercicio_Listas ex = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        
        if(ex == null){
            System.out.println("This id does not exist!");
        }else{
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            
            ex.increaseSalary(percent);
        }
        
        System.out.println();
        System.out.println("List od employees: ");
        for(Exercicio_Listas exx : list){
            System.out.println(exx);
        }
    }
    
    static boolean hasId(List<Exercicio_Listas> list, int id){
        Exercicio_Listas ex = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return ex != null;
    }
}
