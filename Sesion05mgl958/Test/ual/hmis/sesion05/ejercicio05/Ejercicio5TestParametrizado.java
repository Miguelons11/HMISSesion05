package ual.hmis.sesion05.ejercicio05;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Ejercicio5TestParametrizado {
	private String oracion;
	private String resultado;
	private Ejercicio5 ejercicio5;

	public Ejercicio5TestParametrizado(String oracion, String resultado) {
	        this.oracion = oracion;
	        this.resultado = resultado;
	
	    }

	@Before
	public void setUp() throws Exception {
		ejercicio5 = new Ejercicio5();
	}

	
	@Parameters
	 public static Collection numeros() {
	      return Arrays.asList(new Object[][] {
	         { "Hola, me llamo 9 Miguel.AAA","Error: cadena con digito"},
	         {"Hola, me llamo Miguel.AAA","Hola, me llamo Miguel"},
	         {"Hola, me llamo Miguel","Error: cadena sin punto"}
	      });
	   }
	@Test
	public void testsubcadena() {
		assertEquals(ejercicio5.subcadenaHastaPunto(oracion),resultado);
		
	}
}
