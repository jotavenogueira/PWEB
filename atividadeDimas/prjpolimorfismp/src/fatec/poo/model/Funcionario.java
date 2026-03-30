/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author aluno
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdimissao;
    
    public Funcionario(int r, String n, String dtAdm){
        registro = r;
        nome = n;
        dtAdimissao = dtAdm;
        
    }
    
    public abstract double calcSalBruto();
    
    public double calcDesconto(){
        return 0.1* calcSalBruto();
    }
    
    public double calcSalLiq(){
        return calcSalBruto() - calcDesconto();
    }
    
    public String getNome(){
        return nome;
        
    }
    
    public int getRegistro(){
        return registro;
    }
    
    public String getDtAdm(){
        return dtAdimissao;
    }
}
