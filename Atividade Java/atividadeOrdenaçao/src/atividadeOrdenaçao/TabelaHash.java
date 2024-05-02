package atividadeOrdenaçao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TabelaHash {
	public static void main(String[] args) throws IOException {

		List<Integer> lista = soma();

		int n = maior(lista);

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < lista.size(); j++) {
				if (lista.get(j) == i) {
					vetor[i]++;
				}
			}
		}
		// imprimindo as chaves
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

		criarArquivo(vetor);
	}

	public static int maior(List<Integer> lista) {
		int maior = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (i == 0) {
				maior = lista.get(i);
			} else {
				if (lista.get(i) > maior) {
					maior = lista.get(i);
				}

			}
		}
		return maior;
	}

	public static ArrayList<Integer> soma() {

		ArrayList<Integer> chave = new ArrayList<Integer>();
		try {

			String nome1 = null;

			BufferedReader leitor = new BufferedReader(
					new FileReader("C:\\Users\\lucas\\Documents\\atividade hash\\dico.txt"));
			while ((nome1 = leitor.readLine()) != null) {

				int somador = 0;
				int valor = 0;
				for (int i = 0; i < nome1.length(); i++) {
					valor = nome1.charAt(i) - 65;
					;
					somador += valor;
				}
				chave.add(somador);

				somador = 0;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return chave;
	}

	public static void criarArquivo(int[] vetor) {
		try {

			BufferedWriter escritor = new BufferedWriter(
					new FileWriter("C:\\Users\\lucas\\Documents\\atividade hash\\novo doc.txt"));

			for (int i = 0; i < vetor.length; i++) {
				escritor.write(i + ";" + vetor[i]);
				escritor.newLine();
			}
			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
