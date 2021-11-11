package recursividad;

import java.util.ArrayList;
import java.util.List;





public class Ejercicios {
	private static int uno=1;
	
	public static int factorial(int n, int total) {
		if(n>1) {
			total*=n;
			n-=1;
			return factorial(n,total);
		}	
		return total;
	}
	
	public static Integer calcularC(int dividendo, int divisor,int cociente) {
		if(divisor > 0 && dividendo>0 && dividendo-divisor>=0) {
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
		}else if (ronda<palabra.length()){
			String l1=lista.get(palabra.length()-1-ronda);
			String l2=lista.get(ronda);
			lista.set(ronda,l1);//primera letra de la ronda
			lista.set(palabra.length()-1-ronda,l2);//ultima letra de la ronda
			ronda+=1;
			invertirString(palabra, ronda, lista);
		}
		return lista;
	}
	
	public static String InvertirString2(String palabra,int i ) {
		if(i < 0) {return "";}
		return palabra.charAt(i)+ InvertirString2(palabra, i-1);
		
	}
	
	public static void main (String[] args) {
		ArrayList lista;
		System.out.println("Factorial:"+factorial(10,uno));
		System.out.println("------");
		System.out.println("Cociente:"+calcularC(200,5, 0));
		System.out.println("------");
		System.out.println("Invertido:"+invertirString("potasio",0, lista = new ArrayList<>()));	
		System.out.println("------");
		System.out.println("Invertido2:"+InvertirString2("potasio","potacio".length()-1));	
		System.out.println("------");
		//hacer los ejercicios: 3,10 ( arma frases al revés),11
		
		
	}	
	

}
