import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Funcionario f1 = new Funcionario("Jo�o", 20, 3.50);
		Funcionario f2 = new Funcionario("Mateus", 40, 5.50);
		Funcionario f3 = new Funcionario("Lucas", 40, 13.50);
		
		System.out.printf("Folha de pagamentos:\n\nJo�o: R$%.2f\nMateus: R$%.2f\nLucas: R$%.2f",
				f1.calculaSalario(), f2.calculaSalario(), f3.calculaSalario());

	}

}
