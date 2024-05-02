package comandosDecisao;

import java.util.Scanner;

/* Um programa para gerenciar os saques de um caixa eletrônico deve possuir algum 
mecanismo para decidir o número de notas de cada valor que deve ser disponibilizado 
para o cliente que realizou o saque. Um possível critério seria o da "distribuição ótima" 
no sentido de que as notas de menor valor fossem distribuídas em número mínimo 
possível. Por exemplo, se a quantia solicitada fosse R$ 87,00, o programa deveria 
indicar uma nota de R$ 50,00, três notas de R$ 10,00, uma nota de R$ 5,00 e duas 
notas de R$ 1,00. Escreva um programa que receba o valor da quantia solicitada e 
retorne a distribuição das notas de acordo com o critério da distribuição ótima.*/

public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valor, nota100, nota50, nota20, nota10, nota5, nota2, resto;
		
		System.out.print(" Digite o valor a receber: ");
		valor = input.nextInt();
		input.nextLine();
		
		if(valor >= 100) {
			resto = valor % 100;
			nota100 = (valor - resto) / 100;
			valor = resto;
			System.out.println(" Notas de 100: " + nota100);
		}
		if(valor >= 50) {
			resto = valor % 50;
			nota50 = (valor - resto) / 50;
			valor = resto;
			System.out.println(" Notas de 50: " + nota50);			
		}
		if(valor >= 20) {
			resto = valor % 20;
			nota20 = (valor - resto) / 20;
			valor = resto;
			System.out.println(" Notas de 20: " + nota20);		
		}
		if(valor >= 10) {
			resto = valor % 10;
			nota10 = (valor - resto) / 10;
			valor = resto;
			System.out.println(" Notas de 10: " + nota10);	
		}
		if(valor >= 5) {
			resto = valor % 5;
			nota5 = (valor - resto) / 5;
			valor = resto;
			System.out.println(" Notas de 5: " + nota5);	
		}
		if(valor >= 2) {
			resto = valor % 2;
			nota2 = (valor - resto) / 2;
			valor = resto;
			System.out.println(" Notas de 2: " + nota2);	
		}
		if(valor == 1) {
			System.out.println(" Não temos notas de 1 real: " + valor);	
		}
	}
}
