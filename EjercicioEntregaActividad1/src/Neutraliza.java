/**
 * @author Borja Monsalve
 * @expediente 12345678
 * @fecha 17-03-2022
 *
 */

public class Neutraliza {

	/**
	 * Funcion que resta dos matrices cuadradas NxN: m1-m2
	 * @param m1 Matriz NxN de enteros
	 * @param m2 Matriz NxN de enteros
	 * @return Matriz NxN de enteros resultado de hacer m1-m2
	 */
	private static int[][] resta (int[][] m1, int[][] m2){

		int[][] resultado = new int[m1.length][m1.length];

		for (int fila=0; fila < resultado.length; fila++)
			for (int col=0; col < resultado[fila].length; col++)
				resultado[fila][col] = m1[fila][col] - m2[fila][col];

		return resultado;		
	} 

	// CORREGIR esta función
	public static boolean esNeutralizada_v1 (int[][] m1, int[][] m2) {
		boolean neutraliza = true;
		int[][] matrizResta = resta(m1, m2);

		for (int fila = 0; fila < m1.length; fila++) { 		  // No editar esta línea
			for (int col = 0; col < m1[fila].length; col++) { // No editar esta línea
				if(neutraliza == true)
					if (fila==col)
						if (matrizResta[fila][col] == 1)
							neutraliza = true;
						else
							neutraliza = false;
					else
						if (matrizResta[fila][col] == 0)
							neutraliza = true;
						else
							neutraliza = false;
			}//for
		}//for
		return neutraliza;
	}

	public static boolean esNeutralizada_v2 (int[][] m1, int[][] m2) {
		int[][] matrizResta = resta(m1, m2);

		for (int fila = 0; fila < m1.length; fila++) { 		  // No editar esta línea
			for (int col = 0; col < m1[fila].length; col++) { // No editar esta línea
				if (fila == col) {
					if (matrizResta[fila][col] != 1)
						return false;
				} else {
					if (matrizResta[fila][col] != 0)
						return false;
				}
			}//for
		}//for
		return true; //sentencia insertara para poder compilar
	}

	public static boolean esNeutralizada_DyV (int[][] m1, int[][] m2) {
			if (esIdentidad_DyV(m1) != esIdentidad_DyV(m2)) {
				return false; 
			} else {
				return true;
			}
		}

	public static boolean esIdentidad_DyV (int[][] matriz) {
		return esIdentidad_DyV2(matriz, 0, matriz.length-1); 
	}
	
	private static boolean esIdentidad_DyV2 (int[][] matriz, int inicio, int fin) {
		if(inicio == fin) {
			return comprobar(matriz, inicio);
		} else {
			int mitad = (inicio + fin)/2;
			boolean x = esIdentidad_DyV2(matriz, inicio, mitad);
			boolean y = esIdentidad_DyV2(matriz, mitad+1, fin);
			if(x == false) {
				return false;
			}else if (y == false) {
				return false;
			} else {
				return true;
			}		}
	}
	private static boolean comprobar (int[][] matriz, int inicio){
		if(matriz[inicio][inicio] == 1) {
			for(int i=0; i<matriz.length; i++) {
				if(i!= inicio) {
					if(matriz[inicio][i] != 0) {
						return false;
					}
				}
			}
		}else {
			return false;
		}
		return true;
	}


	public static void main(String[] args) {

		int[][] m1 = {	{2,1,0,0},
				{0,2,0,0},
				{0,0,2,0},
				{0,0,0,2}};

		int[][] m2 = {	{1,1,0,0},
				{0,1,0,0},
				{0,0,1,0},
				{0,0,0,1}};

		int[][] m3 = {	{2,0,0,0},
				{0,2,0,0},
				{0,0,2,0},
				{0,0,0,3}};

		System.out.println("PRUEBA v1:");
		System.out.println(" * esNeutraliza_v1 (m1, m2): " + esNeutralizada_v1(m1, m2));
		System.out.println(" * esNeutraliza_v1 (m3, m1): " + esNeutralizada_v1(m3, m1));
		//Indicar aquí alguna prueba mássi se considera oportuno

		System.out.println("\nPRUEBA v2:");
		System.out.println(" * esNeutraliza_v2 (m1, m2): " + esNeutralizada_v2(m1, m2));
		System.out.println(" * esNeutraliza_v2 (m3, m1): " + esNeutralizada_v2(m3, m1));
		//Indicar aquí alguna prueba mássi se considera oportuno

		System.out.println("\nPRUEBA DyV:");
		System.out.println(" * esNeutraliza_DyV (m1, m2): " + esNeutralizada_DyV(m1, m2));
		System.out.println(" * esNeutraliza_DyV (m3, m1): " + esNeutralizada_DyV(m3, m1));
		//Indicar aquí alguna prueba mássi se considera oportuno

		/* ****** DATOS PERSONALES ****** */

		String miNombre = "Alvaro";
		String misApellidos = "Farreny Boixader";
		String miExpediente = "22056511";

		System.out.println("\nESTUDIANTE:");
		System.out.println(" * Apellidos:\t" + misApellidos);
		System.out.println(" * Nombre:\t" + miNombre);
		System.out.println(" * Expediente:\t" + miExpediente);

		System.out.println("\n*** FIN ***");

	}//main

}//class
