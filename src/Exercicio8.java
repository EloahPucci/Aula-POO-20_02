import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.println("Cadastrar novo usuário, digite seu nome e o saldo que será depositado para abertura de conta:");
		
		ContaCorrente cc = new ContaCorrente(sc.next(), sc.nextDouble());
	}
}