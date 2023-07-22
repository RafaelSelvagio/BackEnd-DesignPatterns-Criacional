
public class AbstractFactoryImpl implements AbstractFactory {
	
	private final String identificador = "SENAI " + String.valueOf(Math.random());
	
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
