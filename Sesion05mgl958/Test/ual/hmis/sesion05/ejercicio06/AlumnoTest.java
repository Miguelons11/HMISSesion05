package ual.hmis.sesion05.ejercicio06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AlumnoTest {

	@Test
	void testCalcularNotaActividad() {
		Ejercicio ejercicio1=new Ejercicio();
		ejercicio1.setPuntuacion(2);
		Ejercicio ejercicio2=new Ejercicio();
		ejercicio2.setPuntuacion(2);
		Ejercicio ejercicio3=new Ejercicio();
		ejercicio3.setPuntuacion(1);
		Ejercicio ejercicio4=new Ejercicio();
		ejercicio4.setPuntuacion(1);
		Ejercicio ejercicio5=new Ejercicio();
		ejercicio5.setPuntuacion(2);
		ArrayList<Ejercicio> ejercicios=new ArrayList<Ejercicio>();
		
		ejercicios.add(ejercicio1);
		ejercicios.add(ejercicio2);
		ejercicios.add(ejercicio3);
		ejercicios.add(ejercicio4);
		ejercicios.add(ejercicio5);
		
		Actividad actividad =new Actividad();
		actividad.setEjercicios(ejercicios);
		actividad.setNombre("tarea");
		
		ArrayList<Ejercicio> ejercicios1=new ArrayList<Ejercicio>();
		ejercicios1.add(ejercicio1);
		ejercicios1.add(ejercicio2);
		ejercicios1.add(ejercicio3);
		Actividad actividad1=new Actividad();
		actividad1.setEjercicios(ejercicios1);
		actividad1.setNombre("ccoo");
		
		Alumno a= new Alumno();
		ArrayList<Actividad> list2=new ArrayList<Actividad>();
		list2.add(actividad1);
		list2.add(actividad);
		a.setActividadesAsignadas(list2);
		
		assertEquals(8.0,a.calcularNotaActividad("tarea"));
	}

}
