package utils;

public class CurrencyConverter {
	public static double calculo(double cotacao, double valor) {
		return cotacao * (valor * 0.06);
	}
}
