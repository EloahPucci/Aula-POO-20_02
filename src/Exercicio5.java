import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Eloah");
		p1.setCpf("025.658.996-98");
		p1.setIdade(29);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("José");
		p2.setCpf("145.698.322-00");
		p2.setIdade(200);

	}
}