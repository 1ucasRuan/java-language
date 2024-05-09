import java.util.Scanner;

public class ContaTerminal {

    public static void menuInicio() {
        String menu = "Inicio \n 1-Sacar \n 2-Depositar \n 3-Consultar Saldo \n 0-Sair \n Escolha uma Opção: ";
        System.out.print(menu);
    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double saldo = 100;
        Boolean continuar = true;

        while (continuar) {// Loop infinito para manter o programa em execução até que o usuário decidasair
            menuInicio();
            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:// Sacar saldo
                    if (saldo > 0) {
                        System.out.print(" Saldo atual: " + saldo);
                        System.out.print("\n Informe o valor que deseja retirar: ");
                        double sacar = teclado.nextDouble();
                        saldo = saldo - sacar;
                    } else {
                        System.err.println("Não há valores a retirar!");
                    }
                    break;

                case 2:// Depositar saldo
                    System.out.print(" Saldo atual: " + saldo);
                    System.out.print("\n Informe o valor que deseja depositar: ");
                    double depositar = teclado.nextDouble();
                    saldo = saldo + depositar;
                    break;

                case 3:// Consultar Saldo atual
                    System.out.println(" Saldo atual: " + saldo);
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Programa encerrado!");
                    break;

                default: // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }
        System.out.println(saldo);
        teclado.close();
    }
}
