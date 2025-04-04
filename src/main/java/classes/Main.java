package classes;

import javax.swing.*;
import java.util.ArrayList;

import static classes.Auxiliares.*;

public class Main {
    // aqui vai a logica do menu interativo, pode ser feito com joptionpane ou direto no console
    public static void main(String[] args) {
        ArrayList<Caixa> funcionarios = new ArrayList<>();

        int acao = 0;
        while (acao != 7) {
            acao = Integer.parseInt(JOptionPane.showInputDialog(("""
                    1 - Cadastrar Caixa
                    2 - Cadastrar Vendedor
                    3 - Cadastrar Repositor
                    4 - Cadastrar Segurança
                    5 - Cadastrar Faxineiro
                    6 - Listar funcionários
                    7 - Sair
                    """)));

            switch (acao) {

                case 1:
                    Caixa caixa = new Caixa();
                    caixa.setNome(receberNome());
                    caixa.setSalarioBase(receberSalarioBase());
                    funcionarios.add(caixa);
                    break;

                case 2:
                    Vendedor vendedor = new Vendedor();
                    vendedor.setNome(receberNome());
                    vendedor.setSalarioBase(receberSalarioBase());
                    vendedor.setQntVendas(recebeQntVendas());
                    vendedor.setVlComissao(recebeValorComissao());
                    funcionarios.add(vendedor);
                    break;

                case 3:
                    Repositor repositor = new Repositor();
                    repositor.setNome(receberNome());
                    repositor.setSalarioBase(receberSalarioBase());
                    repositor.setHorasTrabalhadas(recebeHorasTrabalhadas());
                    funcionarios.add(repositor);
                    break;

                case 4:
                    Seguranca seguranca = new Seguranca();
                    seguranca.setNome(receberNome());
                    seguranca.setSalarioBase(receberSalarioBase());
                    seguranca.setTrabalhoNoturno();
                    funcionarios.add(seguranca);
                    break;

                case 5:
                    Faxineiro faxineiro = new Faxineiro();
                    faxineiro.setNome(receberNome());
                    faxineiro.setSalarioBase(receberSalarioBase());
                    faxineiro.setTurnosExtras(recebeTurnosExtras());
                    faxineiro.setValorTurnoExtra(recebeValorTurnosExtras());
                    funcionarios.add(faxineiro);
                    break;

                case 6 :
                    StringBuilder sb = new StringBuilder();
                    sb.append("Lista de funcionários: \n");
                    for (Caixa func : funcionarios) {
                        sb.append(func.exibirInfo()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb);
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");

            }

        }
    }
}
