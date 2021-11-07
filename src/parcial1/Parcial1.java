/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1;

/**
 *
 * @author massimo
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        funciones f = new funciones();

        Lista list = new Lista();
        list.agregarFinal(1);
        list.agregarFinal(2);
        list.agregarFinal(3);
        list.agregarFinal(4);
        list.agregarFinal(5);
        list.agregarFinal(6);
        list.agregarFinal(7);
        list.agregarFinal(8);
        list.agregarFinal(9);
        list.agregarFinal(10);

        System.out.println("\n---------Pregunta 2-----------\n");
        System.out.println("\n---------Lista original-----------\n");
        list.imprimir();

        //Nodo de prueba para sacar el valor 4
        Nodo nodo1 = new Nodo();
        nodo1.setValor(4);

        //Metodo remover ingresando el nodo
        list.removerPorReferencia2(nodo1);
        System.out.println("\n---------Lista con nodo eliminado-----------\n");
        list.imprimir();

//
        System.out.println("\n\n---------Pregunta 1-----------\n");
//
        Pila team1 = new Pila();
        Pila team2 = new Pila();
        Pila team3 = new Pila();
        Pila team4 = new Pila();

        Lista listaJugadores = new Lista();
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));
        listaJugadores.agregarFinal((double) (Math.random() * 2001));

        listaJugadores.Ordena();
        
 /*
        
        PRIMER METODO
        */
 
//        team1.selection(listaJugadores);
//        team2.selection(listaJugadores);
//        team3.selection(listaJugadores);
//        team4.selection(listaJugadores);
//        team1.selection(listaJugadores);
//        team2.selection(listaJugadores);
//        team3.selection(listaJugadores);
//        team4.selection(listaJugadores);
//
//        System.out.println("---------Lista jugadores ordenada-----------\n");
//        listaJugadores.imprimir();
////
//        System.out.println("\n---------Equipo 1-----------\n");
//
////        team1.selection(listaJugadores);
//        team1.imprimir();
//
//        System.out.println("Promedio: ");
//        int prom1 = (int) team1.promedio();
//        System.out.println(prom1);
////
//        System.out.println("Categoria:");
//
//        System.out.println(f.categoria(prom1));
//
//        System.out.println("\n---------Equipo 2-----------\n");
////        team2.selection(listaJugadores);
//        team2.imprimir();
//
//        System.out.println("Promedio: ");
//        int prom2 = (int) team2.promedio();
//        System.out.println(prom2);
//        System.out.println("Categoria:");
//
//        System.out.println(f.categoria(prom2));
//
//        System.out.println("\n---------Equipo 3-----------\n");
////        team3.selection(listaJugadores);
//        team3.imprimir();
//        System.out.println("Promedio: ");
//        int prom3 = (int) team3.promedio();
//        System.out.println(prom3);
//        System.out.println("Categoria:");
//
//        System.out.println(f.categoria(prom3));
//
//        System.out.println("\n---------Equipo 4-----------\n");
////        team4.selection(listaJugadores);
//        team4.imprimir();
//
//        System.out.println("Promedio: ");
//        int prom4 = (int) team4.promedio();
//        System.out.println(prom4);
//        System.out.println("Categoria:");
//
//        System.out.println(f.categoria(prom4));
//
//        System.out.println("\n---------Juegos-----------\n");
//
//        f.juegos(prom1, prom2, prom3, prom4);

        
     /*
        
        SEGUNDO METODO
        */   
     
        System.out.println("---------Lista jugadores ordenada-----------\n");
        listaJugadores.imprimir();
//
        System.out.println("\n---------Equipo 1-----------\n");
        team1 = f.team(listaJugadores, 1);
        team1.imprimir();


        System.out.println("Promedio: ");
        int prom1 = (int) team1.promedio();
        System.out.println(prom1);
//
        System.out.println("Categoria:");

        System.out.println(f.categoria(prom1));
//
        System.out.println("\n---------Equipo 2-----------\n");
        team2 = f.team(listaJugadores, 2);
        team2.imprimir();
//

        System.out.println("Promedio: ");
        int prom2 = (int) team2.promedio();
        System.out.println(prom2);
        System.out.println("Categoria:");

        System.out.println(f.categoria(prom2));
//
        System.out.println("\n---------Equipo 3-----------\n");
        team3 = f.team(listaJugadores, 3);
        team3.imprimir();

        System.out.println("Promedio: ");
        int prom3 = (int) team3.promedio();
        System.out.println(prom3);
        System.out.println("Categoria:");

        System.out.println(f.categoria(prom3));
//
        System.out.println("\n---------Equipo 4-----------\n");
        team4 = f.team(listaJugadores, 4);
        team4.imprimir();

        System.out.println("Promedio: ");
        int prom4 = (int) team4.promedio();
        System.out.println(prom4);
        System.out.println("Categoria:");

        System.out.println(f.categoria(prom4));
        
        System.out.println("\n---------Juegos-----------\n");
        
        f.juegos(prom1, prom2, prom3, prom4);
//        

    }

}
