package comandosDecisao;

import java.util.Scanner;

public class descontoSalario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario, aumento, desconto;
		
		System.out.print("Digite o salário: ");
		salario = input.nextDouble();
		input.nextLine();
		
		aumento = salario * 0.15;
		salario = salario + aumento;
		
		desconto = salario * 0.08;
		salario = salario - desconto;
		
		System.out.print("Salario Final: " + salario);
	}
}
