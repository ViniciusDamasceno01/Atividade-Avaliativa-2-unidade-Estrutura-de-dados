package Q3Pilha;

public class PilhaServico {

	private Celula topo;

	public PilhaServico() {
		this.topo = null;
	}

	public void inserir(String servico) {
		Celula nova = new Celula(servico);
		nova.proximo = topo;
		topo = nova;
		System.out.println("Serviço adicionado à pilha: " + servico);
	}

	public void obterProximoServico() {
		if (topo == null) {
			System.out.println("Pilha vazia. Nenhum serviço a cumprir.");
		} else {
			System.out.println("Próximo serviço a ser cumprido: " + topo.servico);
			topo = topo.proximo;
		}
	}

	public boolean estaVazia() {
		return topo == null;
	}
}
