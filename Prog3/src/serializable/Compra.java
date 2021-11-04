package serializable;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra implements Serializable{
 	
	public List<Articulos> lista = new ArrayList<>();
	private LocalDate fecha;
	private Articulos A;
	
	public Compra(Articulos art) {
		this.A = art;
		this.fecha= LocalDate.now();
	}
	
	public void agregar(Articulos x) {
		lista.add(x);
	}

	public List<Articulos> getLista() {
		return lista;
	}

	public void setLista(List<Articulos> lista) {
		this.lista = lista;
	}
	

}
