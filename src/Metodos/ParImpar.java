/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author PICHAU
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int N = ler.nextInt();
        parImpar(N);
    }
    
    public static void parImpar(int numero)
    {
        if(numero%2 == 0)
        {
            System.out.printf("%d eh par\n", numero);
        }
        else
        {
            System.out.printf("%d eh impar\n", numero);
        }
    }
}
