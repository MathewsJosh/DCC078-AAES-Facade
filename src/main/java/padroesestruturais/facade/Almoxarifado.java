package padroesestruturais.facade;

public class Almoxarifado extends Setor {

    private static Almoxarifado almoxarifado = new Almoxarifado();

    private Almoxarifado() {};

    public static Almoxarifado getInstancia() {
        return almoxarifado;
    }
}
