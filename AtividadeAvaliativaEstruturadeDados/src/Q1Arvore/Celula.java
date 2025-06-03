package Q1Arvore;

public class Celula {

	String valor;
	Celula esquerda, direita;

	public Celula(String valor) {
		this.valor = valor;
		this.esquerda = null;
		this.direita = null;
	}

	public boolean ehOperador() {
		return valor.equals("+") || valor.equals("-") || valor.equals("*") || valor.equals("/");
	}
}
