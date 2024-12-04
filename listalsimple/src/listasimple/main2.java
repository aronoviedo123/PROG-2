
package listasimple;
import java.util.*;

public class main2 {
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    
    LSNormal a = new LSNormal();
    LSNormal b = new LSNormal();
    LSNormal aux1 = new LSNormal();
    LSNormal aux2 = new LSNormal();
    int n1=0; n1= in.nextInt();
    for (int i = 0; i < n1; i++) { int x=in.nextInt();a.adiFinal(x);}
    
    int n2= in.nextInt();
    for (int i = 0; i < n2; i++) { int x=in.nextInt();b.adiFinal(x);}
    
    for (int i = 0; i < n1; i++) {
        int x=(int)a.eliInicio();
        if(x%2==0){
            a.adiFinal(x);
        }else{
            b.adiFinal(x);
        }
    }
     for (int i = 0; i < n2; i++) {
        int x=(int)b.eliInicio();
        if(x%2==0){
            a.adiFinal(x);
        }else{
            b.adiFinal(x);
        }
    }
     
         System.out.println("PARES");
    a.mostrar();
    System.out.println("IMPARES");
    b.mostrar();
    
/*
    6
    8 7 6 3 9 10 
    6
    6 9 5 3 1 42

    8 6 10 6 42
    7 3 9 9 5 3 1
**/
    /*
    for (int i = 0; i < n1; i++) {
        int x=(int)a.eliInicio();
        if(x%2==0){
            aux2.adiFinal(x);
        }else{
            aux1.adiFinal(x);
        }
    }
     for (int i = 0; i < n2; i++) {
        int x=(int)b.eliInicio();
        if(x%2==0){
            aux2.adiFinal(x);
        }else{
            aux1.adiFinal(x);
        }
    }
    System.out.println("PARES");
    aux2.mostrar();
    System.out.println("IMPARES");
    aux1.mostrar();
    */
    
    
    }
}

