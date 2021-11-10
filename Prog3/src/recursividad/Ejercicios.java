package recursividad;

import java.util.ArrayList;
import java.util.List;





public class Ejercicios {
	private static int uno=1;
	
	public static void factorial(int n, int total) {
		if(n>1) {
			total*=n;
			n-=1;
			System.out.println(total);
			factorial(n,total);
		}		
	}
	
	public static Integer calcularC(int dividendo, int divisor,int cociente) {
		if(divisor > 0 && dividendo>0) {
			dividendo = dividendo-divisor;
			cociente+=1;
			return calcularC(dividendo, divisor, cociente);
		}
		return cociente;	
	}
	
	public static ArrayList<String> invertirString (String palabra, int ronda,ArrayList<String> lista) {
		if(lista.size()==0) {
			char[] lista2 = palabra.toCharArray();
			for(int i = 0; i<palabra.length();i++) {
			String letra=Character.toString(lista2[i]);
			lista.add(i,letra);
			}
			invertirString(palabra, ronda, lista);
		}else if (ronda<palabra.length()/2){
			String l1=lista.get(palabra.length()-1-ronda);
			String l2=lista.get(ronda);
			lista.set(ronda,l1);//primera letra de la ronda
			lista.set(palabra.length()-1-ronda,l2);//ultima letra de la ronda
			ronda+=1;
			invertirString(palabra, ronda, lista);
		}
		return lista;
	}
	
	public static void main (String[] args) {
		ArrayList lista;
		//factorial(10,uno);
		//System.out.println(calcularC(20, 5, 0));
		System.out.println(invertirString("potasio",0, lista = new ArrayList<>()));	
		
		
		
	}	
	

}
