package classes;

import javax.swing.*;

public class Repositor extends Caixa{
    private double horasTrabalhadas;
//nãousei uma variável do salário por hora. Quero usar o valor do salário base para fazer o cálculo
    @Override
    public double salario(){
        double sal = getSalarioBase();
        return sal * horasTrabalhadas;
    }


    public Repositor() {
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        if (horasTrabalhadas < 0) {
            JOptionPane.showMessageDialog(null, "Quantidade de horas trabalhadas");
            this.horasTrabalhadas = 0;
        } else {
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }
}
