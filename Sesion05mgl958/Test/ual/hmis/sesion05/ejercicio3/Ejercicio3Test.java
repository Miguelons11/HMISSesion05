package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ual.hmis.sesion05.ejercicio02.Ejercicio2;

class Ejercicio3Test {

	@Test
	public void testNúmeroCorrecto() {
		Ejercicio3 e3=new Ejercicio3();
		
		//2.act
		String resultado= e3.CaracteresReturn(6);
		//3.Assert
		assertEquals(resultado,"******");
	}

	@Test
	public void testNúmeroIncorrecto() {
		Ejercicio3 e3=new Ejercicio3();
		
		//2.act
		String resultado= e3.CaracteresReturn(-2);
		//3.Assert
		assertEquals(resultado,"número erróneo");
	}
}
