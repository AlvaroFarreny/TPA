public class ArbolBin<T> {
    class NodoBin {
        T info;
        NodoBin hijoIzq;
        NodoBin hijoDcho;
        NodoBin(NodoBin hIzq, T info, NodoBin hDcho) {
            this.hijoIzq = hIzq;
            this.hijoDcho = hDcho;
            this.info = info;
        }
    }
    private NodoBin raiz;

	public ArbolBin() {
	    raiz = null;
	}
	public ArbolBin(ArbolBin<T> subIzq, T infoRaiz, ArbolBin<T> subDcho) {
	    NodoBin izq = subIzq == null? null : subIzq.raiz; 
	    NodoBin dcho = subDcho == null? null : subDcho.raiz; 
	    this.raiz = new NodoBin(izq, infoRaiz, dcho);
	}
	public boolean esVacio() {
	    return raiz == null;
	}
	
	public ArbolBin<T> hijoIzquierdo() {
	    ArbolBin<T> subIzq = new ArbolBin<T>();
	    subIzq.raiz = this.raiz.hijoIzq;
	    return subIzq;
	}
	public T raiz() {
	    return this.raiz.info;
	}
	public ArbolBin<T> hijoDerecho() {
	    ArbolBin<T> subDcho = new ArbolBin<T>();
	    subDcho.raiz = this.raiz.hijoDcho;
	    return subDcho;
	}
}