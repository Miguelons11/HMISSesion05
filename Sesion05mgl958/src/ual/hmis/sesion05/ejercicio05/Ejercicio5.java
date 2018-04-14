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
			} else if (array[i] == '0' || array[i] == '1' || array[i] == '2' || array[i] == '3' || array[i] == '4'
					|| array[i] == '5' || array[i] == '6' || array[i] == '7' || array[i] == '8' || array[i] == '9') {
				 resultado="Error: cadena con dígito";
				 break;
			} else {
				 resultado = "Error: cadena sin punto";
			}
			
		}
		return resultado;
	}
}
