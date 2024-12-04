package listasimple;

public abstract class LSimple {
    protected NodoS p;
    
    LSimple(){
        p = null;
    }
    boolean esVacia(){
        return p == null;
    }
    abstract void adiInicio(Object elem);
    abstract void adiFinal(Object elem);
    abstract Object eliInicio();
    abstract Object eliFinal();
    abstract int nroElem();
    abstract void mostrar();
}
/*

    8 2 1 4 3 1 8 4 4 

    8 2 1 4 3

*/








