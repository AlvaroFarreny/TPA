
public class main {

	public static void mergesort(int[] arr, int inicio, int fin) {
		if (inicio < fin) {
			int medio = ((inicio+fin)/2);
			int array_izq[] = new int[arr.length+1];
			int array_der[] = new int[arr.length+1];

			for(int i = 0; i<=medio;i++) {
				array_izq[i] = arr[i];
			}
			
			for(int i = medio+1; i<=fin;i++) {
				array_der[i] = arr[i];
			}
			
			mergesort(array_izq, inicio, medio);
			mergesort(array_der, medio+1, fin);
			
			merge(array_izq, array_der, arr, inicio, fin, medio);
			
		}
	
	}
	
	public static void merge(int[] array_izq, int[] array_der, int[] arr, int inicio,int fin, int medio) {
		array_izq[medio+1] = Integer.MAX_VALUE;
		array_der[fin+1] = Integer.MAX_VALUE;
		int i = inicio;
		int j = medio+1;
		
		for(int contador = inicio;  contador <= fin; contador++ ) {
			if(array_izq[i]<array_der[j]) {
				arr[contador] = array_izq[i];
				i++;
			} else {
				arr[contador] = array_der[j];
				j++;
			}
			
		}
	}
	
	public static void main(String[] args) {
		int arr [] = {1,10,3,7,9,4,2,8};
		int inicio = 0;
		int fin = (arr.length-1);
		mergesort(arr, inicio, fin);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}


	}

}