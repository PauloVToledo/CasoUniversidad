package org.example;

public class Profesor extends Trabajador {
	private String tipoJornada;

	public Profesor(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horario, String tipoJornada) {
		super(tituloProfesional, nombre, direccion, estadoCivil, rut, horario);
		this.tipoJornada = tipoJornada;
	}

	public String getTipo() {
		return "Profesor";
	}

	public String getTipoJornada() {
		return tipoJornada;
	}

	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
	}

    public Object getJornada() {
		return tipoJornada;
    }
}
