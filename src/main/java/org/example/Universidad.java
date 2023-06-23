package org.example;
import java.util.ArrayList;

public class Universidad {
	private String nombre;
	private String direccion;
	private String tipoUniversidad;
	private ArrayList<Facultad> facultades = new ArrayList<Facultad>();
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public String getTipoUniversidad() {
		return this.tipoUniversidad;
	}

	public ArrayList<Profesor> obtenerProfesoresFacultad(Facultad facultad) {
		ArrayList<Profesor> profesoresFacultad = new ArrayList<>();

		// Recorremos todas las facultades de la universidad
		for (Facultad f : facultades) {
			// Verificamos si la facultad coincide con la facultad proporcionada
			if (f.equals(facultad)) {
				// Obtenemos todos los profesores de la facultad
				ArrayList<Profesor> profesores = f.getProfesores();

				// Agregamos los profesores al resultado
				profesoresFacultad.addAll(profesores);

				// Si solo deseas obtener los profesores de una facultad específica y no de todas las facultades,
				// puedes agregar un 'break' aquí para salir del bucle después de encontrar la facultad deseada.
			}
		}

		return profesoresFacultad;
	}


	public Profesor agregarProfesor(Profesor profesor) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<CarreraUniversitaria> obtenerCarreraUniversitaria(Facultad facultad) {
		ArrayList<CarreraUniversitaria> carrerasFacultad = new ArrayList<>();

		// Recorremos todas las facultades de la universidad
		for (Facultad f : facultades) {
			// Verificamos si la facultad coincide con la facultad proporcionada
			if (f.equals(facultad)) {
				// Obtenemos todos los departamentos de la facultad
				ArrayList<Departamento> departamentos = f.getDepartamentos();

				// Recorremos todos los departamentos de la facultad
				for (Departamento d : departamentos) {
					// Obtenemos todas las carreras universitarias del departamento
					ArrayList<CarreraUniversitaria> carreras = d.getCarrerasUniversitarias();

					// Agregamos las carreras al resultado
					carrerasFacultad.addAll(carreras);
				}

				// Si solo deseas obtener las carreras de una facultad específica y no de todas las facultades,
				// puedes agregar un 'break' aquí para salir del bucle después de encontrar la facultad deseada.
			}
		}

		return carrerasFacultad;
	}


	public ArrayList<Profesor> obtenerProfesoresPorJornada(String jornada, Departamento departamento) {
		ArrayList<Profesor> profesoresPorJornada = new ArrayList<>();

		// Recorremos todos los trabajadores de la universidad
		for (Trabajador trabajador : trabajadores) {
			// Verificamos si el trabajador es un profesor y pertenece al departamento proporcionado
			if (trabajador instanceof Profesor && trabajador.getDepartamento().equals(departamento)) {
				Profesor profesor = (Profesor) trabajador;

				// Verificamos si la jornada del profesor coincide con la jornada proporcionada
				if (profesor.getJornada().equals(jornada)) {
					profesoresPorJornada.add(profesor);
				}
			}
		}

		return profesoresPorJornada;
	}


	public ArrayList<Profesor> obtenerProfesoresTodos() {
		ArrayList<Profesor> todosLosProfesores = new ArrayList<>();

		// Recorremos todas las facultades de la universidad
		for (Facultad facultad : facultades) {
			// Obtenemos todos los profesores de la facultad
			ArrayList<Profesor> profesoresFacultad = facultad.getProfesores();

			// Agregamos los profesores al resultado
			todosLosProfesores.addAll(profesoresFacultad);
		}

		return todosLosProfesores;
	}


	public ArrayList<Administrativo> obtenerAdministrativos() {
		ArrayList<Administrativo> todosLosAdministrativos = new ArrayList<>();

		// Recorremos todos los trabajadores de la universidad
		for (Trabajador trabajador : trabajadores) {
			// Verificamos si el trabajador es un administrativo
			if (trabajador instanceof Administrativo) {
				Administrativo administrativo = (Administrativo) trabajador;

				todosLosAdministrativos.add(administrativo);
			}
		}

		return todosLosAdministrativos;
	}
}