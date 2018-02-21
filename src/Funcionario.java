
public class Funcionario {
	private String nome;
	private int horasTrabalhadas;
	private double valorHora;
	
	public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	public double calculaSalario() {
		return valorHora * horasTrabalhadas;
	}
	
}
