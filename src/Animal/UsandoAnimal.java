/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Animal;

import Classes.Cachorro;

/**
 *
 * @author PICHAU
 */
public class UsandoAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cria um objeto da classe Cachorro
        Cachorro cachorro = new Cachorro("Max", 5, "Pastor Alemão");

        // Acessa os métodos da classe-pai e da classe-filha
        cachorro.comer();
        cachorro.dormir();
        cachorro.latir();

        // Imprime o nome e a raça do cachorro
        System.out.println("O cachorro se chama " + cachorro.getNome() + " e é da raça " + cachorro.getRaca() + ".");
    }
    
}
