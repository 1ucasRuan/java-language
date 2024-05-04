import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int numero; 
        String agencia; 
        String nomeCliente; 
        Double saldo;
        
        System.out.print("Informe seu nome: ");
        nomeCliente = teclado.nextLine();

        System.out.print("Informe a agencia: ");
        agencia = teclado.nextLine();

        System.out.print("Informe o numero da conta: ");
        numero = teclado.nextInt();

        System.out.print("Informe seu saldo: ");
        saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente +  " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " "+ numero + " e seu saldo " + saldo + " já está disponível para saque");

        teclado.close();
        

    }
}
