package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {



	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println(" entre com as dimenssões do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println(" entre com as dimenssões do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("a area do triang. x % .4f \n", areaX);
		System.out.printf("a area do triang. y % .4f \n", areaY);

		if (areaX > areaY) {
			System.out.printf("A maior area é a do triângulo x % .4f \n", areaX);
		} else {
			System.out.printf("A maior area é a do triângulo y % .4f \n", areaY);
		}

		sc.close();
	}

}
