package comandosDecisao;

import java.util.Scanner;

public class pre�oLitroGasolina {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int valor, pre�oGasolina = 5, litros;

		System.out.print("Digite o valor em R$ para saber a quantidade em litros de gasolina:");
		valor = input.nextInt();
		input.nextLine();

		litros = valor / pre�oGasolina;

		System.out.println("Quantidade em Litros:" + litros);
	}
}
