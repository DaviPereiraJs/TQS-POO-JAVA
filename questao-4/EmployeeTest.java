public class EmployeeTest {
    public static void main(String[] args) {
        Employee funcionario1 = new Employee("Davi", "Pereira", 600);
        Employee funcionario2 = new Employee("Pedro", "Junior", 8000.00);

        // print do salario atual
        System.out.printf("Salário anual inicial de %s: %.2f%n", 
        funcionario1.getFirstName(), funcionario1.getAnnualSalary());

        System.out.printf("Salário anual inicial de %s: %.2f%n", 
        funcionario2.getFirstName(), funcionario2.getAnnualSalary());
        
        System.out.printf("%n");

        funcionario1.applyRaise(); // onde ocorre o aumento de 10%
        System.out.printf("Novo salário anual de %s é: %.2f%n", funcionario1.getFirstName(), (funcionario1.getMonthlySalary() * 12)); // novo salario

        funcionario2.applyRaise();
        System.out.printf("Novo salário anual de %s é: %.2f%n", funcionario2.getFirstName(), (funcionario2.getMonthlySalary() * 12));
    }
}
