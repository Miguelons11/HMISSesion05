package ual.hmis.sesion05.ejercicio06;

import java.util.ArrayList;
import java.util.*;

public class Alumno {

	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividadesAsignadas;
	}

	public void setActividadesAsignadas(ArrayList<Actividad> actividadesAsignadas) {
		this.actividadesAsignadas = actividadesAsignadas;
	}

	public double calcularNotaActividad(String nombreActividad) {
		Actividad actividad=new Actividad();
		int puntuacion=0;
		for(int i=0;i<actividadesAsignadas.size();i++) {
			if(actividadesAsignadas.get(i).getNombre()==nombreActividad) {
				actividad=actividadesAsignadas.get(i);
			}
		}
		for(int i=0;i<actividad.getEjercicios().size();i++) {
			puntuacion+=actividad.getEjercicios().get(i).getPuntuacion();
		}
		actividad.setPuntuacionTotal(puntuacion);
		return actividad.getPuntuacionTotal();
	}

}
