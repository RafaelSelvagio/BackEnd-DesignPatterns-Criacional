

public class MotoFactory extends FactoryTransporte {
    @Override
    public Transporte criarTransporte() {
        return new Moto();
    }
}