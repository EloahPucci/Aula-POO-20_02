
public class ContaCorrente {
	private String nome;
	private String senha;
	private double saldo;	
	
	public ContaCorrente(String nome, double saldo) {
		super();
		this.nome = nome;
		this.saldo = saldo;
	}

	public void cadastrarSenha(String senha) {
		this.senha = senha;
	}
	
	public void alterarSenha(String senhaAntiga, String novaSenha) {
		if(this.senha.equals(senhaAntiga)) {
			this.senha = novaSenha;
		} else {
			System.out.println("Senha não confere. Tente novamente!");
		}
	}
	
	public void debitar(double valor, String senha) {
		if(senha.equals(this.senha)) {
			this.saldo -= valor;
		} else {
			System.out.println("Senha não confere! Ação cancelada!");
		}		
	}
	
	public void creditar(double valor, String senha) {
		if(senha.equals(this.senha)) {
			this.saldo += valor;
		} else {
			System.out.println("Senha não confere! Ação cancelada!");
		}		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
