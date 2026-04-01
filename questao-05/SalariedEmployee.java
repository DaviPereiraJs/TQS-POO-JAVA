public class SalariedEmployee extends Employee {
    private double weeklySalary;

   public SalariedEmployee(String firstName, String lastName, String cpf, double weeklySalary) {
        // Mudei o weeklySalary pelo cpf aqui no super:
        super(firstName, lastName, cpf); 
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() { return weeklySalary; }
    public void setWeeklySalary(double weeklySalary) { this.weeklySalary = weeklySalary; }

    @Override
    public double earnings() {
        return getWeeklySalary(); // O ganho é simplesmente o salário semanal fixo
    }

    @Override
    public String toString() {
        return String.format("Empregado Assalariado: %s%nSalário Semanal: $%.2f", 
                             super.toString(), getWeeklySalary());
    }
}