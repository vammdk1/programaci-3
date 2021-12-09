package Colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio10 {

	public static List<String> eliminarDuplicados(List<String> palabras) {
		//el set gestiona el guardado de datos y elimina los datos repetidos automaticamente al agregarle una lista 
		Set<String> lista2 = new HashSet<>(palabras);// <------|
		return new ArrayList<>(lista2);
	}

}
