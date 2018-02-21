
public class Calculo {
	private int saldo = 0;
	
	public int credito(int valor) {
		return this.saldo += valor;
	}
	
	public int debito(int valor) {
		return this.saldo -= valor;
	}

	public int getSaldo() {
		return saldo;
	}	
}
