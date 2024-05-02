package comandosDecisao;

import java.util.Scanner;

public class converterDias {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int dias, anos, meses, resto, qtdDias;

		System.out.print("Digite a quantidade de dias: ");
		qtdDias = input.nextInt();
		input.nextLine();

		if (qtdDias > 0 && qtdDias >= 360) {
			resto = qtdDias % 360;
			anos = (qtdDias - resto) / 360;
			qtdDias = resto;
			System.out.println("anos: " + anos);

			if (qtdDias >= 30) {
				resto = qtdDias % 30;
				meses = (qtdDias - resto) / 30;
				qtdDias = resto;
				System.out.println("anos: " + meses);
			}
			dias = qtdDias;
			System.out.println("anos: " + dias);
		}
	}
}
