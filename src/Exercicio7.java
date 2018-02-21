import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Calculo c = new Calculo();
		
		c.credito(500);
		c.debito(150);
		System.out.println("Saldo atual: R$" + c.getSaldo());
	}
}
