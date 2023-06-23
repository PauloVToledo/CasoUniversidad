package org.example;
import java.util.ArrayList;

public class Departamento {
	private String nombre;
	private Facultad facultad;
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<CarreraUniversitaria> carrera_s_ = new ArrayList<CarreraUniversitaria>();



	public String getNombre() {
		return this.nombre;
	}

	public Departamento(String nombre) {

		this.nombre=nombre;
		this.facultad=new Facultad();
		this.administrativos=new ArrayList<>();
		this.profesores=new ArrayList<>();
		this.carrera_s_=new ArrayList<>();


		throw new UnsupportedOperationException();
	}

	public ArrayList<CarreraUniversitaria> getCarrerasUniversitarias() {
		return carrera_s_;
	}
}