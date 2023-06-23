package org.example;
import java.util.ArrayList;

public class Facultad {
	private String nombre;
	private String latitud;
	private String longitud;
	private Universidad universidad;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();

	public String getNombre() {
		return this.nombre;
	}

	public String getLatitud() {
		return this.latitud;
	}

	public String getLongitud() {
		return this.longitud;
	}

	public Facultad() {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.universidad = universidad;
		this.departamentos = new ArrayList<>();
		this.profesores = new ArrayList<>();
	}

	public Departamento agregarDepartamento(Departamento departamento) {
		departamentos.add(departamento);
		return departamento;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}
}
