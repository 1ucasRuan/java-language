package comandosRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class ValoresNegativos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int valor, negativos = 0;

		ArrayList<Integer> lista = new ArrayList<Integer>();

		System.out.print(" Digite os valores para verificar quais são negativos: ");
		valor = input.nextInt();
		input.nextLine();

		for (int i = 0; i < 8; i++) {
			if (valor < 0) {
				lista.add(valor);
				negativos++;
			}

			System.out.print(" Digite os valores para verificar quais são negativos: ");
			valor = input.nextInt();
			input.nextLine();
		}
		for (Integer i : lista)
			System.out.println(i);

		System.out.println(" Quantidade de numeros negativos: " + negativos);
	}
}
