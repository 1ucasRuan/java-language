package atividadeOrdenaçao;

public class OrdenaçaoFlutuaçao {
	public static void main(String[] args) {

		int[] vetor = new int[] { 5, 8, 7, 1, 4, 2, 9, 3, 6 };

		bubbleSort(vetor);

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	private static void bubbleSort(int vetor[]) {
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}
	}
}
