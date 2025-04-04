package classes;

import javax.swing.*;

public class Seguranca extends Caixa{
    private boolean trabalhoNoturno = false;

    @Override
    public double salario(){
        double sal = getSalarioBase();
        if(trabalhoNoturno){
            return sal += sal*0.2;
        }else {
            return sal;
        }
    }
    public Seguranca(){}

    public Seguranca(String nome, double salarioBase, boolean trabalhoNoturno) {
        super(nome, salarioBase);
        this.trabalhoNoturno = trabalhoNoturno;
    }

    public boolean isTrabalhoNoturno() {
        return trabalhoNoturno;
    }

    public void setTrabalhoNoturno() {
        String trabalha = JOptionPane.showInputDialog("O guarda trabalha a noite?");
        if (trabalha.equalsIgnoreCase("sim")) {
            this.trabalhoNoturno = true;
        }
    }
}
