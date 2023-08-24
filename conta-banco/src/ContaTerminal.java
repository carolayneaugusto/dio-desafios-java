import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número de sua conta: ");
        int Numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Agência!");
        String Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do saldo:");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente.concat(", obrigado por criar uma conta em nosso banco, sua agência é ".concat(Agencia).concat(", conta ") + Numero+ " e seu saldo " + Saldo + " já está disponível para saque."));


    }
}
