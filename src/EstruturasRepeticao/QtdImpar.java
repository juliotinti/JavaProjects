/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author PICHAU
 */
public class QtdImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int N, impares = 0;
        
        System.out.println("Digite a qtd de valores: ");
        N = ler.nextInt();
        
        for(int i=0; i<N; i++)
        {
            int num = ler.nextInt();
            if(num%2 != 0)
            {
                impares++;
            }
        }
        System.out.printf("%d numeros impares digitados\n", impares);
    }
    
}
