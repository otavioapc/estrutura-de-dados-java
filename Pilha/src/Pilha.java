
public class Pilha {

	// Atributos

	private No topo;
	private int n;

	// Construtor

	public Pilha() {

		topo = null;
		n = 0;

	}

	// Métodos

	public int size() {

		return n;

	}

	// Insere na pilha

	public void push(int elemento) {

		No novo = new No(elemento);

		if (topo == null) {
			topo = novo;

		} else {

			novo.proximo = topo;
			topo = novo;

		}

		n++;

	}

	public int pop() {

		int elemento = topo.elemento;

		topo = topo.proximo;
		n--;

		return elemento;

	}

	public void listar() {

		int i;
		No atual = topo;

		for (i = 0; i < n; i++) {
			System.out.print(atual.elemento + " ");
			atual = atual.proximo;

		}
		System.out.println();

	}

}
