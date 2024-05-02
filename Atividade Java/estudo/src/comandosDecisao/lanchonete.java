package comandosDecisao;

import java.util.Scanner;

public class lanchonete {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sanduiche;
		double fatiaQueijoPresunto = 0.05, hamburguer = 0.10, kilo;

		System.out.print("Digite a quantidade de sanduiches: ");
		sanduiche = input.nextInt();
		input.nextLine();

		kilo = sanduiche * fatiaQueijoPresunto * 2;
		System.out.println("Kilos de Queijo: " + kilo);

		kilo = sanduiche * fatiaQueijoPresunto;
		System.out.println("Kilos de Presunto: " + kilo);

		kilo = sanduiche * hamburguer;
		System.out.println("Kilos de Hamburguer: " + kilo);
	}
}
