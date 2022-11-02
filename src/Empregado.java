public class Empregado {
	private int id;
	private String primeiroNome;
	private String sobrenome;
	private double salarioMensal;
	private boolean vetorDiasTrabalhados[];
	private int diasTrabalhados = 0;

	public Empregado(int id, String primeiroNome, String sobrenome) {
		this.id = id;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		vetorDiasTrabalhados = new boolean[30];
	}

	
	public void preencherDiasTrabalhados(int dia, boolean bolean) {
		dia--;
		vetorDiasTrabalhados[dia] = bolean;
	}
	
	public void verificarDiasTrabalhados() {
		for (boolean b : vetorDiasTrabalhados) {
			if(b == true) 
			diasTrabalhados++;	
		}
	}
	
	public void calcularAcrescimoDecrescimo() {
		verificarDiasTrabalhados();
		if(diasTrabalhados == 30)
			salarioMensal = salarioMensal + (salarioMensal/100);
		else if(diasTrabalhados >= 25 && diasTrabalhados <= 27)
			salarioMensal = salarioMensal - ((salarioMensal/100)*2);
		else if(diasTrabalhados >= 20 && diasTrabalhados <= 24)
			salarioMensal = salarioMensal - ((salarioMensal/100)*3);
		else if(diasTrabalhados < 20)
			salarioMensal = (salarioMensal/100) * 20;
	}
	
	
	
	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public int getId() {
		return id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

}
