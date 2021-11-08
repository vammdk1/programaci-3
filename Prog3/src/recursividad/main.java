package recursividad;

public class main {
	
	public static void contar(int current, int end) {
		if (current != end) {
			contar(current + 1, end);
			System.out.println(current);
		}
	}
	
	public static int fibonacci(int n) {
		if(n>1){
			return fibonacci(n-1)+fibonacci(n-2);
		}else if(n==0) {
			return 0;
		}else if (n==1) {
			return 1;
		}else {
			 System.out.println("Debes ingresar un tamaño mayor o igual a 1");
		     return -1; 
		}
	}
	
	public static void contadorM(int M, int actual) {
		if(M<0 ) {
			System.out.println("M tiene que ser mayor que 0");
		}else if(actual<=M){
			System.out.println("Creciendo: "+actual);
			contadorM(M,actual+1); // si se cambia el syso de antes de la llamada a despues, podemos crear una escalera inversa
		}
	}
	public static void contadorInverso(int M, int actual) {
		if(M<0 ) {
			System.out.println("M tiene que ser mayor que 0");
		}else if(actual<=M){
			contadorInverso(M,actual+1); // si se cambia el syso de antes de la llamada a despues, podemos crear una escalera inversa
			System.out.println("Decreciendo: "+actual);
		//si la llamada está en , por ejemplom, el escalon 3 de 10 significa que en este escalon la n vale 3 
		//pero por orden de comandos primero imprime el valor de 3 y luego hace la llamada.
		//cuando invertimos el orden de los comandos el programa primero hace la nueva llamada y luego imprime el número, lo que lo fuerza a esperar el
		//final de la recursiva y imprime primero el último valor de la llamda ya que primero vuelve y luego imprime.
		}
	}
	
	//1 calcular el factorial
	public int factorial(int n, int total) {
		if(n>=0) {
			System.out.println(n);
			factorial(n-1,total*=n-1);
			return total;
		}	
		return 0;
	}
	//2 calcular el resultado de una divición
	//3 un método que reciba un string y devuelva ese estring invertido 
	
	public static void main (String[] args) {
		//contar(0,10);
		/**for (int i=0; i<100; i++) {
			System.out.print(fibonacci(i)+" ");
		}**/
		contadorM(10, 0);
		System.out.println("--------");
		contadorInverso(10,0);
		
	}

}
