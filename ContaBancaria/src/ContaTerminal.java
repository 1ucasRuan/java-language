import java.util.Scanner;

public class ContaTerminal {

    public static void menuInicio() {
       String menu = "Inicio";
       System.out.println(menu);
    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair

        while (true) {
            menuInicio();
            int opcao = teclado.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas
            // pelo usuário.

            // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:

        }
        //teclado.close();

        // implementar orientação a objetos;
        // implementar listas ou matrizes;

    }
}
