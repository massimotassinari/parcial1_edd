/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author massimo
 */
public class Cola {

    private Nodo inicio;
    private Nodo Final;
    private int Size;

    public Cola() {
        this.inicio = null;
        this.Final = null;
        this.Size = 0;

    }

    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the Final
     */
    public Nodo getFinal() {
        return Final;
    }

    /**
     * @param Final the Final to set
     */
    public void setFinal(Nodo Final) {
        this.Final = Final;
    }

    /**
     * @return the Size
     */
    public int getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(int Size) {
        this.Size = Size;
    }

    public boolean EsVacio() {

        return inicio == null;

    }

    public void empty() {
        this.inicio = this.Final = null;
        this.Size = 0;
    }

    public void Encolar(Object dato) {
        Nodo nuevo = new Nodo(dato);

        if (EsVacio()) {
            inicio = nuevo;
            Final = nuevo;

        } else {
            Nodo aux = Final;
            aux.setSiguiente(nuevo);
            Final = nuevo;

        }
        Size++;

    }

    public void Desencolar() {

        if (!EsVacio()) {
            inicio = inicio.getSiguiente();
            if (inicio == null) {
                Final = null;

            }
            Size--;

        }
    }

    public Object LeerPrimero() {
        return inicio.getValor();

    }

    public String Imprimir() {
        if (!EsVacio()) {

            String printQueue = "";
            for (int i = 0; i < Size; i++) {
                Nodo actual = inicio;
                Desencolar();
                printQueue += actual.getValor() + ",";
                Encolar(actual);

            }
            System.out.println(printQueue);

        }
        return null;

    }

    public String printRec() {
        return printRec("");
    }
//PARA IMPRIMIR TENCO QUE USAR SOUT EN EL MAIN, ESTO DEVUELVE ES UN STRING

    public String printRec(String queue) {
        if (!EsVacio()) {
            Nodo node = this.inicio;

            queue += node.getValor() + "->";
            this.Desencolar();

            queue = this.printRec(queue);
            this.Encolar(node.getValor());
            return queue;

        }
        return queue + "//";
    }

//    //NUEVO
//    //ORDENAR ASCENDENTEMENTE Y DESCENDENTEMENTE
//    /**
//     *
//     * @param num
//     * @param queue
//     * @return
//     */
//    public Nodo extract(int num, Cola queue) {
//        boolean not_found = true;
//        Nodo temp = (Nodo) queue.LeerPrimero();
//        while (not_found) {
//            queue.Desencolar();
//            if ((int) temp.getValor() == num) {
//                not_found = false;
//            } else {
//
//                queue.Encolar(temp);
//
//                temp = (Nodo) queue.LeerPrimero();
//            }
//        }
//        return temp;
//
//    }
//    
//    public Cola sort_ascending(Cola queue){
//        if(queue.getInicio() !=null){
//            Nodo temp = queue.getInicio();
//            Nodo bigger = queue.getInicio();
//            System.out.println("flag");
////            System.out.println((int)temp.getValor());
//            for (int i = 0; i < queue.getSize(); i++) {
//                
//                if( (int)temp.getValor()> (int)bigger.getValor()){
//                    bigger=temp;
//                    
//                }
//                queue.Desencolar();
//                queue.Encolar(temp);
//                temp = queue.getInicio();
//                
//                
//            }
//            temp=queue.extract((int)bigger.getValor(), queue);
//            queue = sort_ascending(queue);
//            queue.Encolar(temp);
//            
//            
//            
//        }
//        return queue;
//    }

   
}
