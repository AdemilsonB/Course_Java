package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salario x;
		x = new Salario();
		
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Gross salary: ");
		double salary = sc.nextDouble();
		System.out.println("Tax: ");
		double tax = sc.nextDouble();
		
		System.out.println("novo" + salario);
	}

}
