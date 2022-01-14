package recursividad;

import java.util.ArrayList;
import java.util.List;



public class ProblemasRecursividad {
	
	private static ArrayList<String> aux = new ArrayList<>();
	
	//pr�ctica 5B.1 parte 1
	public static void combinatoria(char[] lista,int posicion,String respuesta,int contadorN,int limite) {
		if(posicion==0) {
			aux.add(respuesta);
		}else {
			for(int i=0;i<lista.length;i++) {
				if(Character.isDigit(lista[i])) {
					if(contadorN<limite) {
						combinatoria(lista, posicion-1, respuesta+lista[i],contadorN+1,limite);	
					} 
					}else {
						combinatoria(lista, posicion-1, respuesta+lista[i],contadorN,limite);	
				}
				
			}
		}
	}
	
	public static void ejer4(String numeros, int pos) {
		StringBuilder numerosN = new StringBuilder(numeros);
			for(int i=numeros.length()-pos-1;i>=0;i--) {
				if(numeros.charAt(i)=='b') {
					numerosN.setCharAt(i, '0');
					numeros=numerosN.toString();
					ejer4(numeros,pos+1);
				}
				//System.out.println("prueba");
				numerosN.setCharAt(i, '1');
				numeros=numerosN.toString();
				//ejer4(numeros,pos+1);
				System.out.println(numeros);
				//ejer4(numeros,pos+1);
		}
	}
	
	public static void imprimirStrNumericos(String n,int x) {
		StringBuilder numerosN = new StringBuilder(n);
		for(int i=n.length()-1;i>=0;i--) {
			if(n.charAt(i)=='#') {	
				numerosN.setCharAt(i, '0');
				n=numerosN.toString();
				imprimirStrNumericos(n,0);
			}
			if(i==x) {
				
			}
			System.out.println(n);
			
		}
		
		
	}
	public static void main (String[] args) {
		char[] lista2 = {'A','B','C','1','2'};
		//System.out.println(lista2.toString());
		//combinatoria(lista2,3,"",0,1);
		//System.out.println(aux.toString());
		System.out.println("-------------");
		//ejer4("1bb", 0);
		// para el jueves: hacer el ejercicio 4,5 y 7
		imprimirStrNumericos("23#",0);
		
	}

}
