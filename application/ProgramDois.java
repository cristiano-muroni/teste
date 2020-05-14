package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class ProgramDois {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Products products = new Products();
		System.out.println("Entre com os Dados do produto");
		System.out.println(" Nome: ");
		products.name = sc.nextLine();
		System.out.println("preço do produto: ");
		products.price = sc.nextDouble();
		System.out.println("quantidade em estoque: ");
		products.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Products Data:");
		System.out.println(products);
		System.out.println("entre com os produtos a serem adicionados em estoque: ");
		int quantity = sc.nextInt();
		products.addProducts(quantity);
		System.out.println();
		System.out.println("Dados atualizados");
		System.out.println(products);
		System.out.println();
		System.out.println("entre com os produtos a serem removidos do estoque: ");
		quantity = sc.nextInt();
		products.removeProducts(quantity);
		System.out.println();
		System.out.println("Dados atualizados");
		System.out.println(products);
		
		sc. close();

	}

}
