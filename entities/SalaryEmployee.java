package entities;

public class SalaryEmployee {
	public String name;
	public double grossSalary;
	public Object percentage;
	final public static double tax = 1000.00; // imposto cobrado em relação ao salário

	public void increaseSalary(double percentage) { // incrementando o salário, de acordo com a porcentagem de aumento

		grossSalary += grossSalary * percentage/100.00;
		
	}

	public double netSalary() { // salário liquido
		return grossSalary -tax;
	}

	public String toString() {
		return " nome: " + name + ", " + "salário liquido: " + String.format("R$ %.2f \n", netSalary())
				+ " descontando o imposto de: " + String.format("R$ %.2f", tax) + ", " + "salário bruto"
				+ String.format("R$ %.2f ", grossSalary);
				
	}

}
