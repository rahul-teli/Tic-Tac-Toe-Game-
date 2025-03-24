package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int N;
    List<List<Cell>> cells = new ArrayList<>();

    public Board(int n) {
        N = n;
        if (N<3) throw new IllegalArgumentException("Board size should be greter than 3");

        for (int i=0; i<N; i++){
            List<Cell> row = new ArrayList<>();
            for(int j=0; j<N; j++){
               row.add(new Cell(i, j));
            }
            cells.add(row);
        }
    }
}
