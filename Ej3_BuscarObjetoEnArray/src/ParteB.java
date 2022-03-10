/**
 * BUSCAR EN UN ARRAY Y DEVOLVER LA POSICION DE UN OBJETO
 * A) CON BUCLES NORMALES
 * B) DE FORMA RECURSIVA
 * 
 * @author farre
 *
 */

public class ParteB {
	
	public static int Buscar(int[] valores, int numeroabuscar, int i) {
		if (valores[i] == numeroabuscar) {
			return i;
		} else {
			return Buscar(valores, numeroabuscar, i+1);
		}
	}
	
	
	public static void main(String[] args) {
		int[] valores = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	
		int numeroabuscar = 9;
		
		int posactualdelarray = 0;
		
		System.out.println("La posición en la que esta el numero a buscar es: " + (Buscar(valores, numeroabuscar, posactualdelarray) +1));

	}

}
