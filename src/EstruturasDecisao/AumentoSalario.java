/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstruturasDecisao;

import java.util.Scanner;

/**
 *
 * @author Júlio Tinti de Andrade
 * 
 */
public class AumentoSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        double salario;
        double pAumento = 0.15, sAumento = 0.12, tAumento = 0.09;
        
        //se for abaixo de 1000, aumento de 15%
        //1000< N < 1500, aumento de 12%
        //acima de 1500, aumento de 9%
        System.out.println("Digite seu salário: ");
        salario = ler.nextDouble();
        
        if(salario <= 1000)
        {
             System.out.printf("Novo salário: %.2f\n", salario*(1+pAumento));
            System.out.printf("Reajuste de: %.2f\n", salario*pAumento);           
        }
        else if(salario > 1000 && salario <= 1500)
        {
            System.out.printf("Novo salário: %.2f\n", salario*(1+sAumento));
            System.out.printf("Reajuste de: %.2f\n", salario*sAumento);            
        }
        else 
        {
            System.out.printf("Novo salário: %.2f\n", salario*(1+tAumento));
            System.out.printf("Reajuste de: %.2f\n", salario*tAumento);
        }
        
        
    }
    
}
