package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {

	public String CaracteresReturn(int number) {
		String resultado="";
		if(number>=0) {
		for(int i=0;i<number;i++) {
			resultado+="*";
		}
		return resultado;
		}else {
			return "número erróneo";
		}
	}
}
