
package funcoesRecursiva;
import java.io.File;
public class DiretorioRaiz {
	
	public static void main(String[] args) {
	    File pasta1 = new File("C:\\Users\\lucas\\Documents\\pasta1");
	    File conteudo [] = pasta1.listFiles();
	    mostrarArquivo(conteudo);     
	}
	
	public static void mostrarArquivo(File[] conteudo) {	
	    for (int i = 0; i < conteudo.length; i++) {
	    	try {
		        if (conteudo[i].isDirectory());	        	
		        	 mostrarArquivo(conteudo[i].listFiles()); 		        
	    	}
	    	catch (Exception e) {    
	    		System.out.println("Arquivo: " + conteudo[i]);
		    }
		}	
	}	
}
	