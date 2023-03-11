package ejercicio_tres;

public class Main {

	public static void main(String[] args) {

		Codificacion codificar = new Codificacion();
		codificar.pedirInfo();
		codificar.setEntrada("C:\\Users\\Gerardo\\Documents\\-CURSO JAVA UTN\\Clase 4\\entrada.txt");
		codificar.setSalida("C:\\Users\\Gerardo\\Documents\\-CURSO JAVA UTN\\Clase 4\\salida.txt");
		codificar.leerArchivo();
		codificar.CodificarDecodificar();


	}

}
