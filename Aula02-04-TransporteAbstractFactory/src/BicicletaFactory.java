

public class BicicletaFactory implements TransporteFactory {
    public Transporte criarTransporte() {
        return new Bicicleta();
    }
}