package Logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {
	List<String> CodigoFilas = new ArrayList<String>();
	
	public void Validar_id(String Cadena) {
	    String regex = "^[A-Za-z]\\.[a-z$!?_]{1,50}$";
        String cadena = Cadena;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cadena);

        if (matcher.matches()) {
            System.out.println(cadena + " es un id Valido.");
        } else {
            System.out.println(cadena + " no es id invalido.");
        }
	}
	public void dividir_filas(String Cadena) {
		
		String linea[] = Cadena.split(";");
		
		
		//Arrays.stream(linea).forEach(System.out::println);
		CodigoFilas.addAll(Arrays.asList(linea));
		CodigoFilas.stream().forEach(System.out::println);
	}
}
