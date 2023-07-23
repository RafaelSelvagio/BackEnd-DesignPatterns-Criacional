public class Main {
    public static void main(String[] args) {
        TransportBuilder carroBuilder = new CarroBuilder();
        Transporte carro = carroBuilder.build();
        carro.andar();
        carro.valorDoAluguel();

        TransportBuilder bicicletaBuilder = new BicicletaBuilder();
        Transporte bicicleta = bicicletaBuilder.build();
        bicicleta.andar();
        bicicleta.valorDoAluguel();
    }
}
