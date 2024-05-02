package comandosDecisao;

import java.util.Scanner;

public class loja {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double resto, valor, entrada, prestacao;

		System.out.print("Digite o valor: ");
		valor = input.nextDouble();

		resto = valor % 3;
		prestacao = (valor - resto) / 3;
		entrada = prestacao + resto;

		System.out.println("Valor da entrada: " + entrada);
		System.out.println("Prestação 2x de: " + prestacao);
	}
}
