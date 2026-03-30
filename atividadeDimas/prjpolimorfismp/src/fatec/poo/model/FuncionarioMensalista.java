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
public class FuncionarioMensalista extends Funcionario{
    
   private double valSalMin;
   private double numSalMin;
   
   public FuncionarioMensalista(int r, String n, String dtAdm, double sal){
       super(r,n ,dtAdm);
       
       valSalMin = sal;
   }
   
   public void setNumSalMin(double sal){
       
      numSalMin = sal;
   }
   
   @Override
   public double calcSalBruto(){
       return valSalMin * numSalMin;
   }
   
   
}
