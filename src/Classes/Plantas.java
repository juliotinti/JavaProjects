/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Júlio Tinti de Andrade
 */
public class Plantas 
{
    private String nome;
    private double periodoRega; 
    private String informacaoRega; 

    public Plantas(String nome, double periodoRega, String informacaoRega) 
    {
        this.nome = nome;
        this.periodoRega = periodoRega;
        this.informacaoRega = informacaoRega;
    }

    public Plantas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public double getPeriodoRega()
    {
        return periodoRega;
    }

    public void setPeriodoRega(double periodoRega) 
    {
        this.periodoRega = periodoRega;
    }

    public String getInformacaoRega() 
    {
        return informacaoRega;
    }

    public void setInformacaoRega(String informacaoRega) 
    {
        this.informacaoRega = informacaoRega;
    }

    @Override
    public String toString() 
    {
        return String.format(" %s: Rege de %.2f em %.2f dias \n Informacoes detalhadas: %s\n", nome, periodoRega, periodoRega, informacaoRega); 
    }
   
    
    
}
