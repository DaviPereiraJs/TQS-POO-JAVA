public class CommissionEmployee extends Employee {
    private double grossSales; // Vendas brutas
    private double commissionRate; // Taxa de comissão (ex: 0.10 para 10%)

    public CommissionEmployee(String firstName, String lastName, String cpf, double grossSales, double commissionRate) {
        super(firstName, lastName, cpf);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() { return grossSales; }
    public void setGrossSales(double grossSales) { this.grossSales = grossSales; }

    public double getCommissionRate() { return commissionRate; }
    public void setCommissionRate(double commissionRate) { this.commissionRate = commissionRate; }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("Empregado Comissionado: %s%nVendas Brutas: $%.2f; Taxa de Comissão: %.2f", 
                             super.toString(), getGrossSales(), getCommissionRate());
    }
}