package entities;

public class Salario {
	String name;
	double salary, tax;
	
	public String toString() {
		double liquid = salary - tax;
		return "Employee: "
		+ name
		+ ", $"
		+ String.format("%.2f", liquid);
	}
}
