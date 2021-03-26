/**
 *  Se requiere desarrollar un programa que permita recibir por consola una fecha
 *  y genere la cantidad de segundos desde la hora 00:00:00.
 */

// Se importan los paquetes para pedir datos por consola al usuario.
import java.io.InputStream;
import java.util.Scanner;
/**
 * @author Eulindany Castro Munoz 
 * cod. 100154768
 * eucastro@poligran.edu.co
 *
 */
public class HorasSegundos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Entrada de datos por consola.
		// Instanciacion de la clase System y la clase Scanner.
		InputStream stream = System.in;
		Scanner scanner = new Scanner(stream);
		System.out.println("Defina la hora, minutos y segundos a convertir en segundos, este debe ser en formato 24 horas ");
		System.out.println("ingrese la hora 'ENTER', minutos 'ENTER', segundos 'ENTER'.");
		
		String horas = scanner.next();
		String minutos = scanner.next();
		String segundos = scanner.next();
		/* 
		 * 1- Convertir los string a enteros por medio de un metodo de parseInt.
		 * 2- Se utiliza el try catch para informarle al usuario posible error de entrada de datos.
		 * 3- Validamos el rango de la hora, minutos y segundos para asegurarnos se mantenga en formato de hora.		 * 
		 * */
		try {
			//  Block of code to try
			int hora = Integer.parseInt(horas);
			int minuto = Integer.parseInt(minutos);
			int segundo = Integer.parseInt(segundos);
			if (hora > -1 && hora < 25) {
				if (minuto > -1 && minuto < 61) {
					if (segundo > -1 && segundo < 61) {
						int x = hora * 3600;
						int y = minuto * 60;
						int z = x + y + segundo;
						System.out.println("Los segundos transcurridos desde las 00 horas es:" + z);
					}else{
						System.out.println("El formato de segundos no es valido");
					}
				}else{
					System.out.println("El formato de minutos no es valido");
				}
			}else{
				System.out.println("El formato de hora no es valido");
			}
			}
			catch(Exception e) {
			  //  Block of code to handle errors
				System.out.println("Ingrese la hora correctamente!!!");
			}
		scanner.close();
			
	}
			
}
