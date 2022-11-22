package padroesestruturais.facade;

public class Loja {

    public boolean Vender() {
        return LojaFacade.verificarDisponibilidadeProduto(this);
    }
}
