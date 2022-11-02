public class Circulo {
	private double raio;
	private double pi = 3.14;
	
	
	public double calcularArea() {
		return ((raio*raio)*pi);
	}
	
	public double calcularCircunferencia() {
		return (2*pi*raio);
	}
	
	public void aumentarCirculo(double percentual) {
		raio = raio + (raio*(percentual/100));
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
}
