package JavaModerno;

public class UsoLambda {
	//anotar como poner los Junit en el resumen global
	public static void main (String[] args) {
		Operacion op = x -> x+1; //Esta parte se encarga de hacer el equivalente a la función comentada abajo
		System.out.println(op.incrementar(3));
		Division divi = x-> x/2;
		System.out.println(divi.div(100));
	}
	
/**	
 * public int incrementar(int x) {
		return x+1 ;
	}
**/
}
