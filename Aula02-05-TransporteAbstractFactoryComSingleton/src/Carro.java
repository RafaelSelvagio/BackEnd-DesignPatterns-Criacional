
public class Carro implements Transporte {
    @Override
    public void andar() {
        System.out.println("Dirigindo um carro");
    }

    @Override
    public void valorDoAluguel() {
        System.out.println("O valor do aluguel do carro é R$100,00 o dia.");
    }
}