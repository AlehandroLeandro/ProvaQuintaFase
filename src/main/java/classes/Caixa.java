package classes;

import javax.swing.*;

public class Caixa {
    private String nome;
    private double salarioBase;


    public double salario(){
        return salarioBase;
    }


    public Caixa(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Caixa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0){
            JOptionPane.showMessageDialog(null, "Salário inválido");
            this.salarioBase = 0;
        }else {
            this.salarioBase = salarioBase;
        }
    }

    public String exibirInfo(){
        return "Nome: " + this.nome + ", salário : R$" + salario();
    }
}
