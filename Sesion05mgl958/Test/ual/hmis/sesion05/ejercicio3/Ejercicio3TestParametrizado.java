package ual.hmis.sesion05.ejercicio3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class Ejercicio3TestParametrizado {
	private int nasteriscos;
	private String resultado;
	private Ejercicio3 ejercicio3;

	public Ejercicio3TestParametrizado(int nasteriscos, String resultado) {
	        this.nasteriscos = nasteriscos;
	        this.resultado = resultado;
	
	    }

	@Before
	public void setUp() throws Exception {
		ejercicio3 = new Ejercicio3();
	}

	
	@Parameters
	 public static Collection numeros() {
	      return Arrays.asList(new Object[][] {
	         { 6,"******"},
	         {-2,"número erróneo"},
	      });
	   }
	@Test
	public void test() {
		assertEquals(ejercicio3.CaracteresReturn(nasteriscos),resultado);
		
	}
}
