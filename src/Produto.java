public class Produto {
	private String nomeDoProduto;
	private double precoDeCusto;
	private double precoDeVenda;
	private int margemDeLucro;
	private double despesasEmpresa;
	
	public void calcularMargemDeLucro() {
		margemDeLucro = (int) (((precoDeVenda - (precoDeCusto + despesasEmpresa)) / precoDeVenda) * 100);
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public double getPrecoDeCusto() {
		return precoDeCusto;
	}

	public void setPrecoDeCusto(double precoDeCusto) {
		this.precoDeCusto = precoDeCusto;
	}

	public double getPrecoDeVenda() {
		return precoDeVenda;
	}

	public void setPrecoDeVenda(double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}

	public double getDespesasEmpresa() {
		return despesasEmpresa;
	}

	public void setDespesasEmpresa(double despesasEmpresa) {
		this.despesasEmpresa = despesasEmpresa;
	}

	public int getMargemDeLucro() {
		return margemDeLucro;
	}
	
	
}
