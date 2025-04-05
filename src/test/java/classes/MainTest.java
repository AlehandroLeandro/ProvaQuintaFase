package classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testCaixaSalarioFixo() {
        Caixa caixa = new Caixa();
        caixa.setNome("João");
        caixa.setSalarioBase(2000.0);
        assertEquals(2000.0, caixa.salario());
    }

    @Test
    public void testCaixaSalarioNegativo() {
        Caixa caixa = new Caixa();
        caixa.setNome("Maria");
        caixa.setSalarioBase(-500.0);
        assertEquals(0.0, caixa.salario());
    }

    @Test
    public void testVendedorComissao() {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Pedro");
        vendedor.setSalarioBase(1000.0);
        vendedor.setQntVendas(10);
        vendedor.setVlComissao(50.0);
        assertEquals(1500.0, vendedor.salario());
    }

    @Test
    public void testVendedorComissaoNegativa() {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Ana");
        vendedor.setSalarioBase(1000.0);
        vendedor.setQntVendas(5);
        vendedor.setVlComissao(-30.0);
        assertEquals(1000.0, vendedor.salario());
    }

    @Test
    public void testRepositorHorasTrabalhadas() {
        Repositor repositor = new Repositor();
        repositor.setNome("Carlos");
        repositor.setSalarioBase(50.0);
        repositor.setHorasTrabalhadas(40.0);
        assertEquals(2000.0, repositor.salario());
    }

    @Test
    public void testRepositorHorasNegativas() {
        Repositor repositor = new Repositor();
        repositor.setNome("Luiza");
        repositor.setSalarioBase(50.0);
        repositor.setHorasTrabalhadas(-10.0);
        assertEquals(0.0, repositor.salario());
    }

    @Test
    public void testSegurancaSemNoturno() {
        Seguranca seguranca = new Seguranca();
        seguranca.setNome("Marcos");
        seguranca.setSalarioBase(1500.0);
        assertEquals(1500.0, seguranca.salario());
    }

    @Test
    public void testSegurancaComNoturno() {
        Seguranca seguranca = new Seguranca();
        seguranca.setNome("Julia");
        seguranca.setSalarioBase(1500.0);
        seguranca.setTrabalhoNoturno();
        assertEquals(1800.0, seguranca.salario());
    }

    @Test
    public void testFaxineiroSemTurnosExtras() {
        Faxineiro faxineiro = new Faxineiro();
        faxineiro.setNome("Beatriz");
        faxineiro.setSalarioBase(1200.0);
        faxineiro.setTurnosExtras(0);
        faxineiro.setValorTurnoExtra(50.0);
        assertEquals(1200.0, faxineiro.salario());
    }

    @Test
    public void testFaxineiroComTurnosExtras() {
        Faxineiro faxineiro = new Faxineiro();
        faxineiro.setNome("Rafael");
        faxineiro.setSalarioBase(1200.0);
        faxineiro.setTurnosExtras(3);
        faxineiro.setValorTurnoExtra(50.0);
        assertEquals(1350.0, faxineiro.salario());
    }

    @Test
    public void testFaxineiroTurnosNegativos() {
        Faxineiro faxineiro = new Faxineiro();
        faxineiro.setNome("Sofia");
        faxineiro.setSalarioBase(1200.0);
        faxineiro.setTurnosExtras(-2);
        faxineiro.setValorTurnoExtra(50.0);
        assertEquals(1200.0, faxineiro.salario());
    }

    @Test
    public void testFaxineiroValorTurnoNegativo() {
        Faxineiro faxineiro = new Faxineiro();
        faxineiro.setNome("Lucas");
        faxineiro.setSalarioBase(1200.0);
        faxineiro.setTurnosExtras(2);
        faxineiro.setValorTurnoExtra(-50.0);
        assertEquals(1200.0, faxineiro.salario());
    }

}