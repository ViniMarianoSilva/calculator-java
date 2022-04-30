package backEnd;

import java.util.ArrayList;

public class Utils {
	
	public  String[] listaDeCaracteres(String expressao) {
		String[] listaDeCaracteres = new String[9000];
		for (int i = 0; i < expressao.length(); i++) {	
			listaDeCaracteres = expressao.split("(?<=[-+*/])|(?=[-+*/])");
		}
		return listaDeCaracteres;
	}
	
	public ArrayList<String> listaDeValores(String[] listaDeCaracteres){
		String operador = "";
		String numero = "";
		ArrayList<String> numeros = new ArrayList<String>();
		for (int i = 0; i < listaDeCaracteres.length; i++) {
			
			if(isOperador(listaDeCaracteres[i])) {
				operador = listaDeCaracteres[i];
			} else {
				numero = operador + listaDeCaracteres[i];
				numeros.add(numero);
			}
		}
		return numeros;
	}
	
	public boolean isOperador(String caracter) {
		boolean isOperador = false;
		if(caracter.equals("-") || caracter.equals("+") || caracter.equals("*") || caracter.equals("/")) {
			isOperador = true;
		}
		return isOperador;
	}
}
