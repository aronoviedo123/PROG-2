
package prueba;

import java.util.*;

public class ejercicio {
    
    public static void main(String []args){
        Scanner in = new Scanner (System.in);
        
        int n = in.nextInt();
        
        ArrayList<  CSimpleM > lista = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            CSimpleM cola = new CSimpleM();
            cola.llenar(x);
            lista.add(cola);
        }
        
        //5 3 1 2 7 2
        
        int maxi_final=0;
        for (int i = 0; i < n; i++) {
            int maxi=0;
            CSimpleM aux = new CSimpleM();
            aux.copiar(lista.get(i));
            int contador=0;
            boolean uno=true;
            for (int j = 1; j < lista.get(i).nroElem(); j++) {
                int r=aux.first();
                aux.eliminar();
                if(r%2==1 && uno == true){
                    contador=1;
                    uno=false;
                }
                if(r%2==1 && aux.first()%2==1){
                    contador=contador+1;
                }else{
                    maxi=Math.max(maxi,contador);
                    contador=0;
                    uno=true;
                }
            }
            if(uno==true && aux.first()%2==1){
                contador=1;
            }
            maxi=Math.max(maxi,contador);
            maxi_final=Math.max(maxi_final,maxi);

        }
                        System.out.println("COLAS CON MAXIMO N IMPARES CONSECUTIVOS: ");

        for (int i = 0; i < n; i++) {
            int maxi=0;
            CSimpleM aux = new CSimpleM();
            aux.copiar(lista.get(i));
            int contador=0;
            boolean uno=true;
            for (int j = 1; j < lista.get(i).nroElem(); j++) {
                int r=aux.first();
                aux.eliminar();
                if(r%2==1 && uno == true){
                    contador=1;
                    uno=false;
                }
                if(r%2==1 && aux.first()%2==1){
                    contador=contador+1;
                }else{
                    maxi=Math.max(maxi,contador);
                    contador=0;
                    uno=true;
                }
            }
            if(uno==true && aux.first()%2==1){
                contador=1;
            }
            maxi=Math.max(maxi,contador);
            if(maxi_final==maxi && maxi_final>0){
                System.out.println("maxi: "+ maxi_final);
                lista.get(i).mostrar();
            }

        }
        
       
            
        
    }
}
/*
4
4
1 2 3 4
5
6 5 4 3
2
3 5
6
1 2 3 5 6 7


1
8
1 3 5 2 1 1 1 1
**/