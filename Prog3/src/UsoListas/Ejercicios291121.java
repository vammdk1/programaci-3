package UsoListas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ejercicios291121 {
	
	public static List<String> lista =new ArrayList<>();//--> Se recomienda esta nomenclatura para la futura creaci�n de listas
	public static List<String> lb= Arrays.asList("Hola","chao","dia","tarde","columpio");
	
	public static void main(String[] args) {
		lista.addAll(lb); //-> agrega la "Lista" de elementos a la array list
		System.out.println(lista.toString());
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println(Collections.max(lista));//-> nos regresa el �ltimo valor de una colecci�n
		System.out.println(Collections.min(lista));//-> nos regresa el primer valor de una colecci�n
		Collections.shuffle(lista);
		System.out.println(lista);	
	}
}
