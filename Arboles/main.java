package Arboles;

public class main {

    private static int contador=0;

	public static void main(String[] args) {
                ABB a = new ABB();
                NodoAr aux;
		NodoAr padre;
                a.leer();
                
                aux=a.getRaiz();
                padre=a.getRaiz();

                a.m_Nivel();
                
                System.out.println("");
                ABB b = new ABB();
                ver(aux,padre);
                
                a.m_Nivel();
                
                System.out.println("contador: " + contador);
	}

    private static void ver(NodoAr aux, NodoAr padre) {
            
            if(aux.getSi()!=null && aux.getSd()==null){//solo tiene un hijo
                System.out.println("nodo: " + aux.getDato() + " padre: " + padre.getDato());
                ver(aux.getSi(),aux);
                contador=contador+1;

            }else if(aux.getSi()==null && aux.getSd()!=null){//solo tiene un hijo
                System.out.println("nodo: " + aux.getDato() + " padre: " + padre.getDato());
                ver(aux.getSd(),aux);
                contador=contador+1;

            }else if(aux.getSi()!=null && aux.getSd()!=null ){
                 ver(aux.getSi(),aux);
                 ver(aux.getSd(),aux);
            }
    }
        
}
//7 5 9 4 51  2