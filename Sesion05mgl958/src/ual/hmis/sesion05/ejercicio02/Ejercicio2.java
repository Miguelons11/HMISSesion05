package ual.hmis.sesion05.ejercicio02;

public class Ejercicio2 {

	public boolean login(String username,String password) {
		//comprobar  que sean distintos de vacio
		if(username==""||password=="") {
			return false;
			//comprobar que la longitud sea menor de 30
		}else if(username.length()>=30||password.length()>=30) {
			return false;
		}else {
			return compruebaLoginEnBD(username,password);
		}	
	}
		//llamar al metodo de la breturn compruebaLoginEnBD();
	
	public boolean compruebaLoginEnBD(String username, String password) {
		//metodo mock
		if(username=="user" && password=="password") {
			return true;
		}else { 
			return false;
	}
}
}