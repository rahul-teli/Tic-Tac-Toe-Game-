package models;

public class Cell {
    int row;
    int col;
    Player player;
    CellState cellstate;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void updateCell(Player player){
        this.cellstate = CellState.OCCUPIED;
        this.player = player;

    }
}
