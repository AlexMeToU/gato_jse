import java.util.Scanner;

public class Jugador {

    public static String mensajeFila = "\t 1) Ingresa Fila: ";
    public static String mensajeCol = " \t 2) Ingresa Columna: ";

    public static int[][] tirar(int[][] tablero, Scanner sc, int jugador) {
        boolean isFinTurno;

        do {
            int fila = seleccionarFila(sc);
            int col = seleccionarCol(sc);

            isFinTurno = Tablero.validarTiro(tablero, fila, col);
            if (isFinTurno) {
                tablero[fila][col] = jugador;
                Tablero.dibujarTablero(tablero);
            }
        } while (!isFinTurno);

        return tablero;
    }

    public static int seleccionarFila(Scanner sc) {
        boolean isFilaValida;
        int fila;

        do {
            System.out.println(mensajeFila);
            fila = sc.nextInt();
            isFilaValida = Tablero.validarFila(fila);
            if (!isFilaValida) {
                System.out.println("ALERTA: \"FILA INVALIDA\"");
            }
        } while (!isFilaValida);

        return fila;
    }

    /*
    TODO: Implementar el metodo seleccionarCol
    Valor: 1 pto
     */
    public static int seleccionarCol(Scanner sc) {
        return -1;
    }

}
