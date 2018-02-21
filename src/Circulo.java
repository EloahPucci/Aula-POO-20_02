
public class Circulo {
	private int raio;
	
	public double calcularArea() {
		return Math.pow(raio, 2) * 3.1416;
	}
	
	public double calculaPerimetro() {
		return 2 * 3.1416 * raio;
	}

	public Circulo(int raio) {
		super();
		this.raio = raio;
	}

}
