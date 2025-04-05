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
