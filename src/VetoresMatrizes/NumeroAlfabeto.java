/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VetoresMatrizes;

import java.util.Scanner;

/**
 *
 * @author PICHAU
 */
public class NumeroAlfabeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {

        char alfabeto[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Scanner ler = new Scanner(System.in);
    
        System.out.printf("Digite o número da letra: ");
        int letraPedida = ler.nextInt();
        
        System.out.printf("\nLetra Pedida: %c\n", alfabeto[letraPedida-1]);
    
    }
    
}
