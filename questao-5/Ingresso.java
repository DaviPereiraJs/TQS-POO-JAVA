public class Ingresso {
    protected double valor;

    // construtor da mãe 
    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println("O valor do ingresso é: " + valor);
    }
}