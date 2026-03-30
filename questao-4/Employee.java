
public class Employee {
    // instanciando os objetos
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // construtor
    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary < 0){
            this.monthlySalary = 0;
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    // metodos set
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary){
        if (monthlySalary < 0){
            this.monthlySalary = 0.0;
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    // metodos get
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }

    // metodo do salario anual
    public double getAnnualSalary(){
        return monthlySalary * 12;
    }

    // applyRaise é usado pra atualizar o valor do atributo e o aumento em 10%
    public void applyRaise(){
        this.monthlySalary = monthlySalary * 1.10;
    }
}
