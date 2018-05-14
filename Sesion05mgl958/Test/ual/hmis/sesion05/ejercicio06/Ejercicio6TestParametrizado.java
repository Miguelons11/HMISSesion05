package ual.hmis.sesion05.ejercicio06;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ual.hmis.sesion05.ejercicio05.Ejercicio5;

@RunWith(Parameterized.class)
public class Ejercicio6TestParametrizado {
	private String nombreactividad;
	private double resultado;
	private Alumno a;
	private Ejercicio ejercicio1;
	private Ejercicio ejercicio2;
	private Ejercicio ejercicio3;
	private Ejercicio ejercicio4;
	private Ejercicio ejercicio5;
	private ArrayList<Ejercicio> ejercicios;
	private ArrayList<Ejercicio> ejercicios1;
	private ArrayList<Actividad> listaactividades;
	private Actividad actividad;
	
	public Ejercicio6TestParametrizado(String nombreactividad, double resultado) {
	        this.nombreactividad = nombreactividad;
	        this.resultado = resultado;
	
	    }

	@Before
	public void setUp() throws Exception {
		a= new Alumno();
		ejercicio1=new Ejercicio();
		ejercicio1.setPuntuacion(2);
		ejercicio2=new Ejercicio();
		ejercicio2.setPuntuacion(2);
		ejercicio3=new Ejercicio();
		ejercicio3.setPuntuacion(1);
		ejercicio4=new Ejercicio();
		ejercicio4.setPuntuacion(1);
		ejercicio5=new Ejercicio();
		ejercicio5.setPuntuacion(2);
		ejercicios=new ArrayList<Ejercicio>();
		
		ejercicios.add(ejercicio1);
		ejercicios.add(ejercicio2);
		ejercicios.add(ejercicio3);
		ejercicios.add(ejercicio4);
		ejercicios.add(ejercicio5);
		
		actividad =new Actividad();
		actividad.setEjercicios(ejercicios);
		actividad.setNombre("tarea");
		ejercicios1=new ArrayList<Ejercicio>();
		ejercicios1.add(ejercicio1);
		ejercicios1.add(ejercicio2);
		ejercicios1.add(ejercicio3);
		Actividad actividad1=new Actividad();
		actividad1.setEjercicios(ejercicios1);
		actividad1.setNombre("ccoo");
		
		listaactividades=new ArrayList<Actividad>();
		listaactividades.add(actividad1);
		listaactividades.add(actividad);
		a.setActividadesAsignadas(listaactividades);
	}

	
	@Parameters
	 public static Collection numeros() {
	      return Arrays.asList(new Object[][] {
	         {"tarea",8.0}
	      });
	   }
	@Test
	public void testsubcadena() {
		assertEquals(a.calcularNotaActividad(nombreactividad),resultado,0.1);
		
	}
}
