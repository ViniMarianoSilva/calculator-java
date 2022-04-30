package backEnd;

import java.util.ArrayList;

public class CalcFunctions {
	
	public Double realizaCalculo(ArrayList<String> listaDeValores) {
		Utils utils = new Utils();
		String valor = "";
		String sinal = "";
		Double calculo = 0.0;
		for (int i = 0; i < listaDeValores.size(); i++) {
			
			valor = listaDeValores.get(i);
			sinal = valor.substring(0, 1);
			
			if(sinal.equals("+") || !utils.isOperador(sinal)) {
				calculo = calculo + Double.valueOf(valor);
			}
			
			if(sinal.equals("-")) {
				calculo = calculo + Double.valueOf(valor);
			}
			
			if(sinal.equals("*")) {
				valor = valor.substring(1);
				calculo = calculo * Double.valueOf(valor);
			}
			
			if(sinal.equals("/")) {
				valor = valor.substring(1);
				calculo = calculo / Double.valueOf(valor);
			}
		}
		return calculo;
	}
	
	
}
