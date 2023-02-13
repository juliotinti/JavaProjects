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
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int N[] = {1, 2, 3, 15, 16, 78, 34, 65, 80, 190}; 
        System.out.printf("A media eh: %.2f\n", calcMedia(N));
    }
    
    public static double calcMedia(int N[])
    {
        double soma = 0.0;
        for(int n: N)
        {
            soma+=n;
        }
        return soma/N.length;
    }
    
}
