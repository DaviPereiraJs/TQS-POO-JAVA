public class SavingsAccount {
    // Variável estática: compartilhada por todas as contas
    private static double annualInterestRate; 

    // Variável de instância: cada conta tem o seu próprio saldo
    private double savingsBalance;

    // Construtor para inicializar o saldo da conta
    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    // Método para calcular e adicionar o juros mensal ao saldo
    public void calculateMonthlyInterest() {
        double monthlyInterest = (this.savingsBalance * annualInterestRate) / 12;
        this.savingsBalance += monthlyInterest;
    }

    // Método estático para modificar a taxa de juros de todas as contas
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Getter para podermos ler o saldo atualizado
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
}