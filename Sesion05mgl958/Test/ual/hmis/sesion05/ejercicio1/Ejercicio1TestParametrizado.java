package ual.hmis.sesion05.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class Ejercicio1TestParametrizado {

	private int entrada;
	private int resultado;
	private Ejercicio1 ejercicio1;

	public Ejercicio1TestParametrizado (int entrada, int resultado) {
	        this.entrada = entrada;
	        this.resultado = resultado;
	
	    }

	@Before
	public void setUp() throws Exception {
		ejercicio1 = new Ejercicio1();
	}

	
	@Parameters
	 public static Collection numeros() {
	      return Arrays.asList(new Object[][] {
	         { 2, 1 },
	         { 3, 1 },
	         { 5, 1 },
	         { 7, 7 },
	      });
	   }
	
	@Test
	public void testTransformarCaso2() {
		//multiplos de 2
		assertEquals(resultado,ejercicio1.transformar(entrada));
	}
	@Test
	public void testTransformarCaso3() {
		//multiplos de 3
		
		assertEquals(resultado,ejercicio1.transformar(entrada));
	}
	@Test
	public void testTransformarCaso5() {
		//multiplos de 5
		assertEquals(resultado,ejercicio1.transformar(entrada));
	}
	@Test
	public void testTransformarCasoNi2Ni3Ni5() {
		//multiplos ni de 2 ni de 3 ni de 5
		assertEquals(resultado,ejercicio1.transformar(entrada));
	}
}




