/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ComandosEntradaSaida;

import java.util.Scanner;

/**
 *
 * @author Júlio Tinti de Andrade
 */
public class GastoCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        double horasViagem, autonomiaCarro,  velocidadeMedia, valorGasolina, totalLitros, valorTotal;
        
        System.out.print("Digite a quantidade de horas esperada pela viagem: ");       
        horasViagem = ler.nextDouble();
        System.out.println();
        
        System.out.print("Digite a autonomia do carro (km/L): ");       
        autonomiaCarro = ler.nextDouble();
        System.out.println();
        
        System.out.print("Digite a velocidade média esperada na viagem (km/hr): ");       
        velocidadeMedia = ler.nextDouble();
        System.out.println();  
        
        System.out.print("Digite o preço da gasolina: ");       
        valorGasolina = ler.nextDouble();
        System.out.println();  
        
        totalLitros = (horasViagem*velocidadeMedia)/autonomiaCarro;
        valorTotal = totalLitros*valorGasolina;
        
        System.out.printf("Total Litros: %.3f \nTotal Gasto: R$%.3f\n", totalLitros, valorTotal);
        
    }
    
}
