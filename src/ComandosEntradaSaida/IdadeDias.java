package ComandosEntradaSaida;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Júlio Tinti de Andrade
 * Beecrowd - 1020
 */
public class IdadeDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int N, ano, mes, dia;
        
        N = ler.nextInt();
        ano = (N/365); 
        mes = (N - ano*365)/30;
        dia = (N - ano*365 - 30*mes);
        
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dia);
        
    }
    
}
