package org.example;
public abstract class Trabajador {
	private String tituloProfesional;
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private String rut;
	private String horario;

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public String getRut() {
		return this.rut;
	}

	public String getHorario() {
		return this.horario;
	}

	public Trabajador(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horario) {
		throw new UnsupportedOperationException();
	}

	public Trabajador(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut) {
		throw new UnsupportedOperationException();
	}

	public abstract String getTipo();

    public Object getDepartamento() {
		return getDepartamento();
    }
}