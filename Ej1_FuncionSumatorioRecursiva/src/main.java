
public class main {

	public static void main(String[] args) {
		System.out.println("SUMATORIO DE VALORES RECURSIVOS");
        int datos[]={3,3,2,2};
 
        System.out.println("La suma del array es: "+ sumar(datos,0));

	}
	
	 static int sumar(int array[], int pos)
	    {
	        if(pos<array.length) {
	            return array[pos]+sumar(array,pos+1);
	        }
	        return 0;
	    }

}
