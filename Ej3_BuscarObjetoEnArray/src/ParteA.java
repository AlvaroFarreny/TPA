
/**
 * BUSCAR EN UN ARRAY Y DEVOLVER LA POSICION DE UN OBJETO
 * A) CON BUCLES NORMALES
 * 
 * @author farre
 *
 */

public class ParteA {

	public static int buscarNormal (int[] array, int n){
		int count = 0;
		boolean encotrado = false;

		while(!encotrado && count < array.length){
			if(array[count] == n){
				encotrado = true;
			}else{
				count++;
			}
		}

		return count;  
	}

	public static void main(String[] args) {

		int[] valores = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 

		int numeroabuscar = 3;

		int encontrado = buscarNormal(valores, numeroabuscar);

		System.out.println("La posici�n en la que esta el numero a buscar es: " + (encontrado));

	}

}