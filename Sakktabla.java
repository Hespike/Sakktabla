public class Sakktabla {

    static boolean[][] sakk(int x, int y) {
        boolean[][] tabla = new boolean[x][y];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++){
                tabla[i][j] = (i + j) % 2 == 0;
            }
        }

return tabla;
    }

}
