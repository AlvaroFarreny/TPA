
public class main {

	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6,7,8,9};
		int numero_buscar =3;
		int inicio = 0;
		int fin = (arr.length-1);
		System.out.println(busquedabinaria(arr, numero_buscar, inicio, fin));
		
	}

	
	public static int busquedabinaria(int[] arr ,int numero_buscar, int inicio, int fin) {
		if (inicio > fin) {
			return -1;
		} else {
			int medio = ((inicio+ fin) /2);
			if (arr[medio] == numero_buscar) {
				return medio;
			} else if (arr[medio]>numero_buscar){
				return busquedabinaria(arr, numero_buscar, inicio, medio-1);
			} else {
				return busquedabinaria(arr, numero_buscar, medio+1, fin);
			}
			
		}
		
	}
}
