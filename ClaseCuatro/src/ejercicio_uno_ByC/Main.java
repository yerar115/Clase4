package ejercicio_uno_ByC;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Ingresa A si desea ordenar Ascendente o D si desea ordenar Descendente: ");
        String orden = in.nextLine();
        
        System.out.print("Ingresa el primer numero: ");
        int numUno = in.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int numDos = in.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        int numTres= in.nextInt();

        
        ordenarNumeros ordenar = new ordenarNumeros(numUno, numDos,numTres,orden);
        ordenar.Acomodar();
        


    }

}
