package ual.hmis.sesion05.ejercicio04;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class Ejercicio4TestParametrizado {
	private String palabra1;
	private String palabra2;
	private String resultado;
	private Ejercicio4 ejercicio4;

	public Ejercicio4TestParametrizado(String palabra1,String palabra2, String resultado) {
	        this.palabra1 = palabra1;
	        this.palabra2= palabra2;
	        this.resultado = resultado;
	
	    }

	@Before
	public void setUp() throws Exception {
		ejercicio4 = new Ejercicio4();
	}

	
	@Parameters
	 public static Collection numeros() {
	      return Arrays.asList(new Object[][] {
	         { "odin","perro","din"},
	      });
	   }
	@Test
	public void testLoginUserNameCadenaVacia() {
		assertEquals(ejercicio4.caracteresNoComunesReturn(palabra1, palabra2),resultado);
		
	}
}
