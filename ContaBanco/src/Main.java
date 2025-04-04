import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        ContaTerminal cliente1 = new ContaTerminal();

        System.out.println("Informe seu nome: ");
        cliente1.nomeCliente = scanner.nextLine();

        System.out.println("Informe o número da agência: ");
        cliente1.agenciaConta = scanner.nextLine();

        System.out.println("Informe o número da conta: ");
        cliente1.numeroConta = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Informe o saldo que deseja colocar: ");
        cliente1.saldoConta = Double.parseDouble(scanner.nextLine());
        
        cliente1.mostrarDados();
        scanner.close();
    }
}
