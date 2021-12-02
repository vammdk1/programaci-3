package Colecciones;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio06 implements Comparator<Producto>{
	
	public static  List<Producto> ordenarProductosEntrega(List<Producto> x) {
		System.out.println(x);
		Collections.sort(x,(a,b)->b.getEntrega().compareTo(a.getEntrega()));
		//Collections.reverse(x);
	
		return x;
	}

	@Override
	public int compare(Producto o1, Producto o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
