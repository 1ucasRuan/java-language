
package funcoesRecursiva;
public class CombinarCaractere {
	static void combinacoes(String palavra, String estado, int qtdLetra) {
	     
		if(qtdLetra == 0) { 
	         System.out.println(estado);
	         return;
	     }
	     for(int i = 0; i < palavra.length(); i++) {
	         String x = estado + palavra.charAt(i);
	         String y = palavra.substring(0, i) + palavra.substring(i + 1);
	         combinacoes(y, x, qtdLetra - 1);
	     }
	 }
	
	 public static void main(String[] args) {
     combinacoes("ABCDE","", 5); 
	 } 
}



