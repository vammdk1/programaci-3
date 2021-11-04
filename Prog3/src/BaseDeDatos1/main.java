package BaseDeDatos1;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class main {
	
	public static void main (String[] args) {
		//System.out.println("Hello world");
		//cargar driver
		try {
			Class.forName("org.sqlite.JDBC");// esto es lo que se usa para cargar 
			//en java el dirver que queremos usar en la base de datos
			//System.out.println("Prueba");
		} catch (ClassNotFoundException e) {
			System.out.println("No se ha podido cargar el driver de la base de datos");
		}
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlite:basededatos.db");
			
			Statement stmt = conn.createStatement(); //creamos OBLIGATORIAMENTE esta "declaración" para poder jacer consultas
			ResultSet rs = stmt.executeQuery("SELECT nombre,apellido,id FROM usuario where cartera > 0.0"); //consulta a la base de datos
			//la consulta toma tal cual lo que le manadamos como una consula sql
			//las conultas tienen que ser optimizadas , es decir , si queremos nombre y apellido, pedir solo esas dos cosas, y no usar "*"
			while (rs.next()) {
				//se va a ejecutar mientras quedeb filas en la consulta
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				int t = rs.getInt("id");
				
				//hacemos print de la información
				//System.out.println(nombre+" "+apellido+" "+t);
				System.out.println(String.format("%s - %s - %d", nombre, apellido , t));
				//syso pro : %d double, %s string, %s string
			}
			//---------------------------------------------------------------------
			//Se agregan datos usando el int y el executeUpdate
			int rows = stmt.executeUpdate("INSERT INTO usuario VALUES ('Alberto',20 , 'Einstein', 69)");
			while (rs.next()) {
				//se va a ejecutar mientras quedeb filas en la consulta
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				int t = rs.getInt("id");
				
				//hacemos print de la información
				//System.out.println(nombre+" "+apellido+" "+t);
				System.out.println(String.format("%s - %s - %d", nombre, apellido , t));
				//syso pro : %d double, %s string, %s string
			}		
			
			
			
			//--------------------------------------
			rs.close(); //cierre de la consulta
			stmt.close(); // cierre de la declaración
			
			conn.close();
		}catch (Exception e) {
				e.printStackTrace();
		}
	}

}
