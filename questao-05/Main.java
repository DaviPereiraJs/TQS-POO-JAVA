public class Main {
    public static void main(String[] args) {
        // Criando um objeto de cada tipo
        SalariedEmployee salaried = new SalariedEmployee("João", "Silva", "111.111.111-11", 800.00);
        HourlyEmployee hourly = new HourlyEmployee("Maria", "Souza", "222.222.222-22", 16.75, 45); // 5 horas extras
        CommissionEmployee commission = new CommissionEmployee("Pedro", "Santos", "333.333.333-33", 10000.00, 0.06);
        BasePlusCommissionEmployee basePlus = new BasePlusCommissionEmployee("Ana", "Costa", "444.444.444-44", 5000.00, 0.04, 300.00);

        // Criando um array do tipo da Superclasse (Employee) e guardando todo mundo junto!
        Employee[] employees = new Employee[4];
        employees[0] = salaried;
        employees[1] = hourly;
        employees[2] = commission;
        employees[3] = basePlus;

        System.out.println("Processando a Folha de Pagamento Polimorficamente:\n");

        // O Polimorfismo em ação!
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee.toString()); // Chama o toString específico de cada um
            System.out.printf("Ganhos: $%.2f%n%n", currentEmployee.earnings()); // Chama o cálculo específico de cada um
        }
    }
}