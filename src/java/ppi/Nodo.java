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
public class Nodo {
      public Nodo siguiente=null;
    public mantenimiento dato;

    public Nodo(mantenimiento dato) {
        this.dato=dato ;
    }
    public Nodo() {
    }
}
