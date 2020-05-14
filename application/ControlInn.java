package application;

import java.util.Scanner;
import java.text.ParseException;

import entities.Inn;
// esta classe controla a classe " Inn.java " que esta no pacote "entities"
public class ControlInn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Inn[] vect = new Inn[10];
		
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		
		for ( int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("quarto #"+ i + ":");
			System.out.println("nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("email: ");
			String email = sc.nextLine();
			System.out.println("quarto: ");
			int room = sc.nextInt();
			vect[room] = new Inn(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i+": "+ vect[i]);
			}
		}
		
		sc.close();
		

	}

}
