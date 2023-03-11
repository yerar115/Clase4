package ejercicio_dos_a;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ManejoArchivo {
		
	String archivo;
	String operacion;
	String linea;
	
		public ManejoArchivo() {
			
			
		}

		public String getLinea() {
			return linea;
		}

		public void setLinea(String linea) {
			this.linea = linea;
		}

		public String getOperacion() {
			return operacion;
		}

		public void setOperacion(String operacion) {
			this.operacion = operacion;
		}

		public String getArchivo() {
			return archivo;
		}

		public void setArchivo(String archivo) {
			this.archivo = archivo;
		}
		
		
		
		public void  leerArchivo() {
			
			
			try {
				for(String linea : Files.readAllLines(Paths.get(getArchivo()))) {
				setLinea(linea);
				System.out.println("Datos de la linea: " + getLinea());
					
				}
			} catch (Exception e) {
				System.out.print("Error en leerArchivo()");
			}
			
			
		}
		
		public void realizarOperacion() {
		
			
			
			String array[]  = getLinea().split("");
			int numeroInt=0;
			int resultado=0;
			
		
			for (int i = 0; i < array.length; i++) {
				
				numeroInt = Integer.parseInt(array[i]);
				
				if (getOperacion()== "suma") {
				resultado+=numeroInt;
					
				} else if(getOperacion()== "multiplicacion") {
					resultado*=numeroInt;
				}
				
				
			}
			
			mostrarResultadoOperacion(resultado);
			
			
			
			

		}
		
		public void mostrarResultadoOperacion(int resultado) {
			
			System.out.println("La suma de los numeros del archivo es: " + resultado);
		}
		
		
}
		



