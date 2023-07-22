

public class CarroFactory extends FactoryTransporte {
    @Override
    public Transporte criarTransporte() {
        return new Carro();
    }
}