
public class Moto implements Transporte {
    @Override
    public void andar() {
        System.out.println("Pilotando uma moto");
    }
    
    @Override
    public void valorDoAluguel() {
        System.out.println("O valor do aluguel da moto é R$50,00 o dia.");
    }
}