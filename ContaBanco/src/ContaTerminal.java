public class ContaTerminal {
    int numeroConta;
    String agenciaConta;
    String nomeCliente;
    Double saldoConta;

    public void mostrarDados(){
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo de R$ " + saldoConta+ " já está disponível para saque.");
    }

}
