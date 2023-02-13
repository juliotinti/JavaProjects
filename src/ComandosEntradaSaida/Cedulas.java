/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ComandosEntradaSaida;

import java.util.Scanner;

/**
 *
 * @author Júlio Tinti de Andrade
 * BEE 1018
 */
public class Cedulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        int N, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
        
        System.out.println("Digite um valor N: ");
        N = ler.nextInt();
        
        nota100 = (N/100); 
        nota50 = (N - nota100*100)/50;
        nota20 = (N - nota100*100 - nota50*50)/20;
        nota10 = (N - nota100*100 - nota50*50 - nota20*20)/10;
        nota5 = (N - nota100*100 - nota50*50 - nota20*20 - nota10*10)/5;
        nota2 = (N - nota100*100 - nota50*50 - nota20*20 - nota10*10 - nota5*5)/2; 
        nota1 = (N - nota100*100 - nota50*50 - nota20*20 - nota10*10 - nota5*5 - nota2*2)/1; 
        
        System.out.printf("%d nota(s) de R$ 100,00\n", nota100);
        System.out.printf("%d nota(s) de R$ 50,00\n", nota50);
        System.out.printf("%d nota(s) de R$ 20,00\n", nota20);
        System.out.printf("%d nota(s) de R$ 10,00\n", nota10);
        System.out.printf("%d nota(s) de R$ 5,00\n", nota5);
        System.out.printf("%d nota(s) de R$ 2,00\n", nota2);
        System.out.printf("%d nota(s) de R$ 1,00\n", nota1);
        
    }
    
}
