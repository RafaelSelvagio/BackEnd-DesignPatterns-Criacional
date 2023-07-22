

public class BicicletaFactory extends FactoryTransporte {
    @Override
    public Transporte criarTransporte() {
        return new Bicicleta();
    }
}