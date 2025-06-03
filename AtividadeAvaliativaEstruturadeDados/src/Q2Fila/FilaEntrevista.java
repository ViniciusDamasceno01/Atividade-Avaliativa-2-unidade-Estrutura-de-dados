package Q2Fila;

public class FilaEntrevista {

	private Celula inicio;
	private Celula fim;

	public FilaEntrevista() {
		this.inicio = this.fim = null;
	}

	public void inserir(String nome) {
		Celula nova = new Celula(nome);
		if (inicio == null) {
			inicio = fim = nova;
		} else {
			fim.proximo = nova;
			fim = nova;
		}
		System.out.println("Entrevistado inserido na fila: " + nome);
	}

	public void proximoEntrevistado() {
		if (inicio == null) {
			System.out.println("Fila vazia. Nenhum entrevistado.");
		} else {
			System.out.println("Entrevistado chamado: " + inicio.nome);
			inicio = inicio.proximo;
			if (inicio == null) {
				fim = null;
			}
		}
	}

	public boolean estaVazia() {
		return inicio == null;
	}
}
