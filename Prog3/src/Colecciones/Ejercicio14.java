package Colecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ejercicio14 {

	public static List<Envio> agruparEnvios(List<Producto> productos) {
		HashMap<LocalDate,String> lista2 = new HashMap<>();
		for(Producto x : productos) {
			lista2.put(x.getEntrega(), x.getNombre());
			System.out.println(lista2);
		}
		return new ArrayList<Envio>(lista2);
	}

}
