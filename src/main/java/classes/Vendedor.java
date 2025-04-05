package classes;

import javax.swing.*;

public class Vendedor extends Caixa {
    private int qntVendas;
    private double vlComissao;

    public Vendedor() {

    }

    @Override
    public double salario() {
        double sal = getSalarioBase();
        return sal + qntVendas * vlComissao;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    public double getVlComissao() {
        return vlComissao;
    }

    public void setVlComissao(double vlComissao) {
        if (vlComissao < 0) {
            JOptionPane.showMessageDialog(null, "Comissão inválida");
            this.vlComissao = 0;
        } else {
            this.vlComissao = vlComissao;
        }
    }

}
