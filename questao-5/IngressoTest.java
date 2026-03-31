public class IngressoTest {
    public static void main(String[] args) {
        Ingresso comum = new Ingresso(50.0);

        VIP especial = new VIP(50.0, 30.0);

        System.out.println("Ingresso Comum");
        comum.imprimeValor();

        System.out.println("Ingresso VIP");
        System.out.println("Valor total com adicional: R$ " + especial.getValorVIP());

    }
}
