/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author massimo
 */
public class Nodo {
    
      private Object valor;

    private Nodo siguiente;

    public void Nodo() {
        this.setValor((Object) 0);
        this.setSiguiente(null);
    }

    //No se si sirve estop

    /**
     *
     */
    public Nodo() {
        this.setValor((Object) 0);
        this.setSiguiente(null);
    }
    

    public Nodo(Object dato) {
        this.valor = dato;
        siguiente = null;
//        
    }
    //hasta aqui

    /**
     * @return the valor
     */
    public Object getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Object valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
}
