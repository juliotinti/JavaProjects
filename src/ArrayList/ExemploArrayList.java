/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * exercio 18
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);

        String info, car;
        ArrayList<String> carros = new ArrayList<String>();
        //Adicionando alguns nomes so para exemplo
        carros.add("Fusca");
        carros.add("Gol");
        carros.add("Kwid");

        while(true)
        {
            System.out.println("Carros da lista: \n" + carros);
            System.out.println("\n\nEssa eh uma lista com nome de carros, deseja adicionar ou retirar um carro da lista: ");
            System.out.println("(Digite R para retirar e A para adicionar; ou digite FIM para acabar)");
            info = ler.nextLine();  
            if (info.equalsIgnoreCase("FIM")) {
               break; 
            }
            if(info.equalsIgnoreCase("a"))
            {
                System.out.println("Qual o nome do carro: ");
                car = ler.nextLine();
                carros.add(car);
            }
            if(info.equalsIgnoreCase("r"))
            {
                System.out.println("Qual o carro gostaria de remover dentre os abaixo: ");
                System.out.println(carros);
                car = ler.nextLine();
                for(String c : carros)
                {
                    if(c.equalsIgnoreCase(car))
                    {
                        carros.remove(carros.indexOf(c));                        
                    }
                }
            }
        }

    }
    
}
