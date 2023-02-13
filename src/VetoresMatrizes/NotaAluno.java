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
public class NotaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Digite a qtd de provas:  ");
        int qtdProvas = ler.nextInt();
        
        
        double notasAluno[] = new double[qtdProvas]; 
        double total = 0.0;
        
        for(int i = 0; i<qtdProvas; i++)
        {
            System.out.printf("Digite a nota da %do prova: ", i+1);
            notasAluno[i]=ler.nextDouble();
            total+=notasAluno[i];
        }
        
        System.out.printf("A média do aluno é: %.2f\n", total/qtdProvas);       
        
    }
    
}
