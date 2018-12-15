import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TableroTest {

    @Test
    public void testLimpiarTablero() {
        int[][] tablero = {{1, 1, 1}, {2, 2, 2}, {1, 1, 1}};

        tablero = Tablero.limpiarTablero(tablero);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(0, tablero[i][j]);
            }
        }
    }

    @Test
    public void test_hay_tiros_disponibles() {
        int[][] tablero = {{1, 1, 1}, {2, 0, 2}, {1, 1, 1}};
        boolean tirosDisponibles = Tablero.validarTirosDisponibles(tablero);
        assertTrue(tirosDisponibles);
    }

    @Test
    public void test_no_hay_tiros_disponibles() {
        int[][] tablero = {{1, 1, 1}, {2, 1, 2}, {1, 1, 1}};
        boolean tirosDisponibles = Tablero.validarTirosDisponibles(tablero);
        assertFalse(tirosDisponibles);
    }

    @Test
    public void test_hay_ganador_por_fila() {
        int[][] tablero = {{1, 1, 1}, {2, 1, 2}, {0, 0, 0}};
        boolean ganador = Tablero.buscarGanadorPorFila(tablero, 1);
        assertTrue(ganador);
    }

    @Test
    public void test_no_hay_ganador_por_fila() {
        int[][] tablero = {{1, 2, 1}, {2, 1, 2}, {0, 0, 0}};
        boolean ganador = Tablero.buscarGanadorPorFila(tablero, 1);
        assertFalse(ganador);
    }

}
