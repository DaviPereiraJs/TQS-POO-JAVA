public class Main {
    public static void main(String[] args) {
        // Instanciando os dois objetos com seus saldos iniciais
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // 1. Ajustando a taxa de juros anual para 4% (0.04)
        SavingsAccount.modifyInterestRate(0.04);

        System.out.println(" Saldos com taxa de juros de 4% ao ano");
        System.out.println("Mês \t Saver 1 \t Saver 2");
        
        // calculando e exibindo os juros para os 12 meses
        for (int mes = 1; mes <= 12; mes++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            
            // %d é para número inteiro, %.2f formata para 2 casas decimais
            System.out.printf("%d \t $ %.2f \t $ %.2f\n", 
                              mes, saver1.getSavingsBalance(), saver2.getSavingsBalance());
        }

        // 2 ajustando a taxa de juros anual para 5% (0.05)
        System.out.println("\n--- Mudança de taxa: Ajustando para 5% ao ano ---");
        SavingsAccount.modifyInterestRate(0.05);
        
        // calculando o juros do próximo mês (mês 13) com a nova taxa
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.println("Mês \t Saver 1 \t Saver 2");
        System.out.printf("13 \t $ %.2f \t $ %.2f\n", 
                          saver1.getSavingsBalance(), saver2.getSavingsBalance());
    }
}