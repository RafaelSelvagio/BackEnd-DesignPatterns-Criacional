

public class AbstractFactoryImpl implements AbstractFactory {
	
	private static AbstractFactoryImpl INSTANCE;
	private static String identificador = "SENAI " + String.valueOf(Math.random());
	
	private AbstractFactoryImpl() {
        // construtor privado para prevenir a instanciação direta
    }
	
	// Método público e estático para acessar a única instância
    public static synchronized AbstractFactoryImpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AbstractFactoryImpl();
        }
        return INSTANCE;
    }
    
    public void getIdentificador() {
    	System.out.println("Identificador da AbstractFactoryImpl: #" + identificador);
    }

	@Override
	public TransporteFactory criarTransporteFactory(String tipo) {
		
		// Verifica se o paremetro é igual a carro
		if (tipo.equalsIgnoreCase("carro")) {
			// Retorna uma fabrica de carros
            return new CarroFactory();
        } 
		
		else if (tipo.equalsIgnoreCase("bicicleta")) {
            return new BicicletaFactory();
        }
		
		else if (tipo.equalsIgnoreCase("moto")) {
            return new MotoFactory();
        }
		
		
        throw new IllegalArgumentException("Tipo de transporte não suportado.");
    
	}

}
