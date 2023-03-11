package ejercicio_uno_a;

public class ordenarNumeros {

	private int nUno, nDos, nTres;
	private String orden;

	public int getnUno() {
		return nUno;
	}

	public void setnUno(int nUno) {
		this.nUno = nUno;
	}

	public int getnDos() {
		return nDos;
	}

	public void setnDos(int nDos) {
		this.nDos = nDos;
	}

	public int getnTres() {
		return nTres;
	}

	public void setnTres(int nTres) {
		this.nTres = nTres;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public ordenarNumeros(int primero, int segundo, int tercero, String orden) {
		setnUno(primero);
		setnDos(segundo);
		setnTres(tercero);
		setOrden(orden);

	}

	public void Acomodar() {
		int arreglo[] = { getnUno(), getnDos(), getnTres() };
		if (getOrden().equals("A")) {

			for (int i = 0; i < arreglo.length - 1; i++) {
				int minimo = i;
				// compara arreglo[0] contra arreglo[1] y arreglo[2]
				// luego compara arreglo[1] contra arreglo[2]
				for (int j = i + 1; j < arreglo.length; j++) {
					if (arreglo[j] < arreglo[minimo]) {
						minimo = j;
					}

				}

				if (i != minimo) {
					// Reemplazo valores. Guardo el valor actual de arreglo[i] en un auxiliar;
					int aux = arreglo[i];
					// guardo el nuevo valor arreglo[minimo] en arreglo[i]
					arreglo[i] = arreglo[minimo];

					// y muevo el valor sacado al otro lado
					arreglo[minimo] = aux;

				}

			}

		}

		if (getOrden().equals("D")) {

			for (int i = 0; i < arreglo.length - 1; i++) {
				int maximo = i;
				// compara arreglo[0] contra arreglo[1] y arreglo[2]
				// luego compara arreglo[1] contra arreglo[2]
				for (int j = i + 1; j < arreglo.length; j++) {
					if (arreglo[j] > arreglo[maximo]) {
						maximo = j;
					}

				}

				if (i != maximo) {
					// Reemplazo valores. Guardo el valor actual de arreglo[i] en un auxiliar;
					int aux = arreglo[i];
					// guardo el nuevo valor arreglo[minimo] en arreglo[i]
					arreglo[i] = arreglo[maximo];

					// y muevo el valor sacado al otro lado
					arreglo[maximo] = aux;

				}

			}

		}
		mostrarPantalla(arreglo);

	}

	public void mostrarPantalla(int arreglo[]) {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("[" + arreglo[i] + "], ");
		}
	}

}
