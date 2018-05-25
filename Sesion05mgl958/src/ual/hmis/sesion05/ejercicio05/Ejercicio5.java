package ual.hmis.sesion05.ejercicio05;

public class Ejercicio5 {

	public String subcadenaHastaPunto(String cadena) {
		boolean a;
		char[] array = cadena.toCharArray();
		String resultado = "";
		for (int i = 0; i < array.length; i++) {

			if (array[i] == '.') {
				resultado = cadena.substring(0, i);
				break;
			} else if (isDigit(array[i])) {
				 resultado="Error: cadena con digito";
				 break;
			} else {
				 resultado = "Error: cadena sin punto";
			}
			
		}
		return resultado;
	}
	public boolean isDigit(char c) {
		return Character.isDigit(c);
	}
}
