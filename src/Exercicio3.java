import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Circulo c1 = new Circulo(32);
		Circulo c2 = new Circulo(44);
		Circulo c3 = new Circulo(17);
		
		System.out.printf("Circulo 01:\nÁrea: %.2f Perímetro: %.2f\n\n"
				+ "Circulo 02:\nÁrea: %.2f Perímetro: %.2f\n\n"
				+ "Circulo 03:\nÁrea: %.2f Perímetro: %.2f\n",
				c1.calcularArea(), c1.calculaPerimetro(),
				c2.calcularArea(), c2.calculaPerimetro(),
				c3.calcularArea(), c3.calculaPerimetro());

	}

}
