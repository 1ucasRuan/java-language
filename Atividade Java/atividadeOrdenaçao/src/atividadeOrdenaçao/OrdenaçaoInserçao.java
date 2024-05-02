package atividadeOrdenaçao;

public class OrdenaçaoInserçao {

	public static void OrdenaçaoInserção(int[] vetor) {
		int j, i, aux;

		for (j = 1; j < vetor.length; j++) {
			aux = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > aux); i--) {
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = aux;
		}
	}

	public static void main(String[] args) {

		int[] vetor = new int[] { 5, 2, 7, 1, 4, 8, 9, 3, 6 };

		OrdenaçaoInserção(vetor);

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
