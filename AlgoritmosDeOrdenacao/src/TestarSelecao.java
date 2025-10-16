import java.util.Scanner;

public class TestarSelecao {

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
		ord.selecaoInt();
		ord.imprimeInt();

		// ***************************\\

		System.out.println("Entre com o número de elementos:");
		n = Integer.parseInt(teclado.nextLine());

		palavras = new String[n];

		System.out.println("Entre com as palavras:");

		for (i = 0; i < n; i++) {
			palavras[i] = teclado.nextLine();
		}

		Ordenacao ord2 = new Ordenacao(n, palavras);
		ord2.selecaoStr();
		ord2.imprimeString();

	}

}
