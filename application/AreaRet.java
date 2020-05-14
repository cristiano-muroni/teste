package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class AreaRet {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();

		System.out.println("entre com as dimensões do retângulo");
		System.out.println("digite o valor da altura:");
		rectangle.alt = sc.nextDouble();
		System.out.println("digite um valor para largura:");
		rectangle.larg = sc.nextDouble();
		System.out.println();
		System.out.println(rectangle);

	}

}
