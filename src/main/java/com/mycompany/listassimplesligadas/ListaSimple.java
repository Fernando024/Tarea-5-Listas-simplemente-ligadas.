/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listassimplesligadas;

/**
 *
 * @author FernandoR
 */
public class ListaSimple {
    
    Nodo primero;
    Nodo ultimo;
    public ListaSimple()//inicialmenrte esta vacia 
    {
        primero=null;
        ultimo=null;
        
    }
     
    public void ingresarDato(int dato )
    {
        Nodo NuevoNodo=new Nodo();
        
        NuevoNodo.setContenido(dato);
       
        if(primero ==null)//es el primero dato de la lista
        {
            primero=NuevoNodo;
            
            ultimo=primero;
        }
        else
        {
            ultimo.setSiguiente(NuevoNodo);
            NuevoNodo.setSiguiente(null);
            ultimo=NuevoNodo;
        }
        
    }
    
 
    public void verLista()
    {
        Nodo actual =new Nodo();
        actual=primero;
        while(actual !=null )
        {
            System.out.println(actual.getContenido());
            actual=actual.getSiguiente();
        }
       
    }
}
