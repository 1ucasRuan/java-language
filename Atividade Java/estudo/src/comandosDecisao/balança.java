package comandosDecisao;

import java.util.Scanner;

public class balança {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double ganhar, perder, peso, pesoInicial;

		System.out.print("Digite o peso atual: ");
		pesoInicial = input.nextDouble();
		input.nextLine();

		ganhar = pesoInicial * 0.15;
		peso = pesoInicial + ganhar;
		System.out.println("Peso se engordar 15%: " + peso);

		perder = pesoInicial * 0.20;
		peso = pesoInicial - perder;
		System.out.println("Peso se emagrecer 20%: " + peso);
	}
}
