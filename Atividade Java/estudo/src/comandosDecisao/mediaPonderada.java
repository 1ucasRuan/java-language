package comandosDecisao;

import java.util.Scanner;

import javax.sound.sampled.AudioSystem;

public class mediaPonderada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float nota1, nota2, nota3, mediaPonderada;

		System.out.print("Digite a nota 1:");
		nota1 = input.nextFloat();
		input.nextLine();

		System.out.print("Digite a nota 2:");
		nota2 = input.nextFloat();
		input.nextLine();

		System.out.print("Digite a nota 3:");
		nota3 = input.nextFloat();
		input.nextLine();

		mediaPonderada = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5))) / 10;
		System.out.println("Media ponderada:" + mediaPonderada);
	}

}
