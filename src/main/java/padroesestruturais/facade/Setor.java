package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Loja> VendasEmEspera = new ArrayList<Loja>();

    public void addVendaEmEspera(Loja loja) {
        this.VendasEmEspera.add(loja);
    }

    public boolean verificarVendaEmEspera(Loja loja) {
        return this.VendasEmEspera.contains(loja);
    }

}

