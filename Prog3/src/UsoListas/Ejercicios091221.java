package UsoListas;

import javax.sql.rowset.Joinable;

public class Ejercicios091221 {
	
	public static void main(String[] args) {
		String[] lista = {"hola","prueba","casa","paraguas","paraguas","casa"};
		System.out.println(devuelveMayusculas(lista));
	}
	
	public static String devuelveMayusculas(String[] lista) {
		int contador=0;
		for(String x : lista){
			lista[contador]=x.toUpperCase();
			contador+=1;
		}
		String lista2= String.join(",", lista);
		return lista2;
	}

}
