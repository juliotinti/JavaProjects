/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstruturasDecisao;

import java.util.Scanner;

/**
 *
 * @author Júlio Tinti de Andrade
 * BEE 2060
 *
 * Bino e Cino são colegas inseparáveis. Bino gosta de criar desafios matemáticos para Cino resolver. 
 * Desta vez, Bino gerou uma lista de números e perguntou ao Cino quantos números da lista são múltiplos de 2, 3, 4 e 5.
 * Esse desafio pode parecer simples, porém, quando a lista contém muitos números, Cino se confunde e acaba errando alguns cálculos.
 * Para ajudar Cino, faça um programa para resolver o desafio de Bino.
 * 
 * Entrada: 
 * A primeira linha da entrada consiste em um inteiro N (1 ≤ N ≤1000), representando a quantidade de números na lista de Bino.
 * A segunda linha contém N inteiros Li (1 ≤ Li ≤ 100), representando os números da lista de Bino.
 * 
 * Saída: 
 * Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na lista. Observe a formatação
 * da saída nos exemplos, pois ela deve ser seguida rigorosamente.
 */
public class DesafioBino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        int N, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        
        System.out.println("Digite N: ");
        N = ler.nextInt();
        
        for(int i=0; i<N; i++)
        {
            int num = ler.nextInt();
            if(num%2 == 0)
            {
                cont2++;
            }
            if(num%3 == 0)
            {
                cont3++;
            }
            if(num%4 == 0)
            {
                cont4++;
            }
            if(num%5 == 0)
            {
                cont5++;
            }
        }
        
        System.out.printf("%d Multiplo(s) de 2\n", cont2);
        System.out.printf("%d Multiplo(s) de 3\n", cont3);
        System.out.printf("%d Multiplo(s) de 4\n", cont4);
        System.out.printf("%d Multiplo(s) de 5\n", cont5);        
    }
    
}
