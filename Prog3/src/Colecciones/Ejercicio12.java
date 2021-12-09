package Colecciones;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio12 {

	public static List<Producto> eliminarDuplicados(List<Producto> productos) {
		Set<Producto> lista2 = new LinkedHashSet<>(productos);
		//podemos hacer que el hascode se se organice usando el "Id" si en la clase de producto creamos la función de "Equals" y la funcion interna 
		//de "Hashcode"
		return new ArrayList<>(lista2);
	}

	
}
