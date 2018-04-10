package ual.hmis.sesion05.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio1Test {

	@Test
	public void testTransformarCaso2() {
		//multiplos de 2
		//1.Arrange
		Ejercicio1 e1=new Ejercicio1();
		int entrada=2;
		//2.act
		int resultado= e1.transformar(entrada);
		//3.Assert
		assertEquals(1,resultado);
	}
	@Test
	public void testTransformarCaso3() {
		//multiplos de 3
		//1.Arrange
		Ejercicio1 e1=new Ejercicio1();
		int entrada=3;
		//2.act
		int resultado= e1.transformar(entrada);
		//3.Assert
		assertEquals(1,resultado);
	}
	@Test
	public void testTransformarCaso5() {
		//multiplos de 5
		//1.Arrange
		Ejercicio1 e1=new Ejercicio1();
		int entrada=5;
		//2.act
		int resultado= e1.transformar(entrada);
		//3.Assert
		assertEquals(1,resultado);
	}
	@Test
	public void testTransformarCasoNi2Ni3Ni5() {
		//multiplos ni de 2 ni de 3 ni de 5
		//1.Arrange
		Ejercicio1 e1=new Ejercicio1();
		int entrada=7;
		//2.act
		int resultado= e1.transformar(entrada);
		//3.Assert
		assertEquals(7,resultado);
	}
	
}
