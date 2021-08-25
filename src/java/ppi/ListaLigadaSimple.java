/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppi;

import Model.mantenimiento;

/**
 *
 * @author Melani
 */
public class ListaLigadaSimple {
    Nodo cabeza=null;
    Nodo apuntador=null;
    int tamaño=0;
    
    
    public void insertarPrincipioNodo(String nombreServicio, String fechaServicio, String horaServicio, String kilometrajeVehiculo){
Nodo newNodo = new Nodo(new mantenimiento(nombreServicio, fechaServicio, horaServicio, kilometrajeVehiculo));   
if (cabeza == null) {
            cabeza = newNodo;
        } else {
            newNodo.siguiente = cabeza;
            cabeza = newNodo;
            
        }
        tamaño++;
    }


public void insertarFinalNodo(String nombreServicio, String fechaServicio, String horaServicio, String kilometrajeVehiculo){
Nodo newNodo = new Nodo(new mantenimiento(nombreServicio, fechaServicio, horaServicio, kilometrajeVehiculo));   
apuntador = null;
        if (cabeza == null) {
            newNodo = cabeza;
        } else {
            apuntador = cabeza;
            while (apuntador.siguiente != null) {
                apuntador = apuntador.siguiente;
            }
            apuntador.siguiente = newNodo;
            
        }
        tamaño++;
    }

    public int getTamaño() {
        return tamaño;
    }
    
    public void borrarNodo(int posicion){
        Nodo apuntador = cabeza;
        Nodo temporal = null;
        
        if (posicion == 0) {
            temporal = cabeza;
            cabeza = cabeza.siguiente;
            apuntador = cabeza;
            temporal = null;
        }else{
            if (posicion <= tamaño) {
                apuntador = cabeza;
                int contador = 0;
                while (apuntador.siguiente != null && contador < posicion - 1) {                    
                    apuntador = apuntador.siguiente;
                    contador++;
                }
                temporal = apuntador.siguiente;
                apuntador.siguiente = apuntador.siguiente.siguiente;
                tamaño = tamaño - 1;
                temporal = null;
                System.out.println("Nodo eliminado");
            }else{
                System.out.println("La posicion es mayor al tamaño");
            }
        }
    }
    
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay nodos");
        } else {
            apuntador = cabeza;
            while (apuntador.siguiente != null) {
                System.out.println(apuntador.dato.nombreServicio);
                apuntador = apuntador.siguiente;
            }
        }
        System.out.println(apuntador.dato.nombreServicio);
    }
    
    
    public void destruirLista(){
        Nodo apuntador = null;
        cabeza = null;
    }
    
    public void destruir() {
        cabeza = null;
        apuntador = null;
        
    }
    
    
      public mantenimiento ObtenerMantenimiento(int index) {
      Nodo apuntador = null;
        if (cabeza != null) {
            apuntador = cabeza;            
            int contador = 0;
            while (contador < index) {
                apuntador = apuntador.siguiente;
                contador = contador + 1;
            }
            
        } else {
            System.out.println("Esa lista está vacia");
        }
        return apuntador.dato;
    }

}