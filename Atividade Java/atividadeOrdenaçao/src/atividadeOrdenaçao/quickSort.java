package atividadeOrdenaçao;

public class quickSort {
	public static void quicksort(int v[], int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		int pivo = v[(esq + dir) / 2];
		int troca;

		while (esq <= dir) {
			while (v[esq] < pivo) {
				esq = esq + 1;
			}
			while (v[dir] > pivo) {
				dir = dir - 1;
			}
			if (esq <= dir) {
				troca = v[esq];
				v[esq] = v[dir];
				v[dir] = troca;
				esq = esq + 1;
				dir = dir - 1;
			}
		}
		if (dir > esquerda) quicksort(v, esquerda, dir);

		if (esq < direita) quicksort(v, esq, direita);
	}

	public static void main(String args[]) {

		int vetor[] = { 5, 8, 7, 1, 10, 2, 4, 12, 9, 3, 13, 11 };

		quicksort(vetor, 0, vetor.length - 1);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(" " + vetor[i]);
		}
	}
}
