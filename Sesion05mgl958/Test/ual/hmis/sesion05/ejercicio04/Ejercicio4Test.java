package ual.hmis.sesion05.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ual.hmis.sesion05.ejercicio3.Ejercicio3;

class Ejercicio4Test {

	@Test
	void comprobarCadenaCorrecta() {
		Ejercicio4 e4=new Ejercicio4();
		
		//2.act
		String resultado= e4.caracteresNoComunesReturn("odin", "perro");
		//3.Assert
		assertEquals(resultado,"din");
	}
		
	}

