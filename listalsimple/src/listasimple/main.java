
package listasimple;

import java.util.*;
public class main {

public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    
    int n=in.nextInt();
    LSNormal listar = new LSNormal();
    //LSNormal listar2 = new LSNormal();


    for (int i = 0; i < n; i++) {
        int x= in.nextInt();
        listar.adiFinal(x);
    }
    
    NodoS primer = listar.getP();
    for (int i = 1; i <= n; i++) {
        NodoS aux = primer;
        boolean si = false;
        int dato=0;
        dato = (int) listar.eliFinal();          
        for (int j = 1; j <= n-i; j++) {
            int x=(int)aux.getElemento();
            if(dato==x){
                si=true;
            }
            // 3 3 3
            aux=aux.getSig();
        }
        if(si==false){
            listar.adiInicio(dato);
        }
    }
    System.out.println("LISTA FINAL:");
    listar.mostrar();
   /*
     NodoS dato =listar.getP();
    for (int i = 0; i < n; i++) {
        boolean si = false;
        NodoS aux = listar.getP();
        for (int j = 0; j < i-1; j++) {
            System.out.println(dato.getElemento() + " " + aux.getElemento());
            if(dato.getElemento()==aux.getElemento()){
                si=true;
            }
            aux=aux.getSig();
        }
        if(si==false){
            listar2.adiFinal(dato.getElemento());
        }
        dato=dato.getSig();
    }
    listar2.mostrar();
    */
    
    }
}
