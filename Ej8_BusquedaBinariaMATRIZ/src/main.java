
public class main {

	public static void main(String[] args) {
		int arr [][] = {{2,4,9,10},
				{7,5,1,13},
				{3,6,12,15},
				{16,17,21,40}};
		
		int numero_buscar = 21;

		int arrayresulado[] = {-1,-1};
		arrayresulado = busqBinariaMatriz(arr, numero_buscar, 0, 0, arr[0].length-1, arr.length-1);
		System.out.println(arrayresulado[0] + ", " + arrayresulado[1]);	
	}

	
	public static int[] busqBinariaMatriz(int[][] miMatriz, int buscado, int inicioC, int inicioF, int finC, int finF){
		int[] resultado = {-1, -1};
		
		if(finC-inicioC < 1){
			if(miMatriz[inicioC][inicioF] == buscado){
				resultado = new int[]{inicioC, inicioF};
			}
		} else {
			if(finF-inicioF < 1){
				int medio = (finC+inicioC)/2;
				
				int[] aux1 = busqBinariaMatriz(miMatriz, buscado, inicioC, inicioF, medio, finF);
				int[] aux2 = busqBinariaMatriz(miMatriz, buscado, medio+1, inicioF, finC, finF);
				
				if (aux1[0] != -1 && aux1[1] != -1){
					resultado = aux1;
				} else if (aux2[0] != -1 && aux2[1] != -1){
					resultado = aux2;
				}
			} else {
				int medio = (finF+inicioF)/2;
				
				int[] aux1 = busqBinariaMatriz(miMatriz, buscado, inicioC, inicioF, finC, medio);
				int[] aux2 = busqBinariaMatriz(miMatriz, buscado, inicioC, medio+1, finC, finF);
				
				if(aux1[0] != -1 && aux1[1] != -1)
				{
					resultado = aux1;
				}
				else if(aux2[0] != -1 && aux2[1] != -1)
				{
					resultado = aux2;
				}
			}
		}	
		return resultado;
	}
}
