package Colecciones;

import java.util.Collections;
import java.util.List;

public class Ejercicio09 {
	
	public static List<String> convertirMayusculas(List<String> palabras) {
		int contador = 0;
		for(String x:palabras) {
			palabras.set(contador,x.toUpperCase());
			contador+=1;
		}
		return palabras;
	}

}
