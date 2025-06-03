package Q2Fila;

public class Celula {

	String nome;
	Celula proximo;

	public Celula(String nome) {
		this.nome = nome;
		this.proximo = null;
	}
}