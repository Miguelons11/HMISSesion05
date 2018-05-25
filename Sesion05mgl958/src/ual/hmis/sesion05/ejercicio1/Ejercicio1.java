package ual.hmis.sesion05.ejercicio1;

public class Ejercicio1 {
	public int transformar (int x) {
		if (x % 2 == 0) // % Resto de una division entre enteros (mod)
			return transformar (x / 2);
		else if (x % 3 == 0)
			return transformar ( x / 3 );
		else if (x % 5 == 0)
			return transformar (x / 5);
		else return x;
		
		}
}
