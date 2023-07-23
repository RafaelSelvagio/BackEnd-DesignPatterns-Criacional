public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Criando um Carro e um clone do Carro
        Carro carro = new Carro();
        Carro cloneCarro = (Carro) carro.clone();

        // Ambos devem funcionar da mesma maneira
        carro.andar();
        carro.valorDoAluguel();
        cloneCarro.andar();
        cloneCarro.valorDoAluguel();

        // Criando uma Bicicleta e um clone da Bicicleta
        Bicicleta bicicleta = new Bicicleta();
        Bicicleta cloneBicicleta = (Bicicleta) bicicleta.clone();

        // Ambos devem funcionar da mesma maneira
        bicicleta.andar();
        bicicleta.valorDoAluguel();
        cloneBicicleta.andar();
        cloneBicicleta.valorDoAluguel();
    }
}
