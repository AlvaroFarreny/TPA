/**
 * Implementar una función que utilizando la estrategia de “Divide y Vencerás”, 
 * determine si dos arrays de números enteros son uno el inverso del otro. 
 * 
 * @author Alvaro Farreny Boixader
 * Tecnicas de Programación Avanzadas
 * 
 */


public class Ejercicio2 {

	public static void main(String[] args) {
		int a1 [] = {1,2,3,4,5,6,7,8,9};
		int a2 [] = {9,8,7,6,5,4,3,2,1};
		
		int inicioarr1 = 0;
		int finarr1 = (a1.length-1);
		
		int inicioarr2 = 0;
		int finarr2 = (a2.length-1);
		
		System.out.println(calcular(a1, a2, inicioarr1, inicioarr2, finarr1, finarr2));

	}

	public static boolean calcular(int arr1[], int arr2[], int i1, int i2, int f1, int f2) {
		if (arr1.length != arr2.length) { //comprobamos longitudes
			return false;
		} else if (i1==f1 && i2==f2){ // caso cuando el inicio del primero sea igual al final es decir tama´ño 1:1
			return arr1[i1] == arr2[f2]; //hacemos la comparacion y si es true sera correcta y si no false
		} else {
			if (arr1[i1] == arr2[f2]) { //recursividad
				return calcular(arr1, arr2, i1+1, i2, f1, f2-1);
			} else {
				return false;
			}
		}
	}
}
