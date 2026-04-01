public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // Salário base

    public BasePlusCommissionEmployee(String firstName, String lastName, String cpf, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, cpf, grossSales, commissionRate); // Passa os dados para o CommissionEmployee
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    @Override
    public double earnings() {
        // Pega o cálculo da comissão da classe pai e soma com o salário base
        return getBaseSalary() + super.earnings(); 
    }

    @Override
    public String toString() {
        return String.format("Empregado Comissionado com Salário Base: %s%nSalário Base: $%.2f", 
                             super.toString(), getBaseSalary());
    }
}