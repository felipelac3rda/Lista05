
public class Controle {

	private int volume = 0;
	private int canal = 0;

	public int visualizarVolume() {
		return volume;
	}

	public int visualizarCanal() {
		return canal;
	}

	public void mudarCanal(int canal) {
		this.canal = canal;
	}

	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
	
}
