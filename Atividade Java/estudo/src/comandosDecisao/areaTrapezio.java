package comandosDecisao;

import java.util.Scanner;

public class areaTrapezio {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float baseMaior, baseMenor, altura, area;
		
		System.out.print("Insira o tamanho da base maior: ");
		baseMaior = input.nextFloat();
		input.nextLine();
		
		System.out.print("Insira o tamanho da base menor: ");
		baseMenor = input.nextFloat();
		input.nextLine();
		
		System.out.print("Insira a altura: ");
		altura = input.nextFloat();
		input.nextLine();
		
		area = (baseMaior + baseMenor) * altura / 2;
		
		System.out.println("Area do triangulo: " + area);
	}
}
