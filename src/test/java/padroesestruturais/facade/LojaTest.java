package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    void deveRetornarPendenciaAlmoxarifado() {
        Loja loja = new Loja();
        Almoxarifado.getInstancia().addVendaEmEspera(loja);
        assertEquals(false, loja.Vender());
    }

    @Test
    void deveRetornarPendenciaEntrega() {
        Loja loja = new Loja();
        Entrega.getInstancia().addVendaEmEspera(loja);
        assertEquals(false, loja.Vender());
    }

    @Test
    void deveRetornarPendenciaRecursosHumanos() {
        Loja loja = new Loja();
        RecursosHumanos.getInstancia().addVendaEmEspera(loja);
        assertEquals(false, loja.Vender());
    }

    @Test
    void deveRetornarVendaSemPendencia() {
        Loja loja = new Loja();
        assertEquals(true, loja.Vender());
    }

}