public class InvoiceTest {
    public static void main(String[] args) {
        Invoice teclado = new Invoice("001", "teclado Mecânico", 2, 150.00);

        // %d = double
        System.out.printf("Quantidade: %d | Preço Unitário: %.2f%n", teclado.getQuantity(), teclado.getPricePerItem());
        System.out.println("Item: " + teclado.getDescription() + " | Total: " + teclado.getInvoiceAmount());
    }
}

// "C:\Users\dn212\AppData\Local\Programs\Eclipse Adoptium\jdk-17.0.15.6-hotspot\bin\java.exe" InvoiceTest