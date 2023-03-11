package ejercicio_dos_a;

public class Main {

	public static void main(String[] args) {

		ManejoArchivo manejo = new ManejoArchivo();
		manejo.setArchivo("C:\\Users\\Gerardo\\Documents\\-CURSO JAVA UTN\\Clase 4\\ejercicioDos.txt");
		manejo.setOperacion("suma");
		manejo.leerArchivo();
		manejo.realizarOperacion();
		
	}

}
