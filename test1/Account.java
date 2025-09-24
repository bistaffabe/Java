//package Account;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        int variavel,variavel1;

        System.out.println("\nOlá, seja bem-vindo!");
        System.out.println("\n1. Gerente");
        System.out.println("\n2. CLiente");

        System.out.print("\nEscolha uma opção: ");
        variavel = scanner.nextInt();

        switch (variavel) {
            case 1:
            // Criar nova conta (corrente, poupança ou especial)
            // Visualizar informações de conta (a senha não deve ser exibida), através do número da conta
                System.out.println("O que voce deseja realizar?");
                System.out.println("\n1. Criar nova conta");
                System.out.println("\n2. Visualizar informacoes da conta");
                System.out.print("\nEscolha uma opção: ");
                variavel1 = scanner.nextInt();
                switch(variavel1){
                    case 1:
                    System.out.print("Digite o nome: ");
                    int nomeConta = scanner.nextInt();

                    scanner.nextLine(); // consumir o \n restante

                    System.out.print("Digite o número da conta: ");
                    int numeroConta = scanner.nextInt();

                    System.out.print("Digite o número da conta: ");
                    int numeroConta = scanner.nextInt();





                        
                }

                break;
            case 2:
                // código a ser executado se variavel == valor2
                break;
        
            default:
            System.out.println("Opção inválida!");
       

           Date abertura = new Date(7,8,2005);
           Account conta = new Account("Beatriz", 12345, 5000.0, abertura);
           System.out.println("Conta de: " + conta.getName());
        
    }
}
