package applilcation;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cotação dólar atual: ");
		double cotacao = sc.nextDouble();
		System.out.println("Quantos dólars vai converter: ");
		double valor = sc.nextDouble();
		
		double f = CurrencyConverter.calculo(cotacao, valor);
		
		System.out.printf("Valor final: %.2f", f);
		sc.close();
	}

}
