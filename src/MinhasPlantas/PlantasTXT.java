/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MinhasPlantas;

import Classes.Plantas;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;

/**
 *
 * exercicio 17
 */
public class PlantasTXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        FileReader arq = new FileReader("minhasPlantas.txt");
        BufferedReader lerArq = new BufferedReader(arq);    
        String nome, infoRega, linha, partes[];
        double periodoRega; 
        linha = lerArq.readLine();
        while (linha != null) 
        {
            partes = linha.split(";");
            nome = partes[0];
            periodoRega = Double.parseDouble(partes[1]);
            infoRega = partes[2];
            Plantas p = new Plantas (nome, periodoRega, infoRega);

            System.out.printf("%s\n", p.toString());

            linha = lerArq.readLine();
        }
        lerArq.close();
    }
    
}
