
public class Ordenacao {

	// Atributos

	private int vetor[];
	private String palavras[];
	private int n;

	// Construtor

	public Ordenacao(int n, int vetor[]) {
		this.n = n;
		this.vetor = vetor;

	}

	public Ordenacao(int n, String palavras[]) {
		this.n = n;
		this.palavras = palavras;
	}

	// Métodos

	// Selecao

	public void selecaoInt() {

		int i, j, pos_atual, pos_menor, menor, aux;

		for (i = 0; i < n - 1; i++) {

			pos_atual = i;
			menor = vetor[i];
			pos_menor = i;

			for (j = i; j < n; j++) {
				if (vetor[j] < menor) {
					menor = vetor[j];
					pos_menor = j;
				}
			}

			aux = vetor[pos_atual];
			vetor[pos_atual] = vetor[pos_menor];
			vetor[pos_menor] = aux;

		}

	}

	public void selecaoStr() {

		int i, j, pos_atual, pos_menor;
		String menor, aux;

		for (i = 0; i < n - 1; i++) {

			pos_atual = i;
			menor = palavras[i];
			pos_menor = i;

			for (j = i; j < n; j++) {
				if (palavras[j].compareTo(menor) < 0) {
					menor = palavras[j];
					pos_menor = j;
				}
			}

			aux = palavras[pos_atual];
			palavras[pos_atual] = palavras[pos_menor];
			palavras[pos_menor] = aux;
		}

	}

	// Boblle Sort

	public void bobbleSort() {

		int i, aux;
		boolean troca;

		do {
			troca = false;

			for (i = 0; i < n - 1; i++) {

				if (vetor[i] > vetor[i + 1]) {

					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;

				}

			}

		} while (troca);

	}

	// Insercao

	public void insercaoInt() {

		int i, j, copia;

		for (i = 1; i < n; i++) {

			copia = vetor[i];
			j = i - 1;

			while (j >= 0 && copia < vetor[j]) {
				vetor[j + 1] = vetor[j];
				j--;
			}

			vetor[j + 1] = copia;

		}

	}

	// QuickSort

	public void ordenaQuickSort(int inicio, int fim) {

		int i, j, pivo, aux;

		pivo = vetor[(inicio + fim) / 2];
		i = inicio;
		j = fim;

		while (i <= j) {

			while (vetor[i] < pivo)
				i++;
			while (vetor[j] > pivo)
				j--;

			if (i <= j) {

				aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
				i++;
				j--;

			}

		}

		if (inicio < j) {
			ordenaQuickSort(inicio, j);

		}

		if (i < fim) {
			ordenaQuickSort(i, fim);
		}

	}

	public void quickSort() {

		ordenaQuickSort(0, n - 1);

	}

	public void imprimeInt() {
		int i;

		for (i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}

	public void imprimeString() {
		int i;

		for (i = 0; i < n; i++) {
			System.out.print(palavras[i] + " ");
		}
		System.out.println();
	}

	public void imprimeBobbleSort() {

		int i;

		for (i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();

	}

}
