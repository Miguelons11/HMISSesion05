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

	private String user;
	private String passwd;
	private boolean resultado;
	private Ejercicio2 ejercicio2;

	public Ejercicio2TestParametrizado (String user,String passwd, boolean resultado) {
	        this.user = user;
	        this.passwd=passwd;
	        this.resultado = resultado;
	
	    }

	@Before
	public void setUp() throws Exception {
		ejercicio2 = new Ejercicio2();
	}

	
	@Parameters
	 public static Collection numeros() {
	      return Arrays.asList(new Object[][] {
	         { "", "password",false},
	      });
	   }
	@Test
	public void testLoginPasswordCadenaVacia() {
		assertFalse(ejercicio2.login(user, passwd));
		
	}

}




