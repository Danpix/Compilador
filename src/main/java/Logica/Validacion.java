package Logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Validacion {
	List<String> CodigoFilas = new ArrayList<String>();
	Map<String, String> codigo_filas_items = new HashMap<>();
	
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
		CodigoFilas.addAll(Arrays.asList(linea));//Separamos cada fila del codigo
		//CodigoFilas.stream().forEach(System.out::println);
		
		String tipodato="Null";
		for (String fila : linea) {
			
            String items[] = fila.split(","); //Separamos cada item de cada fila 
            
            for (int i = 0; i < items.length; i++) {//Cpmparamos si es entero o es cadena o otro tipo
            	if(fila.contains("!i")) {
            		tipodato="Entero";
            		items[i].replace("!i", " ");
            	}else {
            		tipodato="Null";
            	}
            	codigo_filas_items.put(items[i].trim(), tipodato);
             
            }  
        }
				
	}
	
	public void dividir_items() {
		
		 codigo_filas_items.forEach((clave, valor) -> System.out.println("Clave: " + clave + " -> Valor: " + valor));
		
	    
		
	}
}
