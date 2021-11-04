package Jlist;

import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private String apellido;
	private LocalDate nacimiento;
	
	public Persona(String nom, String apel,LocalDate nac ) {
		this.nombre=nom;
		this.apellido=apel;
		this.nacimiento= nac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	
	

}
