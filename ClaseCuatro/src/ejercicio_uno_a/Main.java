package ejercicio_uno_a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String orden = "D";
		int numUno = 3;
		int numDos = 7;
		int numTres = 1;

		ordenarNumeros ordenar = new ordenarNumeros(numUno, numDos, numTres, orden);
		ordenar.Acomodar();

	}

}
