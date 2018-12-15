public class Tablero {

    public static int[][] limpiarTablero(int[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0;
            }
        }
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

    public static boolean validarCol(int col) {
        if (col >= 0 && col < 3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarTiro(int[][] tablero, int fila, int col) {
        if (tablero[fila][col] != 0) {
            System.out.println("ALERTA: \"LA CASILLA YA SE ENCUENTRA OCUPADA, SELECCIONAR UNA DISTINTA\"");
            return false;
        } else {
            return true;
        }
    }

    public static void dibujarTablero(int[][] tablero) {
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %s | %s | %s \n", tablero[i][0], tablero[i][1], tablero[i][2]);
        }
    }

    public static boolean buscarGanadorPorFila(int [][] tablero, int jugador){
        for (int i = 0; i < 3; i ++){
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador){
                return true;
            }
        }
        return false;
    }

    public static boolean buscarGanadorPorColumna(int [][] tablero, int jugador){
        for (int j = 0; j < 3; j ++){
            if (tablero[0][j] == jugador && tablero[1][j] == jugador && tablero[2][j] == jugador){
                return true;
            }
        }
        return false;
    }

    public static boolean buscarGanadorPorDiagonal(int [][] tablero, int jugador){
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        } else if (tablero[2][0] == jugador && tablero[1][1] == jugador && tablero[0][2] == jugador){
            return true;
        } else {
            return false;
        }
    }
}
