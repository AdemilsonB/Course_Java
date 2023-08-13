package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x;
		x = new Rectangle();
		
		System.out.println("Insert height to rectangle");
		x.height = sc.nextDouble();
		System.out.println("Insert width to rectangle");
		x.width = sc.nextDouble();
		
		double area = x.Area();
		System.out.printf("AREA = %.2f", area);
		System.out.println();
		double perimetro = x.Perimetro();
		System.out.printf("PERIMETER = %.2f", perimetro);
		System.out.println();
		double diagonal = x.Diagonal();
		System.out.printf("DIAGONAL = %.2f", diagonal);
	}

}
