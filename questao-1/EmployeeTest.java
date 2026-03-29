public class EmployeeTest {
    public static void main(String[] args) {
        // intanciando objetos
        Employee emp1 = new Employee("Davi", "Nascimento", 700.00);
        Employee emp2 = new Employee("João", "Neto", 2000.00);

        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10); // aumento de 10%
        System.out.printf("Novo salário anual de %s é: %.2f%n", emp1.getFirstName(), (emp1.getMonthlySalary() * 12)); // novo salario

        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10); // o %s salva o local para uma string
        System.out.printf("Novo salário anual de %s é: %.2f%n", emp2.getFirstName(), (emp2.getMonthlySalary() * 12));
       
        
        // o printf foi usado pra montar a frase interia pra evitar de abrir e fechar aspas e adicionando o +
    }
}
