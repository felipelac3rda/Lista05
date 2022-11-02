public class Elevador {
	private int capacidadeElevador;
	private int totalAndares;
	private int andarAtual = 0;
	private int quantidadeDePessoas = 0;

	public Elevador(int capacidadeElevador, int totalAndares) {
		this.capacidadeElevador = capacidadeElevador;
		this.totalAndares = totalAndares;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getQuantidadeDePessoas() {
		return quantidadeDePessoas;
	}

	public void entrarPessoa() {
		if (quantidadeDePessoas < capacidadeElevador)
			quantidadeDePessoas++;
	}

	public void sairPessoa() {
		if (quantidadeDePessoas > 0)
			quantidadeDePessoas--;
	}

	public void sobeAndar() {
		if (andarAtual < totalAndares)
			andarAtual++;
	}

	public void desceAndar() {
		if (andarAtual > 0)
			andarAtual--;
	}

}
