package Listas;

import java.util.Scanner;

public class Exercicio_Listas {
    
    private int id;
    private String name;
    private double salary;

    public Exercicio_Listas(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void increaseSalary(double percentage){
        salary = salary + salary * percentage / 100.0;
    }
    
    public String toString(){
        return id + ", " + name + ", " + salary;
    }
}
