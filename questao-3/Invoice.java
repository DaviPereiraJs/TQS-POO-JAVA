public class Invoice {
    // instanciando os objetos
    private String number;
    private String description;
    private int quantity;
    private double pricePerItem; 

    // construtor
    public Invoice(String number, String description, int quantity, double pricePerItem){
        this.number = number;
        this.description = description;

        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }

        if (pricePerItem < 0) {
            this.pricePerItem = 0.0;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }

    public double getInvoiceAmount(){
        return quantity * pricePerItem;
    }

    // tratamento de quantidade e preço
    public void setQuantity(int quantity){
        if(quantity < 0){
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public void setPricePerItem(double pricePerItem){
        if(pricePerItem < 0){
            this.pricePerItem = 0.0;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }


    // metodos get
    public String getNumber(){
        return number;
    }

    public String getDescription(){
        return description;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPricePerItem(){
        return pricePerItem;
    }
}
