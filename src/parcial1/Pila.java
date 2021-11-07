/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author massimo
 */
public class Pila {

    // Inicio
    private Nodo inicio;
    //Tamaño
    private int tamanio;

    //constructor
    public void Pila() {
        inicio = null;
        tamanio = 0;
    }

    //Consulta si es vacia o no
    public boolean esVacia() {
        return inicio == null;
    }

    //Devuelve el numero de elementos de la lista
    public int getTamanio() {
        return tamanio;
    }

    //Agrega un nodo a la pila 
    public void apilar(double valor) {

        Nodo nuevo = new Nodo();

        nuevo.setValor(valor);

        if (esVacia()) {

            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }

        tamanio++;
    }
    //Quita un nodo de la pila

    public void retirar() {
        if (!esVacia()) {

            inicio = inicio.getSiguiente();

            tamanio--;
        }
    }

    //Elimina la pila
    public void eliminar() {

        inicio = null;

        tamanio = 0;
    }

    //COnsulta el valor del nodo en el tope
    public Object tope() throws Exception {
        if (!esVacia()) {
            return inicio.getValor();
        } else {
            throw new Exception("");
        }
    }

    //Imprime en consola los elementos de la lista
    public void imprimir() {

        Nodo aux = inicio;

        while (aux != null) {
            System.out.println("(\t" + aux.getValor() + "\t)");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }

    //Busca un nodo mediante su valor de referencia
    public boolean buscar(double referencia) {

        Nodo aux = inicio;

        boolean existe = false;

        while (existe != true && aux != null) {

            if (referencia == (double) aux.getValor()) {

                existe = true;
            } else {

                aux = aux.getSiguiente();
            }
        }

        return existe;
    }

    //Elimina un valor por su valor de referencia
    public void remover(double referencia) {

        if (buscar(referencia)) {

            Nodo pilaAux = null;

            while (referencia != (double) inicio.getValor()) {

                Nodo temp = new Nodo();

                temp.setValor(inicio.getValor());

                if (pilaAux == null) {

                    pilaAux = temp;
                } else {
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }

                retirar();
            }

            retirar();

            while (pilaAux != null) {

                apilar((double) pilaAux.getValor());

                pilaAux = pilaAux.getSiguiente();
            }

            pilaAux = null;
        }
    }

    //Actualiza un valor en la pila con su valor de referencia y el valor nuevo
    public void editar(double referencia, double valor) {

        if (buscar(referencia)) {

            Nodo pilaAux = null;

            while (referencia != (double) inicio.getValor()) {

                Nodo temp = new Nodo();

                temp.setValor(inicio.getValor());

                if (pilaAux == null) {

                    pilaAux = temp;
                } else {
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }

                retirar();
            }

            inicio.setValor(valor);

            while (pilaAux != null) {

                apilar((double) pilaAux.getValor());

                pilaAux = pilaAux.getSiguiente();
            }

            pilaAux = null;
        }
    }

    public void Copiar(Pila origen, Pila copia) throws Exception {

        double elemento = 0;

        if (!origen.esVacia()) {
            elemento = (double) origen.tope();
            origen.retirar();
            Copiar(origen, copia);
            origen.apilar(elemento);
            copia.apilar(elemento);

        }

    }

    public Pila reverse() throws Exception {
        Pila pilita = new Pila();
        int Size = this.tamanio;

        for (int i = 0; i < Size; i++) {
            pilita.apilar((double) this.tope());
            this.retirar();

        }

//        Nodo nodo = this.inicio;
//        
//        this.retirar();
//        if(nodo!=null){
//            this.reverse();
//            this.apilar(nodo.getValor());
//        }
        return pilita;
    }

    public void invertir(Pila origen, Pila copia) throws Exception {
        double elemento = 0;

        if (!origen.esVacia()) {
            elemento = (double) origen.tope();
            origen.retirar();
            copia.apilar(elemento);
            invertir(origen, copia);
            origen.apilar(elemento);

        }

    }
//EL QUE MEJOR INVIERTE VOLTEA ETC

    public void voltear() throws Exception {

        Pila reverse = new Pila();
        reverse.Copiar(this, reverse);

        while (this.tamanio != 0) {
            this.retirar();
        }

        while (reverse.tamanio != 0) {

            this.apilar((double) reverse.tope());
            reverse.retirar();

        }

    }

    //El reverse de la clase
    public void reversa() {
        if (!this.esVacia()) {
            Nodo node = this.inicio;
            this.retirar();
            this.reversa();
            this.submerge((double) node.getValor());
        }
    }

    public double Suma() throws Exception {

        double total = 0;
        int count = 0;
        int Size = this.tamanio;

        while (count != Size) {
            total += (double) this.tope();
            this.retirar();
            count++;

        }

        return total;

    }

    public double promedio() throws Exception {
        int Size = this.tamanio;
//        System.out.println(Size);
//        System.out.println(Suma());

        double prom = (double) Suma() / (double) Size;
        return prom;

    }

    //inserta al final de la pila
    public void submerge(double data) {
        if (!this.esVacia()) {
            Nodo node = this.inicio;
            this.retirar();
            this.submerge(data);
            this.apilar((double) node.getValor());

        } else {
            this.apilar(data);

        }

    }

    //inserta al en una posicion especifica de la pila
    //Este es el que se usa en el main, valor e index
    public void insertMid(double data, int pos) {
        this.insertMid(data, pos, 0);

    }

    public void insertMid(double data, int pos, int i) {
        if (i < pos) {
            Nodo node = this.inicio;
            this.retirar();
            this.insertMid(data, pos, i + 1);
            this.apilar((double) node.getValor());

        } else {
            this.apilar(data);

        }

    }

    public void selection(Lista listaJugadores) throws Exception {

        if (listaJugadores.getTamanio() > 0) {
            this.apilar((double) listaJugadores.getValor(0));
            this.apilar((double) listaJugadores.getValor(listaJugadores.getTamanio() - 1));
            listaJugadores.removerPorPosicion(0);
            listaJugadores.removerPorPosicion(listaJugadores.getTamanio() - 1);


        } else {
            System.out.println("La lisyta esta vacia");
        }

    }

}
