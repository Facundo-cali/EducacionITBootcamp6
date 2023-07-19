import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Jsonify {
	public static void main(String[] args) {
		//creo lista y uso "stream" de la clase "Arrays" para convertir el array de argumentos en un flujo de elementos. 
		List<String> listaArgumentos = Arrays.stream(args)
				//map para formatear cada argumento con comillas dobles utilizando el método "String.format"
			.map(arg-> String.format ("\"%s\"", arg))
			//collect para tomar esos elementos del flujo y acumularlos en una lista.
			.collect(Collectors.toList());
		String JSON = String.join(",", listaArgumentos);//Concatenamos todos los elementos en una sola cadena, usando join. Usamos una coma como separador entre los elementos.
		System.out.println(String.format("{\"data\":[%s]}", JSON));	//Mostramos por consola
	}
}