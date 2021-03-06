package Colecciones;
import java.time.LocalDate;

/**
 * Clase que representa un producto
 */
public class Producto implements Comparable<Producto>{
    
    private int id; // id del producto
    private String nombre; // nombre del producto
    private int unidades; // número de unidades compradas
    private LocalDate entrega; // fecha de entrega del producto

    public Producto(int id, String nombre, int unidades, LocalDate entrega) {
        this.id = id;
        this.nombre = nombre;
        this.unidades = unidades;
        this.entrega = entrega;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public LocalDate getEntrega() {
        return entrega;
    }
    
    @Override
    public boolean equals(Object o) {
	if(!(o instanceof Producto))
		return false;
	
	Producto p = (Producto) o;
	return this.id==p.id;
}
  
  	@Override
  	public int hashCode() {
  		return Integer.hashCode(id);
	// TODO Auto-generated method stub
}
  	
  	public String toString() {
  		return "(nombre:"+this.getNombre()+"|Unidades:"+this.getUnidades()+"|Entrega:"+this.getEntrega()+")";
  	}

	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

}
