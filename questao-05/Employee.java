public abstract class Employee {
    private String firstName;
    private String lastName;
    private String cpf;

    // Construtor
    public Employee(String firstName, String lastName, String cpf) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
    }

    // Getters e Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    // Método abstrato: cada filho vai ter que implementar a sua forma de receber
    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s%nCPF: %s", getFirstName(), getLastName(), getCpf());
    }
}