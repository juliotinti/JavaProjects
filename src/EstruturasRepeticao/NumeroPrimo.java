package EstruturasRepeticao;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Júlio Tinti de Andrade
 * 
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in); 
        System.out.println("Digite um número para saber se ele é primo: ");
        int numero = ler.nextInt();
        boolean ehPrimo = false; 
        if(numero <= 1)
        {
            ehPrimo = false;
        }
        else
        {
            ehPrimo = true;
            for(int i = 2; i < (int)Math.sqrt(numero); i++)
            {
                if(numero%i == 0)
                {
                    ehPrimo = false; 
                }
            }            
        }
        if(!ehPrimo)
        {
            System.out.println("Não é primo!");
        }
        else
        {
            System.out.println("É primo!");
        }

        
    }
    
}
