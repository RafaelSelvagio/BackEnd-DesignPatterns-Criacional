public class CarroBuilder implements TransportBuilder {
    @Override
    public Transporte build() {
        return new Carro();
    }
}