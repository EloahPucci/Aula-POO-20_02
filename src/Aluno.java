
public class Aluno {
	private String nome;
	private double n1, n2;
	
	public double calculaMedia() {
		return (n1 + n2) / 2;
	}

	public Aluno(String nome, double n1, double n2) {
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	
}
