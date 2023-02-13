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
public class QtdNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        
        int nl = 3, nc = 2; 
        int m[][] = new int [nl][nc];
        int maior = 0;
 
        System.out.println("Digite valores positivos: ");
        
        for(int i = 0; i <nl; i++)
        {
            System.out.printf("Linha %d: \n", i+1);
            for(int j = 0; j <nc; j++)
            {
                do
                {
                System.out.printf("M[%d][%d]: ", i, j);
                m[i][j] = ler.nextInt();
                }while(m[i][j]<0);
                System.out.println();
                if(m[i][j] > maior)
                {
                    maior = m[i][j];
                }
            } 
        }
        
        int contador[] = new int[maior+1];
 
        for(int i = 0; i <nl; i++)
        {
            for(int j = 0; j <nc; j++)
            {
                contador[m[i][j]]++;
            } 
        }
 
        for(int i = 0; i <maior+1; i++)
        {
            if(contador[i] != 0)
            {
                System.out.printf("Ha %d valor(es) de %d\n", contador[i], i);                
            }

        }
        
        
    }
    
}
