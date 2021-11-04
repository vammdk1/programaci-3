package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class main {
	
	public static void main (String[] args) {
	/**
		Persona p = new Persona("John", "Smith", 20); // objeto a serializar
		// Creamos un stream de salida de objetos a fichero
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("datos.bin"))) {
			os.writeObject(p);
			System.out.println("Datos serializados correctamente");
		} catch (IOException e) {
			System.out.println("Error al serializar los datos al fichero");
		}
	**/
		
		Articulos a1 = new Articulos("patata", "Es una patata");
		Compra c1 = new Compra(null);
		c1.agregar(a1);
		c1.agregar(a1);
		c1.agregar(a1);
		c1.agregar(a1);
		
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("datos.txt"))) {
			os.writeObject(c1);
			System.out.println("Datos serializados correctamente");
		} catch (IOException e) {
			System.out.println("Error al serializar los datos al fichero");
		}
	}
}
