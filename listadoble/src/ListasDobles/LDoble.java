
package ListasDobles;


public abstract class LDoble {

    protected NodoD p;

    public LDoble() {
        p = null;
    }

    boolean esVacia() {
        return p == null;
    }

    abstract void adiInicio(Object elem);

    abstract void adiFinal(Object elem);

    abstract Object eliInicio();

    abstract Object eliFinal();

    abstract int nroElem();

    abstract void mostrar();

}