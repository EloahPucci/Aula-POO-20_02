import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Aluno a1 = new Aluno("Ana", 10, 9);
		Aluno a2 = new Aluno("Beto", 9, 10);
		
		System.out.printf("Média final de %s: %.2f\nMédia final de %s: %.2f",
				a1.getNome(), a1.calculaMedia(), a2.getNome(), a2.calculaMedia());

	}
}