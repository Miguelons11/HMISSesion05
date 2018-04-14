package ual.hmis.sesion05.ejercicio04;

public class Ejercicio4 {

	public String caracteresNoComunesReturn(String p1,String p2) {
		String resultado="";
		Boolean comun;
		char[] array1=p1.toCharArray();
		char[] array2=p2.toCharArray();
		for(int i=0;i<array1.length;i++) {
			comun=false;
			for(int j=0;j<array2.length;j++) {
			if(array1[i]==array2[j]) {
				comun=true;
			}
		
			}
			if(comun==false) {
				resultado+=array1[i];
			}
		}
		return resultado;
	}
}
