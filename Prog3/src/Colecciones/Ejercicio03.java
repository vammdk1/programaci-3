package Colecciones;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio03 {
	
	public static List<String> ordenarPalabrasLongitud(List<String> x) {
		Collections.sort(x, (a, b)->Integer.compare(a.length(), b.length()));
		System.out.println(x);
		return x;
	}

}
