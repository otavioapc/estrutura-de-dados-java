import java.util.Scanner;

public class TestarInsercao {

	public static void main(String[] args) {
		
		int vetor[];
		String palavras[];
		int i, n;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o número de elementos:");
		n = teclado.nextInt();

		vetor = new int[n];

		System.out.println("Entre com os elementos:");
		for (i = 0; i < n; i++) {
			vetor[i] = teclado.nextInt();
		}

		Ordenacao ord = new Ordenacao(n, vetor);
		
		ord.insercaoInt();
		ord.imprimeInt();

	}

}
