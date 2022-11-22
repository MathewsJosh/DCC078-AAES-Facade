package padroesestruturais.facade;

public class LojaFacade {

    public static boolean verificarDisponibilidadeProduto(Loja loja) {
        if (Almoxarifado.getInstancia().verificarVendaEmEspera(loja)) {
            return false;
        }
        if (RecursosHumanos.getInstancia().verificarVendaEmEspera(loja)) {
            return false;
        }
        if (Entrega.getInstancia().verificarVendaEmEspera(loja)) {
            return false;
        }
        return true;
    }
}
