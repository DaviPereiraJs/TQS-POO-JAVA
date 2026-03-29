// Definição da classe Employee conforme solicitado no exercício
public class Employee {
 
    // Atributos privados para garantir o encapsulamento
    private String firstName;    // Armazena o primeiro nome do funcionário
    private String lastName;     // Armazena o último nome do funcionário
    private double monthlySalary; // Armazena o salário mensal (aceita casas decimais)

    // Construtor usado para criar o objeto e dar valores iniciais aos atributos 
    public Employee (String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName; // 'this' diferencia o atributo da classe do parâmetro
        this.lastName = lastName;

        // Regra o salário só é inicializado se for um valor positivo
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

    //  'Get' servem para ler (pegar) o valor dos atributos privados
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // 'Set' servem para alterar (definir) novos valores para os atributos
    public void setFisrtName(String fisrtName) {
        this.firstName = fisrtName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // set com validação garante que o salário nunca seja negativo ou zero 
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }
}