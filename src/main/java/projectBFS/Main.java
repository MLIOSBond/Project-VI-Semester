package projectBFS;

import java.util.LinkedList;
import java.util.Queue;


public class Main {
    /* edited something */
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 0, 1, 10},
                {1, 0, 0, 1},
                {1, 2, 0, 0},
                {0, 3, 0, 0}
        };
        Bfs bfs = new Bfs();
        bfs.setMatrix(matrix);
    }
}

