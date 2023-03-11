package ejercicio_dos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ManejoArchivo {
		
	String archivo;
	String operacion;
	
		public ManejoArchivo() {
			
			
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
		
		
		
		public void leerArchivo() {
			
			
			try {
				for(String linea : Files.readAllLines(Paths.get(getArchivo()))) {
					System.out.println(linea);
					
				}
			} catch (Exception e) {
				System.out.print("Error en leerArchivo()");
			}
			
			
		}
		
		
}
		



