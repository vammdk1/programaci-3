package Colecciones;

import java.util.Collections;
import java.util.List;

public class Ejercicio02 {
	
	public static List<String> ordenarPalabrasInverso(List<String> x) {
		Collections.sort(x);
		Collections.reverse(x);		
		return x;
	}

}
