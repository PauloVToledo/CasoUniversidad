package org.example;

public class Administrativo extends Trabajador {
	private Departamento departamento;

	public Administrativo(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horario, Departamento departamento) {
		super(tituloProfesional, nombre, direccion, estadoCivil, rut, horario);
		this.departamento = departamento;
	}

	public String getTipo() {
		return "Administrativo";
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
}
