package util;

public class Util {

	public static String SomenteNumeros(String s) {

		String resultado = "";

		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				resultado += ch;
			}
		}
		return resultado;
	}	
}
