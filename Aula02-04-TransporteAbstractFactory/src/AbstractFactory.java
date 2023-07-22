
public interface AbstractFactory {
	TransporteFactory criarTransporteFactory(String tipo);

	void getIdentificador();
}
