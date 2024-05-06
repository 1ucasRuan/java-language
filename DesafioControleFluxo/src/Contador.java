import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro");
		int parametroUm = teclado.nextInt();

		System.out.print("Digite o segundo parâmetro");
		int parametroDois = teclado.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
            System.out.println("Programa Finalizado!");
		
		}catch (ParametrosInvalidosException exception) {
            //lançando exceção
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        		
		int contagem = parametroDois - parametroUm;

        //realizar o for para imprimir os números com base na variável contagem
        for(int i = 1; i < contagem ; i++){
            System.out.println(i);
            
        }	 
	}
}
