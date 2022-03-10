/**
 * Programar un método que haciendo uso de 2 bucles y recibiendo
 * un número entero "n" se encargue de imprimir un triangulo con "n"
 * caracteres por cateto.
 * 
 *
 * @author farre
 *
 */


public class main {

	public static void main(String[] args) {
		int numero = 10;
		//printTriangle (numero);
		
		//forma bonita
		
		for (int i = 0; i<numero; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
				}
			System.out.println(" ");
		}
	}
	
	/*
	 * public static String printTriangle (int count) {  //forma fea
		if ( count <= 0 ) return ""; 
			String p = printTriangle(count - 1); 
			p = p + "*"; 
			System.out.print(p); 
			System.out.print("\n"); 
		return p; 
	}
	*/

}
