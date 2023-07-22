public class Main {
    public static void main(String[] args) {
    	

        // Cria a fabrica de carros
        FactoryTransporte factory = new CarroFactory(); 
        
        // Cria o objeto Carro
        Transporte transporte = factory.criarTransporte();
        
        // Chama o método andar()
        transporte.andar();
        
        // Chama o método valorDoAluguel
        transporte.valorDoAluguel();
        
        
        
        

        factory = new BicicletaFactory();
        transporte = factory.criarTransporte();
        transporte.andar();
        transporte.valorDoAluguel();
        
        factory = new MotoFactory();
        transporte = factory.criarTransporte();
        transporte.andar();
        transporte.valorDoAluguel();
    }
}