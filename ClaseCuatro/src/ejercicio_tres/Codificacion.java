package ejercicio_tres;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Base64;

import java.util.Scanner;

public class Codificacion {
		
		Scanner in = new Scanner(System.in);
		private String codDecod;
		private int desplazamiento;
		private String entrada;
		private String fileEntrada;
		private String salida;
		private String fileSalida;
	    private String abecedario = "abcdefghijklmnñopqrstuvwxyz";
	    private String palabraNueva="";
	    private String palabraCodificada;

		
		public Codificacion() {
		
			
			
		}
		


		public String getPalabraCodificada() {
			return palabraCodificada;
		}


		public void setPalabraCodificada(String palabraCodificada) {
			this.palabraCodificada = palabraCodificada;
		}


		public String getAbecedario() {
			return abecedario;
		}


		public void setAbecedario(String abecedario) {
			this.abecedario = abecedario;
		}


		public String getPalabraNueva() {
			return palabraNueva;
		}


		public void setPalabraNueva(String palabraNueva) {
			this.palabraNueva = palabraNueva;
		}


		public String getFileEntrada() {
			return fileEntrada;
		}


		public void setFileEntrada(String fileEntrada) {
			this.fileEntrada = fileEntrada;
		}


		public String getFileSalida() {
			return fileSalida;
		}


		public void setFileSalida(String fileSalida) {
			this.fileSalida = fileSalida;
		}


		public String getCodDecod() {
			return codDecod;
		}


		public void setCodDecod(String codDecod) {
			this.codDecod = codDecod;
		}


		public int getDesplazamiento() {
			return desplazamiento;
		}


		public void setDesplazamiento(int desplazamiento) {
			this.desplazamiento = desplazamiento;
		}


		public String getEntrada() {
			return entrada;
		}


		public void setEntrada(String entrada) {
			this.entrada = entrada;
		}


		public String getSalida() {
			return salida;
		}


		public void setSalida(String salida) {
			this.salida = salida;
		}


		public void pedirInfo() {
			
			System.out.print("Desea coficiar o decodificar el archivo: ");
			setCodDecod(in.nextLine());
			System.out.print("Caracteres a desplazar: ");
			setDesplazamiento(in.nextInt());

			
		}
		
		
		public void leerArchivo() {
			
			try {
				for (String linea : Files.readAllLines(Paths.get(getEntrada()))) {
					setFileEntrada(linea);
					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void escribirArchivo(){
			
				try {
					Files.writeString(Paths.get(getSalida()), getPalabraCodificada(),  StandardOpenOption.APPEND);
					System.out.println("Se escribio archivo correctamente");
				} catch (Exception e) {
					System.out.println("Error al escribir");
				}
		}
		
		public void crearArray() {
			
			
			String arrayABC[] = getAbecedario().split("");
			String arrayEntrada[] = getFileEntrada().split("");
			desplazaCaracter(arrayABC, arrayEntrada);
		}
		
		public void desplazaCaracter(String arregloABC[], String arregloFrase[]) {
			
			
			for (int i = 0; i < arregloFrase.length; i++) {

	            for (int j = 0; j < arregloABC.length; j++) {

	                if (arregloFrase[i].equals(arregloABC[j]) && j<27) {
	                    
	                    setPalabraNueva(palabraNueva= palabraNueva + arregloABC[j+getDesplazamiento()]);
	                    
	                    
	                }else {
	                	
	                }

	               
	            }

	        }
			
			
			

		}
		
		
		public void CodificarDecodificar(){
			


			if(getCodDecod().equals("codificar")) {

				crearArray();
				setPalabraCodificada(Base64.getEncoder().encodeToString(getFileEntrada().getBytes()));
	
				escribirArchivo();
	
			} else if(getCodDecod().equals("decodificar")) {
				 setPalabraCodificada(new String(Base64.getDecoder().decode(getFileEntrada())));
				 setFileEntrada(getPalabraCodificada());
                  crearArray();
                 escribirArchivo();
				
			}
			
			
		}
		


}
