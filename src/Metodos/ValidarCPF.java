/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author PICHAU
 */
public class ValidarCPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //System.out.println(315%11);
        Scanner ler = new Scanner(System.in);
        while(true)
        {
            System.out.println("\nDigite seu CPF: ");
            System.out.println("Modelo: xxx.xxx.xxx-xx\n");
            String cpf = ler.nextLine();
            if(cpf.length() != 14)
            {
                System.out.println("Erro: CPF escrito errado...\n");
                break; 
            }
            boolean infoCPF = validaCPF(cpf);   
            if(infoCPF)
            {
                System.out.printf("O CPF %s eh valido!!\n\n", cpf);
            }
            else
            {
                System.out.printf("O CPF %s nao eh valido!!\n", cpf); 
            }
        }

    }
    
    public static boolean validaCPF(String cpf)
    {
        if (cpf.equals("000.000.000-00") ||
        cpf.equals("111.111.111-11") || cpf.equals("222.222.222-22") || 
        cpf.equals("333.333.333-33") || cpf.equals("444.444.444-44") ||
        cpf.equals("555.555.555-55") || cpf.equals("666.666.666-66") ||
        cpf.equals("777.777.777-77") || cpf.equals("888.888.888-88") ||
        cpf.equals("999.999.999-99")   )
        {
            return false;  
        }        
        //Primeiro Digito
        int soma = 0, j = 10;
        for(int i = 0; i < cpf.length()-2; i++)
        {
            if(!((cpf.charAt(i)) == '.' || (cpf.charAt(i)) == '-'))
            {
                soma = soma + ((cpf.codePointAt(i)-48)*j); 
                j--;                
            }
        }
        int primeiroDigito = 11 - (soma%11); 
        if(primeiroDigito == 11 || primeiroDigito == 10)
        {
            primeiroDigito = 0;
        }
 
        //Segundo Digito
        soma = 0;
        j = 11;
        for(int i = 0; i < cpf.length()-1; i++)
        {
            if(!((cpf.charAt(i)) == '.' || (cpf.charAt(i)) == '-'))
            {
                soma = soma + ((cpf.codePointAt(i)-48)*j); 
                j--;                
            }
        }
        int segundoDigito = 11 - soma%11; 
        if(segundoDigito == 11 || segundoDigito == 10)
        {
            segundoDigito = 0;
        }
        
        if(primeiroDigito == (cpf.codePointAt(cpf.length()-2)-48) &&
           segundoDigito == (cpf.codePointAt(cpf.length()-1)-48))
        {
            return true; 
        }
        return false; 
    }
    
}
