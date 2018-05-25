package ual.hmis.sesion05.ejercicio05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ual.hmis.sesion05.ejercicio04.Ejercicio4;

class Ejercicio5Test {

	@Test
	void testExistePunto() {
		Ejercicio5 e5=new Ejercicio5();
		
		//2.act
		String resultado= e5.subcadenaHastaPunto("Hola, me llamo Miguel.AAA");
		assertEquals(resultado,"Hola, me llamo Miguel");
	}
	
	@Test
	void testExisteNumero() {
Ejercicio5 e5=new Ejercicio5();
		
		//2.act
		String resultado= e5.subcadenaHastaPunto("Hola, me llamo 9 Miguel.AAA");
		assertEquals(resultado,"Error: cadena con digito");
	}
	
	@Test
	void testNoExistePunto() {
Ejercicio5 e5=new Ejercicio5();
		
		//2.act
		String resultado= e5.subcadenaHastaPunto("Hola, me llamo Miguel");
		assertEquals(resultado,"Error: cadena sin punto");
	}

}
