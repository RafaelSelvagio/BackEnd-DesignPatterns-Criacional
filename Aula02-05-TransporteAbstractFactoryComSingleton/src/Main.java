public class Main {
    public static void main(String[] args) {
    	
    	// Cria nossa fabrica de fabricas
    	AbstractFactory factory = AbstractFactoryImpl.getInstance();
    	
    	// Chama o método de identificação da classe
    	factory.getIdentificador();
    	
    	// Cria nossa fabrica de carro
        TransporteFactory transporteFactory = factory.criarTransporteFactory("carro");
        
        // Cria objeto carro
        Transporte transporte = transporteFactory.criarTransporte();
        
        
        transporte.andar();
        transporte.valorDoAluguel();
        
        

        transporteFactory = factory.criarTransporteFactory("bicicleta");
        transporte = transporteFactory.criarTransporte();
        transporte.andar();
        transporte.valorDoAluguel();
        

        transporteFactory = factory.criarTransporteFactory("moto");
        transporte = transporteFactory.criarTransporte();
        transporte.andar();
        transporte.valorDoAluguel();
    }
}