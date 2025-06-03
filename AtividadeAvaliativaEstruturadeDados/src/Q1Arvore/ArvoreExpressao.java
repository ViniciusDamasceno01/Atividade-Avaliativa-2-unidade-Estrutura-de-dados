package Q1Arvore;

public class ArvoreExpressao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Celula raiz = new Celula("-");

		raiz.esquerda = new Celula("+");
		raiz.esquerda.esquerda = new Celula("6");
		raiz.esquerda.direita = new Celula("2");

		raiz.direita = new Celula("/");
		raiz.direita.esquerda = new Celula("12");
		raiz.direita.direita = new Celula("+");
		raiz.direita.direita.esquerda = new Celula("1");
		raiz.direita.direita.direita = new Celula("3");

		double resultado = Avaliador.avaliar(raiz);
		System.out.println("Resultado da expressão: " + resultado);
	}
}
