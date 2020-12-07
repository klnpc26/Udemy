package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExercicioFixacao {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            
            List<Employee> list = new ArrayList<>();
            
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            
            List<String> emails = list.stream()
                    .filter(f -> f.getSalary() > salary)
                    .map(f -> f.getEmail())
                    .sorted()
                    .collect(Collectors.toList());
            
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
            emails.forEach(System.out::println);
            
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            
            double total = list.stream()
                    .filter(f -> f.getName().charAt(0) == 'M')
                    .map(f -> f.getSalary())
                    .reduce(0.0, (x,y) -> x + y);
                    
            
            System.out.println("Sum of salary of peaple whose name starts with 'M': " + String.format("%.2f", total)); 
        
        }catch(IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    
}
