package Colecciones;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio11 {

	public static List<String> eliminarDuplicados(List<String> palabras) {
	Set<String> lista2 = new LinkedHashSet<>(palabras);
	return new ArrayList<>(lista2);
	}

}
