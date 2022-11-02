public class Pessoa {
	private int idade = 0;
	private int diaNascimento = 0;
	private int mesNascimento = 0;
	private int anoNascimento = 0;
	private String nomePessoa = "";

	public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
		int idade = anoAtual - anoNascimento;
		int mes = mesAtual - mesNascimento;
		int dia = diaAtual - diaNascimento;

		if (idade > 0) {
			if (mes == 0 && dia <= 0) {
				idade++;
			} else if (mes < 0) {
				idade--;
			}
		}

		this.idade = idade;
	}

	public int informaIdade() {
		return idade;
	}
	
	public String informaNome() {
		return nomePessoa;
	}

	public void ajustaDataDeNascimento(int diaNascimento, int mesNascimento, int anoNascimento) {
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	
	
	
}
