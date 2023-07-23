public class BicicletaBuilder implements TransportBuilder {
    @Override
    public Transporte build() {
        return new Bicicleta();
    }
}
