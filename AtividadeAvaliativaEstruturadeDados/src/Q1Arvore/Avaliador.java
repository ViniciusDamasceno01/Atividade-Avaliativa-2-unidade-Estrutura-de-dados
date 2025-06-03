package Q1Arvore;

public class Avaliador {

	public static double avaliar(Celula celula) {
		if (!celula.ehOperador()) {
			return Double.parseDouble(celula.valor);
		}

		double esquerda = avaliar(celula.esquerda);
		double direita = avaliar(celula.direita);

		switch (celula.valor) {
		case "+":
			return esquerda + direita;
		case "-":
			return esquerda - direita;
		case "*":
			return esquerda * direita;
		case "/":
			return esquerda / direita;
		default:
			throw new IllegalArgumentException("Operador inválido: " + celula.valor);
		}
	}
}
