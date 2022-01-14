package Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ejercicio08 {
	
	public static List<String> lista =new ArrayList<>();//--> Se recomienda esta nomenclatura para la futura creaci�n de listas
	public static List<String> lb= Arrays.asList("Hola","chao","dia","tarde","columpio");
	
	public static void main(String[] args) {
	
	}

	public static boolean existeProducto(List<Producto> productos, Producto producto) {
		for(Producto p: productos) {
				if(p.compareTo(producto)==0)return true;
		}
		return false;
	}
}
