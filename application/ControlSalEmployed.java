package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SalaryEmployee;

public class ControlSalEmployed {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SalaryEmployee salaryemployee = new SalaryEmployee();

		System.out.println(" digite o nome do funcion�rio: ");
		salaryemployee.name = sc.nextLine();
		System.out.println("digite o sal�rio bruto do funcion�rio:");
		salaryemployee.grossSalary = sc.nextDouble();
		System.out.println(" digite a porcentagem de promo��o salarial: ");
		double percentage = sc.nextDouble();
		salaryemployee.increaseSalary(percentage); 

		System.out.println(salaryemployee);

		sc.close();

	}

}
