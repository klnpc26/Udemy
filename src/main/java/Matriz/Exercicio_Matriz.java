package Matriz;

import java.util.Scanner;

public class Exercicio_Matriz {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        
        int[][] mat = new int[n][n];
        
        for(int i = 0; i <mat.length; i++){ // linhas
            for(int j = 0; j <mat[i].length; j++){ // colunas
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Main diagonal: ");
        for(int i = 0; i < mat.length; i++){
            System.out.println(mat[i][i] + " ");
        }
        System.out.println();
        
        int count = 0;
        for(int i=0; i<mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] < 0){
                    count++;
                }
            }
        }
        
        System.out.println("Negative numbers = " + count);
    }
}
