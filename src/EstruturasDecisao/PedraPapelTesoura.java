/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstruturasDecisao;

import java.util.Scanner;

/**
 *
 * @author Júlio Tinti de Andrade
 */
public class PedraPapelTesoura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Considere pedra(P), papel(p) e tesoura (t)");
        System.out.println();
        char maoP1, maoP2;
        
        System.out.printf("Jogador 1: ");
        System.out.println();
        maoP1 = ler.next().charAt(0);
        System.out.printf("Jogador 2: ");
        System.out.println();
        maoP2 = ler.next().charAt(0);
        
        if((maoP1 == 'P' && maoP2 == 't') || (maoP1 == 't' && maoP2 == 'p') || (maoP1 == 'p' && maoP2 == 'P'))
            System.out.printf("Jogador 1 venceu\n");           
        else System.out.printf("Jogador 2 venceu\n");

    }
    
}
