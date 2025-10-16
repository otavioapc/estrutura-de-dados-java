
public class Fila {

	// Atributos

	private No inicio;
	private No fim;
	private int n;

	// Construtor

	public Fila() {

		inicio = null;
		fim = null;
		n = 0;

	}

	// Métodos

	public int size() {
		return n;

	}

	public void enfileirar(int elemento) {

		No novo = new No(elemento);

		if (inicio == null && fim == null) {
			inicio = novo;
			fim = novo;

		}
		else {
			fim.proximo = novo;
			fim = novo;
			
		}
		n++;
	}
	
	public int desenfileirar() {
		
		int elemento = inicio.elemento;
		
		inicio = inicio.proximo;
		
		n--;
		
		return elemento;
		
	}
	
	public void imprimirFila() {		
		
	    No atual = inicio; // Use uma variável temporária para percorrer a fila
	    while (atual != null) {
	        System.out.print(atual.elemento + " ");
	        atual = atual.proximo;
	    }
	    System.out.println();
		
	}

}
