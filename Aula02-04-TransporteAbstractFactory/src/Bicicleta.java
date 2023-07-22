
public class Bicicleta implements Transporte {
    @Override
    public void andar() {
        System.out.println("Pedalando uma bicicleta");
    }
    
    @Override
    public void valorDoAluguel() {
        System.out.println("O valor do aluguel da bicicleta é R$10,00 o dia.");
    }
}