public class Carro implements Transporte {
    @Override
    public void andar() {
        System.out.println("O carro está andando");
    }

    @Override
    public void valorDoAluguel() {
        System.out.println("O aluguel do carro é $100 por dia");
    }

    @Override
    public Transporte clone() throws CloneNotSupportedException {
        return (Carro) super.clone();
    }
}
