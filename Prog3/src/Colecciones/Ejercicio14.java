package Colecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


public class Ejercicio14 {
	public static HashMap<LocalDate, List<Producto>> lista2 = new HashMap<>();
	public static List<Envio> lt = new ArrayList<>();
	public static List<Envio> agruparEnvios(List<Producto> productos) {
		for(Producto x : productos) {
			List<Producto> lt = new ArrayList<>();
			for(int i=0;i<productos.size();i++) {
				if(x.getEntrega().equals(productos.get(i).getEntrega())) {
					lt.add(productos.get(i));
				}
			}
			lista2.put(x.getEntrega(), lt);
		}
		for(Entry<LocalDate, List<Producto>> entry : lista2.entrySet()) {
			LocalDate k = entry.getKey();
			List<Producto> v = entry.getValue();
			lt.add(new Envio(k, v));
		}
		return lt ;// new ArrayList<Envio>(lista2);
	}

}
