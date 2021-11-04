package serializable;

import java.io.Serializable;

public class Articulos implements Serializable{
	
	private String nom;
	private String desc;
	
	public Articulos(String Nombre , String descripcion) {
		this.desc=descripcion;
		this.nom=Nombre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String toString() {
		return "Nombre: "+getNom()+" ,Descripción: "+getDesc();
		
	}

}
