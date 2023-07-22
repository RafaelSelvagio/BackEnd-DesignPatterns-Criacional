
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FactoryTransporte factory = new BicicletaFactory();
		Transporte transporte = factory.criarTransporte();
		transporte.andar();
		transporte.valorDoAluguel();
	}

}
