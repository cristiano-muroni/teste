package entities;

public class SalaryEmployee {
	public String name;
	public double grossSalary;
	public Object percentage;
	final public static double tax = 1000.00; // imposto cobrado em rela��o ao sal�rio

	public void increaseSalary(double percentage) { // incrementando o sal�rio, de acordo com a porcentagem de aumento

		grossSalary += grossSalary * percentage/100.00;
		
	}

	public double netSalary() { // sal�rio liquido
		return grossSalary -tax;
	}

	public String toString() {
		return " nome: " + name + ", " + "sal�rio liquido: " + String.format("R$ %.2f \n", netSalary())
				+ " descontando o imposto de: " + String.format("R$ %.2f", tax) + ", " + "sal�rio bruto"
				+ String.format("R$ %.2f ", grossSalary);
				
	}

}
