

public class MotoFactory implements TransporteFactory {
    public Transporte criarTransporte() {
        return new Moto();
    }
}