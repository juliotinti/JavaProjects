/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strings;

import java.util.Scanner;

/**
 *
 * exercicio 13
 */
public class Stringss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase;
        frase = ler.nextLine(); 
        System.out.println("A frase substituindo a -> | eh:");
        System.out.println(frase.replace('a', '|'));
       
    }
    
}
