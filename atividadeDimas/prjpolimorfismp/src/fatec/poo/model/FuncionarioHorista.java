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
public class FuncionarioHorista extends Funcionario {

    private double valHoraTrab;
    private int qntdHorasTrab;

    public FuncionarioHorista(int r, String n, String dtAdm, double valhr) {
        super(r, n, dtAdm);

        valHoraTrab = valhr;
    }

    @Override
    public double calcSalBruto() {
        return valHoraTrab * qntdHorasTrab;
    }

    public void setHoraTrab(int ht) {
        qntdHorasTrab = ht;
    }

    public double calcGratificacao() {
        return 0.075 * calcSalBruto();
    }
    
    @Override 
    public double calcSalLiq(){
        return super.calcSalLiq() + calcGratificacao();
    }

}
