public class Bicicleta implements Transporte {
    @Override
    public void andar() {
        System.out.println("A bicicleta está andando");
    }

    @Override
    public void valorDoAluguel() {
        System.out.println("O aluguel da bicicleta é $10 por dia");
    }

    @Override
    public Transporte clone() throws CloneNotSupportedException {
        return (Bicicleta) super.clone();
    }
}
