package Colecciones;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio05 {
	
	public static  List<Producto> ordenarProductosId(List<Producto> x) {
		System.out.println(x);
		Collections.sort(x);
		//Collections.reverse(x);
	
		return x;
	}

}
