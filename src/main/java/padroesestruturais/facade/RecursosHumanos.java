package padroesestruturais.facade;

public class RecursosHumanos extends Setor {

    private static RecursosHumanos recursosHumanos = new RecursosHumanos();

    private RecursosHumanos() {};

    public static RecursosHumanos getInstancia() {
        return recursosHumanos;
    }
}
