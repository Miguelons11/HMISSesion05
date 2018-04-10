package ual.hmis.sesion05.ejercicio02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ual.hmis.sesion05.ejercicio1.Ejercicio1;

class Ejercicio2Test {

	@Test
	public void testLoginUserNameCadenaVacía() {
		//1.Arrange
		Ejercicio2 e2=new Ejercicio2();
		String username="1234";
		String password="1234";
		//2.act
		Boolean resultado= e2.login(username, password);
		//3.Assert
		assertTrue(resultado);
		
	}
	@Test
	public void testLoginLongitud() {
		//1.Arrange
		Ejercicio2 e2=new Ejercicio2();
		String username="12345123451234512345123451234";
		String password="12345123451234512345123451234";
		//2.act
		Boolean resultado= e2.login(username, password);
		//3.Assert
		assertTrue(resultado);
		
	}

}
