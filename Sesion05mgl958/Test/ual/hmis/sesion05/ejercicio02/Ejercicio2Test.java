package ual.hmis.sesion05.ejercicio02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ual.hmis.sesion05.ejercicio1.Ejercicio1;

class Ejercicio2Test {

	@Test
	public void testLoginUserNameCadenaVacía() {
		//1.Arrange
		Ejercicio2 e2=new Ejercicio2();
		String username="";
		String password="password";
		//2.act
		Boolean resultado= e2.login(username, password);
		//3.Assert
		assertFalse(resultado);
		
	}
	@Test
	public void testLoginPasswordCadenaVacía() {
		//1.Arrange
		Ejercicio2 e2=new Ejercicio2();
		String username="user";
		String password="";
		//2.act
		Boolean resultado= e2.login(username, password);
		//3.Assert
		assertFalse(resultado);
		
	}
	@Test
	public void testLoginUserNameLongitud() {
		//1.Arrange
		Ejercicio2 e2=new Ejercicio2();
		String username="user121212121212121212121212121212121211212";
		String password="password";
		//2.act
		Boolean resultado= e2.login(username, password);
		//3.Assert
		assertFalse(resultado);
		
	}
	@Test
	public void testLoginPasswordLongitud() {
		//1.Arrange
		Ejercicio2 e2=new Ejercicio2();
		String username="user";
		String password="password1234512345123451234512345123412231233121212";
		//2.act
		Boolean resultado= e2.login(username, password);
		//3.Assert
		assertFalse(resultado);
		
	}

}
