package classes;

import javax.swing.*;

public class Auxiliares {

    public static String receberNome() {
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        if (nome == null || nome.trim().isEmpty()) { // Valida null ou vazio
            JOptionPane.showMessageDialog(null, "Nome inválido");
            return receberNome();
        } else {
            return nome;
        }
    }

    public static double receberSalarioBase() {
        String salarioStr = JOptionPane.showInputDialog("Qual o salário base do funcionário?");
        if (salarioStr == null || salarioStr.trim().isEmpty() || !isNumeric(salarioStr)) {
            JOptionPane.showMessageDialog(null, "Salário inválido!");
            return receberSalarioBase();
        } else {
            return Double.parseDouble(salarioStr);
        }
    }

    public static int recebeQntVendas() {
        String qntVendas = JOptionPane.showInputDialog("Quantas vendas o vendedor fez?");
        if (qntVendas == null || qntVendas.trim().isEmpty() || !isNumeric(qntVendas) || !isInteger(qntVendas)) {
            JOptionPane.showMessageDialog(null, "Quantidade de vendas inválida!");
            return recebeQntVendas();
        } else {
            return Integer.parseInt(qntVendas);
        }
    }

    public static double recebeValorComissao() {
        String comissaoStr = JOptionPane.showInputDialog("Qual o valor da comissão do vendedor?");
        if (comissaoStr == null || comissaoStr.trim().isEmpty() || !isNumeric(comissaoStr)) {
            JOptionPane.showMessageDialog(null, "Comissão inválida!");
            return recebeValorComissao();
        } else {
            return Double.parseDouble(comissaoStr);
        }
    }

    public static double recebeHorasTrabalhadas() {
        String horasStr = JOptionPane.showInputDialog("Quantas horas o funcionário trabalhou?");
        if (horasStr == null || horasStr.trim().isEmpty() || !isNumeric(horasStr)) {
            JOptionPane.showMessageDialog(null, "Horas trabalhadas inválidas!");
            return recebeHorasTrabalhadas();
        } else {
            return Double.parseDouble(horasStr);
        }
    }

    public static int recebeTurnosExtras() {
        String turnosStr = JOptionPane.showInputDialog("Quantos turnos extras o funcionário trabalhou?");
        if (turnosStr == null || turnosStr.trim().isEmpty() || !isNumeric(turnosStr) || !isInteger(turnosStr)) {
            JOptionPane.showMessageDialog(null, "Quantidade de turnos extras inválida!");
            return recebeTurnosExtras();
        } else {
            return Integer.parseInt(turnosStr);
        }
    }

    public static double recebeValorTurnosExtras() {
        String valorTurnosStr = JOptionPane.showInputDialog("Qual o valor adicional do turno extra?");
        if (valorTurnosStr == null || valorTurnosStr.trim().isEmpty() || !isNumeric(valorTurnosStr)) {
            JOptionPane.showMessageDialog(null, "Valor do turno extra inválido!");
            return recebeValorTurnosExtras();
        } else {
            return Double.parseDouble(valorTurnosStr);
        }
    }

    // Verifica se a string é numérica (permite decimais)
    private static boolean isNumeric(String str) {
        if (str == null) return false;
        str = str.trim();
        if (str.isEmpty()) return false;

        boolean hasDecimal = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.' && !hasDecimal) {
                hasDecimal = true;
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    // Verifica se a string é um inteiro (não permite decimais)
    private static boolean isInteger(String str) {
        if (str == null) return false;
        str = str.trim();
        if (str.isEmpty()) return false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}