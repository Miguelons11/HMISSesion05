package ual.hmis.sesion05.ejercicio02;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class Ejercicio2TestParametrizado {

	private int entrada;
	private int resultado;
	private Ejercicio2 ejercicio2;

	public Ejercicio2TestParametrizado (int entrada, int resultado) {
	        this.entrada = entrada;
	        this.resultado = resultado;
	
	    }

	@Before
	public void setUp() throws Exception {
		ejercicio2 = new Ejercicio2();
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
	
	
}




