

public class CarroFactory implements TransporteFactory {
    public Transporte criarTransporte() {
        return new Carro();
    }
}