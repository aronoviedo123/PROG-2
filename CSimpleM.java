/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Cristhian1509
 */
public class CSimpleM {
    Scanner in = new Scanner(System.in);
    private int ini, fin, max = 100;
    private int v[] = new int[max + 1];

    public CSimpleM() {
        ini = fin = 0;
    }

    int nroElem() {
        return fin - ini;
    }

    boolean esVacia() {
        if (ini == 0 && fin == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean esLlena() {
        if (fin == max) {
            return true;
        } else {
            return false;
        }
    }

    void adicionar(int elem) {
        if (!esLlena()) {
            fin = fin + 1;
            v[fin] = elem;
        } else {
            System.out.println("Cola Simple Llena");
        }
    }

    int eliminar() {
        int elem = 0;
        if (!esVacia()) {
            ini = ini + 1;
            elem = v[ini];
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola Simple Vacia");
        }
        return elem;
    }

    void vaciar(CSimpleM cola) {
        while (!cola.esVacia()) {
            int elem = cola.eliminar();
            adicionar(elem);
        }
    }
    void copiar(CSimpleM pasar){
        for (int i = 0; i < pasar.nroElem(); i++) {
            int aux=pasar.eliminar();
            adicionar(aux);
            pasar.adicionar(aux);
        }
    }
    int first(){
        int aux=ini+1;
        return v[aux];
    }
    void mostrar() {
        CSimpleM aux = new CSimpleM();
        while (!esVacia()) {
            int elem = eliminar();
            System.out.print( elem+ " ");
            aux.adicionar(elem);
        }
        System.out.println();
        vaciar(aux);
    }

    void llenar(int n) {

        for (int i = 1; i <= n; i++) {
            Scanner leer = new Scanner(System.in);
            int elem=in.nextInt();
            adicionar(elem);
        }
    }
}
