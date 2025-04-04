package classes;

import javax.swing.*;

public class Faxineiro extends Caixa{
    private int turnosExtras;
    private double valorTurnoExtra;

    public Faxineiro() {

    }

    @Override
    public double salario(){
        double sal = getSalarioBase();
        return sal + turnosExtras * valorTurnoExtra;
    }

    public Faxineiro(String nome, double salarioBase, int turnosExtras, double valorExtraTurno) {
        super(nome, salarioBase);
        this.turnosExtras = turnosExtras;
        this.valorTurnoExtra = valorExtraTurno;
    }

    public int getTurnosExtras() {
        return turnosExtras;
    }

    public void setTurnosExtras(int turnosExtras) {
        if (turnosExtras < 0) {
            JOptionPane.showMessageDialog(null, "Quantidade de turnos extras inválido");
            this.turnosExtras = 0;
        } else {
            this.turnosExtras = turnosExtras;
        }
    }

    public double getValorTurnoExtra() {
        return valorTurnoExtra;
    }

    public void setValorTurnoExtra(double valorTurnoExtra) {
        if (valorTurnoExtra < 0) {
            JOptionPane.showMessageDialog(null, "Valor por turno extra inválido");
            this.valorTurnoExtra = 0;
        } else {
            this.valorTurnoExtra = valorTurnoExtra;
        }
    }
}
