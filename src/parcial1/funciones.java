/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author massimo
 */
public class funciones {

    public funciones() {

    }

    public String categoria(int prom) {
        String categoria = "";

        if (0 <= prom && prom <= 500) {
            categoria = "Desecho";
        } else if (501 <= prom && prom <= 900) {
            categoria = "Foamy";
        } else if (901 <= prom && prom <= 1500) {
            categoria = "Carton";

        } else {
            categoria = "PLastico";
        }

        return categoria;
    }

    public void juegos(int prom1, int prom2, int prom3, int prom4) {

        if (Math.abs((prom1 - prom2)) < 100) {
            System.out.println("Equipo 1 y equipo 2 jugaran");

        } else {
            System.out.println("Equipo 1 y equipo 2 No jugaran");

        }
        if (Math.abs((prom1 - prom3)) < 100) {
            System.out.println("Equipo 1 y equipo 3 jugaran");

        } else {
            System.out.println("Equipo 1 y equipo 3 No jugaran");
        }
        if (Math.abs((prom1 - prom4)) < 100) {
            System.out.println("Equipo 1 y equipo 4 jugaran");

        } else {
            System.out.println("Equipo 1 y equipo 4 No jugaran");

        }
        if (Math.abs((prom2 - prom3)) < 100) {
            System.out.println("Equipo 2 y equipo 3 jugaran");

        } else {
            System.out.println("Equipo 2 y equipo 3 No jugaran");
        }

        if (Math.abs((prom2 - prom4)) < 100) {
            System.out.println("Equipo 2 y equipo 4 jugaran");

        } else {
            System.out.println("Equipo 2 y equipo 4 No jugaran");

        }

        if (Math.abs((prom3 - prom4)) < 100) {
            System.out.println("Equipo 3 y equipo 4 jugaran");

        } else {
            System.out.println("Equipo 3 y equipo 4 No jugaran");

        }

    }

    public Pila team(Lista listaJugadores, int equipo) throws Exception {
        Pila team = new Pila();

        listaJugadores.Ordena();

        switch (equipo) {
            case 1:
                team.apilar(Math.round((double) listaJugadores.getValor(0)));
                team.apilar(Math.round((double) listaJugadores.getValor(4)));
                team.apilar(Math.round((double) listaJugadores.getValor(11)));
                team.apilar(Math.round((double) listaJugadores.getValor(15)));

                break;
            case 2:
                team.apilar(Math.round((double) listaJugadores.getValor(1)));
                team.apilar(Math.round((double) listaJugadores.getValor(5)));
                team.apilar(Math.round((double) listaJugadores.getValor(10)));
                team.apilar(Math.round((double) listaJugadores.getValor(14)));

                break;

            case 3:
                team.apilar(Math.round((double) listaJugadores.getValor(2)));
                team.apilar(Math.round((double) listaJugadores.getValor(6)));
                team.apilar(Math.round((double) listaJugadores.getValor(9)));
                team.apilar(Math.round((double) listaJugadores.getValor(13)));

                break;
            case 4:

                team.apilar(Math.round((double) listaJugadores.getValor(3)));
                team.apilar(Math.round((double) listaJugadores.getValor(7)));
                team.apilar(Math.round((double) listaJugadores.getValor(8)));
                team.apilar(Math.round((double) listaJugadores.getValor(12)));

                break;

        }

        return team;

    }
//
//    public void selection(Lista listaJugadores) throws Exception {
//
//        if (listaJugadores.getTamanio() > 0) {
//            this.apilar((double) listaJugadores.getValor(0));
//            this.apilar((double) listaJugadores.getValor(listaJugadores.getTamanio()));
//            this.remover((double) listaJugadores.getValor(0));
//            this.remover((double) listaJugadores.getValor(listaJugadores.getTamanio()));
//            this.apilar((double) listaJugadores.getValor(0));
//            this.apilar((double) listaJugadores.getValor(listaJugadores.getTamanio()));
//            this.remover((double) listaJugadores.getValor(0));
//            this.remover((double) listaJugadores.getValor(listaJugadores.getTamanio()));
//
//        } else {
//            System.out.println("La lisyta esta vacia");
//        }
//
//    }
}
