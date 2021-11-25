package UsoListas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class EjercicioPila {
	
	public static String palabra = new String("Paralelepipedo");
	
	public static void main (String[] args) {
		try (Scanner scanner = new java.util.Scanner(System.in)) {
			System.out.println("Introduce una frace: ");
			String palabra = scanner.nextLine();
			Deque<Character> pila = new ArrayDeque<>();
			for (int i=0;i<palabra.length();i++) {
				pila.push(palabra.charAt(i));
			}
			for (int i=pila.size()-1;i>=0;i--) {
				System.out.print(pila.pop());
			}
		}
	}


}
