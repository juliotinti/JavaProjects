/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author Júlio Tinti de Andrade
 */
public class FazerQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número N para ser o tamanho do seu quadrado...");
        int N = ler.nextInt();
        for(int i = 0; i<N; i++)
        {
            for(int j = 0; j<N; j++)
            {
                System.out.print("* ");                
            }
            System.out.println();
        }
    }
    
}
