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
public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado(int r, String n, String dta, double tx){
        super(r, n, dta);
        
        taxaComissao = tx;
    }
    
    public void setSalBase(double s){
        salBase = s;
    }
    public double getSalBase(){
        return salBase;
    }
    
    public double getTotalVendas(){
        return totalVendas;
    }
    
    public double getTaxaComissao(){
        return taxaComissao;
    }
    
    public void addVendas(double venda){
        totalVendas += venda;
    }
    
    public double calcSalBruto () {
        return salBase + (taxaComissao / 100 * totalVendas);
    }
    
    public double calcGratificacao(){
        if (totalVendas <= 5000){
            return 0;
        } else if (totalVendas <= 10000) {
            return calcSalBruto() * 0.03;
        } else 
            return calcSalBruto() *0.05;
    }
    
    public double calcSalLiquido(){
        return super.calcSalLiq() + calcGratificacao();
    }
}
    
