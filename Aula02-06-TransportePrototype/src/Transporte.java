public interface Transporte extends Cloneable {
    void andar();
    void valorDoAluguel();
    Transporte clone() throws CloneNotSupportedException;
}
