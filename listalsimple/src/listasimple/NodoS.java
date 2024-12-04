
package listasimple;

public class NodoS {
    private Object elemento;
    private NodoS sig;
    
    NodoS(){
        sig = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NodoS getSig() {
        return sig;
    }

    public void setSig(NodoS sig) {
        this.sig = sig;
    }
}