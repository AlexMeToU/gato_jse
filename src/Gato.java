import java.util.Scanner;

public class Gato {
    public static int tablero[][];
    public static String menu = "\n ========= ** MENU *** ========\n" +
            "\t 1) Iniciar Juego \n" +
            "\t 0) Salir \n" +
            " ========= *********** ========\n";


    public static void main(String[] args) {
        int opc;
        tablero = new int[3][3];
        Scanner sc = new Scanner(System.in);


        do {
            mostrarMenu();
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    iniciarJuego(sc);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opc != 0);
    }

    public static void mostrarMenu() {
        System.out.println(menu);
    }

    public static void iniciarJuego(Scanner sc) {
        System.out.println("Iniciando el Juego");
        Tablero.limpiarTablero(tablero);

        boolean finJuego = false;
        int jugador1 = 1;
        int jugador2 = 2;

        while (!finJuego) {
            finJuego = realizarJugada(sc, jugador1);
            if (!finJuego) {
                finJuego = realizarJugada(sc, jugador2);
            }
        }
    }

    public static boolean realizarJugada(Scanner sc, int jugador) {
        boolean tirosDispoibles = Tablero.validarTirosDisponibles(tablero);
        boolean finJuego;

        if (tirosDispoibles) {
            System.out.println("-----------------------------");
            System.out.println(" - Turno Jugador " + jugador);
            Jugador.tirar(tablero, sc, jugador);
            finJuego = hayGanador(tablero, jugador);
            System.out.println("-----------------------------");
        } else {
            finJuego = true;
        }

        return finJuego;
    }

    public static boolean hayGanador(int[][] tablero, int jugador) {
        String mensaje = "¡¡¡¡¡¡¡¡¡¡ Felicidades Jugador %s has ganado !!!!!! \n";

        if (Tablero.buscarGanadorPorColumna(tablero, jugador)) {
            System.out.printf(mensaje, jugador);
            return true;
        }

        if (Tablero.buscarGanadorPorFila(tablero, jugador)) {
            System.out.printf(mensaje, jugador);
            return true;
        }

        if (Tablero.buscarGanadorPorDiagonal(tablero, jugador)) {
            System.out.printf(mensaje, jugador);
            return true;
        }

        return false;
    }

}
