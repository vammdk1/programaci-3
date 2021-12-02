package Colecciones;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio04 {
	
	public static List<String> ordenarPalabrasLongitudInv(List<String> x) {
		Collections.sort(x, (a, b)->Integer.compare(a.length(), b.length()));
		Collections.reverse(x);
		System.out.println(x);
		return x;
	}

}
