/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insertar;

import java.util.Scanner;

/**
 *
 * @author Cristhian1509
 */
public class CCircularD {

    private int ini, fin, max = 100;
    private int v[] = new int[max + 1];

    public CCircularD() {
        ini = fin = 0;
    }

    int nroElem() {
        if (ini == 0 && fin == 0) {
            return 0;
        } else if (fin > ini) {
            return fin - ini;
        } else {
            return max - (ini - fin);
        }
    }

    boolean esVacia() {
        if (nroElem() == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean esLlena() {
        if (nroElem() == max) {
            return true;
        } else {
            return false;
        }
    }

    void adicionar(int elem) {
        if (!esLlena()) {
            fin = fin + 1;
            v[fin] = elem;
            if (fin == max) {
                fin = 0;
            }
        } else {
            System.out.println("Cola Circular Llena");
        }
    }

    int eliminar() {
        int elem = 0;
        if (!esVacia()) {
            ini = ini + 1;
            elem = v[ini];
            if (fin == ini) {
                ini = fin = 0;
            }

            if (ini == max) {
                ini = 0;
            }
        } else {
            System.out.println("Cola Circular Vacia");
        }
        return elem;
    }

    void vaciar(CCircularD cola) {
        int elem = 0;
        while (!cola.esVacia()) {
            elem = cola.eliminar();
            adicionar(elem);
        }
    }
    int first(){
        return v[ini+1];
    }

    void copiar(CCircularD aux){
        for (int i = 0; i < aux.nroElem(); i++) {
            int x=aux.eliminar();
            adicionar(x);
            aux.adicionar(x);
        }
    }
    
    void mostrar() {
        int elem = 0;
        CCircularD aux = new CCircularD();
        while (!esVacia()) {
            elem = this.eliminar();
            System.out.print(elem + " ");
            aux.adicionar(elem);
        }
        System.out.println();
        vaciar(aux);
    }

    void llenar(int n) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("<-- Llenado de datos -->");
        for (int i = 0; i < n; i++) {
            x=in.nextInt();
            adicionar(x);
        }
    }
}
