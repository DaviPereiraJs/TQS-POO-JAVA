public class HourlyEmployee extends Employee {
    private double wage; // Valor da hora
    private double hours; // Horas trabalhadas

    public HourlyEmployee(String firstName, String lastName, String cpf, double wage, double hours) {
        super(firstName, lastName, cpf);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() { return wage; }
    public void setWage(double wage) { this.wage = wage; }

    public double getHours() { return hours; }
    public void setHours(double hours) { this.hours = hours; }

    @Override
    public double earnings() {
        if (getHours() <= 40) { // Sem hora extra
            return getWage() * getHours();
        } else { // Com hora extra
            return (40 * getWage()) + ((getHours() - 40) * getWage() * 1.5);
        }
    }

    @Override
    public String toString() {
        return String.format("Empregado Horista: %s%nValor da Hora: $%.2f; Horas Trabalhadas: %.2f", 
                             super.toString(), getWage(), getHours());
    }
}