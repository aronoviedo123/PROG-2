package ListasDobles;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
        
        int n = in.nextInt();
        LDNormal lista= new LDNormal();
        int pares=0,impares=0;
        for (int i = 0; i < n; i++) {
            int x=in.nextInt();
            if(x%2==0)pares+=1;
            else impares+=1;
            lista.adiFinal(x);
        }
        
        for (int i = 0; i < pares; i++) {
            int mini=1000000000;
            NodoD dato = lista.getP();
            for (int j = 0; j < n-i; j++) { // agarro el minimo par
                int x= (int) dato.getElemento();
                if(x%2==0)
                    mini=Math.min(mini,x);
                dato = dato.getSig(); 
            }
            dato = lista.getP();
            int repetidos=0;
            for (int j = 0; j < n-i; j++) {
                if(lista.getP)
            }
 
        }
        
    }
    
}
/*
1. Dada una lista doble normal ordenar de manera ascendente los
pares y a continuación los impares descendentemente no utilizar
nuevos nodos.

ejm:   8 3 2 7 5 10 1
       8 3 7 5 10 1 2
       3 7 5 10 1 2 8
       

       8 3 7 5 10 1 2
       8 3 7 5 10 1 2//8
       3 7 5 10 1 2 8//10
       3 7 5 1 2 8 10

       
       
       


2. Dadas dos listas circulares con datos enteros colocar en una
lista los datos que son menores a un dato de referencia Q y los
mayores deberán estar en la otra lista.

A) Libre b) no utilizar nuevos nodos adicionales.

3. Implementar en Java el siguiente problema: La empresa “El buen
vino” que se dedica a la venta de una variedad de vinos además se
conoce que tiene varias sucursales donde trabajan varios empleados.

Se pide:

a) Diseñar la estructura de clases respectiva respectivo

b) ¿Cuántas sucursales tiene la empresa?

c) ¿Cuantos empleados tiene la sucursal de nombre M

d) ¿Cuál es la edad promedio de los empleados en toda la empresa?

e) ¿Cuál es la sucursal que vendió más productos?

f) El gerente decidió despedir al empleado Z

g) Impl ementar la venta de un vino

h) ¿Cuál es el nombre de la sucursal donde existen más vinos?

i) ¿Cuál es el producto más vendido?

j) Adicionar a un empleado de modo que la nómina de empleados permanezca ordenada.
*/
