/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import java.util.Scanner;

/**
 *
 * @author Cristhian1509
 */
public class pila {
    private int tope, max = 100;
    private int v[] = new int[max+1];
    
    pila(){
        tope = 0;
    }
    
    int nroElem(){
        return tope;
    }
    
    boolean esLlena(){
        if( tope == max ){
            return true;
        }else{
            return false;
        }
    }
    
    boolean esVacia(){
        if(tope == 0){
            return true;
        }else{
            return false;
        }
    }
    
    void adicionar(int elem){
        if(! esLlena()){
            v[tope +1] = elem;
            tope = tope + 1;
        }else{
            System.out.println("La pila esta Llena");
        }
    }
    
    int eliminar(){
        int elem = 0;
        if(! esVacia()){
            elem = v[tope];
            tope = tope - 1;
        }else{
            System.out.println("La pila esta vacia");
        }
        return elem;
    }
    
    void vaciar(pila pila){ //pasa esta pila a la original
        
        while(!pila.esVacia()){
            int elem = pila.eliminar();
            adicionar(elem);
        }
        
    }
    
    void mostrar(){
        
        pila aux = new pila();
        
        while(!esVacia()){
            int elem = eliminar();
            aux.adicionar(elem);
            System.out.print(elem);
        }
        System.out.println();
        vaciar(aux); // pasa aux a la pila original
        
    }
    
    void llenar(int n){
        Scanner in = new Scanner(System.in);
        for(int i = 1; i<=n; i++){
            System.out.println("Ingresar Datos "+i);
            int x=in.nextInt();
            adicionar(x);
        }
    }
}
