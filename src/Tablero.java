public class Tablero {

    /*
        TODO: Implementar metodo limpiarTablero
        valor: 2pto
     */
    public static int[][] limpiarTablero(int[][] tablero) {

        return tablero;
    }

    public static boolean validarTirosDisponibles(int [][] tablero){
        int counter = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == 0) {
                    counter ++;
                }
            }
        }

        if (counter > 0) {
            return true;
        } else {
            System.out.println("ALERTA: \"ESTE JUEGO SE HA ENGATADO, HASTA PRONTO\"");
            return false;
        }
    }

    public static boolean validarFila(int fila) {
        if (fila >= 0 && fila < 3) {
            return true;
        } else {
            return false;
        }
    }

    /*
        TODO: Implementar metodo validarCol
        valor: 1 pto.
     */
    public static boolean validarCol(int col) {
        return false;
    }

    public static boolean validarTiro(int[][] tablero, int fila, int col) {
        if (tablero[fila][col] != 0) {
            System.out.println("ALERTA: \"LA CASILLA YA SE ENCUENTRA OCUPADA, SELECCIONAR UNA DISTINTA\"");
            return false;
        } else {
            return true;
        }
    }

    /*
        TODO: Implementar metodo dibujarTablero
        valor: 2 pto.
     */
    public static void dibujarTablero(int[][] tablero) {

    }

    public static boolean buscarGanadorPorFila(int [][] tablero, int jugador){
        for (int i = 0; i < 3; i ++){
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador){
                return true;
            }
        }
        return false;
    }

    /*
        TODO: Implementar metodo buscarGanadorPorColumna
        valor: 1 pto.
     */
    public static boolean buscarGanadorPorColumna(int [][] tablero, int jugador){

        return false;
    }

    /*
        TODO: Implentar metodo buscarGanadorPorDiagonal
        valor: 2 pto.
     */
    public static boolean buscarGanadorPorDiagonal(int [][] tablero, int jugador){

        return false;
    }
}
