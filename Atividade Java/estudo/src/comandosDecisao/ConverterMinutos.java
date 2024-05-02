package comandosDecisao;

import java.util.Scanner;

public class ConverterMinutos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double minutosInseridos, horas = 0, minutos = 0, segundos = 0, resto = 0;

		System.out.print("Digite o valor em minutos: ");
		minutosInseridos = input.nextDouble();

		if (minutosInseridos >= 60) {
			resto = minutosInseridos % 60;
			horas = (minutosInseridos - resto) / 60;
			minutosInseridos = resto;

			System.out.println("Horas: " + horas);
		}
		if (minutosInseridos < 60) {
			minutosInseridos = (minutosInseridos * 60);
			resto = minutosInseridos % 60;
			minutos = (minutosInseridos - resto) / 60;
			minutosInseridos = resto;

			System.out.println("Minutos: " + minutos);
		}
		segundos = minutosInseridos;

		System.out.println("Segundos: " + segundos);

	}
}