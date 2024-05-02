package comandosRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double altura, base, area, media = 0;

		ArrayList<Double> lista = new ArrayList<Double>();

		System.out.print("Informe a altura do triangulo: ");
		altura = input.nextDouble();

		System.out.print("Informe a base do triangulo: ");
		base = input.nextDouble();

		for (int i = 0; i < 5; i++) {
			area = (altura * base) / 2;

			lista.add(area);

			System.out.print("Informe a altura do triangulo: ");
			altura = input.nextDouble();

			System.out.print("Informe a base do triangulo: ");
			base = input.nextDouble();
		}
		for (int i = 0; i < lista.size(); i++) {
			media = media + lista.get(i);
		}
		media = media / 5;
		System.out.println("Media Geral de todos os triangulos: " + media);
		for (Double i : lista)
			System.out.println(i);
	}
}
