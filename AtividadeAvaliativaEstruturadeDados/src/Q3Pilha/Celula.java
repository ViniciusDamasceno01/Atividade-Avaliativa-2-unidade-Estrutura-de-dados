package Q3Pilha;

public class Celula {

	String servico;
	Celula proximo;

	public Celula(String servico) {
		this.servico = servico;
		this.proximo = null;
	}
}
