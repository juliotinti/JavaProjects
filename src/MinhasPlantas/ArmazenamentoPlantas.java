/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MinhasPlantas;

import Classes.Plantas;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Júlio Tinti de Andrade
 * Exercicio 19
 */
public class ArmazenamentoPlantas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
    
        Scanner ler = new Scanner(System.in);
        String nome, infoRega;
        double periodoRega; 
        ArrayList<Plantas> plantas = new ArrayList<Plantas>();  
        
        while (true) 
        {
            System.out.println("Digite o nome de sua planta (FIM para encerrar):");
            nome = ler.nextLine();
            if (nome.equalsIgnoreCase("FIM")) {
               break; 
            }
            System.out.println();
            System.out.println("Digite o periodo de rega (de quantos em quantos dias deve ser regado):");
            periodoRega = ler.nextDouble();
            System.out.println();
            ler.nextLine(); // limpa o buffer de entrada de dados
            System.out.println("Digite informações sobre a rega dessa planta:");  
            infoRega = ler.nextLine();
            System.out.println();
            plantas.add(new Plantas(nome, periodoRega, infoRega));
        }
        
        //armazenamento das plantas em TXT para outro exercício: 
        FileWriter arquivo = new FileWriter("minhasPlantas.txt", true);
        PrintWriter gravarArq = new PrintWriter(arquivo);
        for (Plantas p : plantas)
        {
            gravarArq.printf("%s;%.2f;%s\n", p.getNome(), p.getPeriodoRega(), p.getInformacaoRega());
        }
        gravarArq.close();
    }
    
}
