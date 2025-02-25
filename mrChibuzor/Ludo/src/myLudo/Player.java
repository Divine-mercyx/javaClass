package myLudo;

import java.util.ArrayList;

public enum Player {

    RED(6, 1, Direction.EAST),
    BLUE(13, 6, Direction.NORTH),
    YELLOW(8, 13, Direction.WEST),
    GREEN(1, 8, Direction.SOUTH),;

    private int row;
    private int col;
    private Direction direction;
    private ArrayList<Pawn> seeds = new ArrayList<>();


    Player(int row, int col, Direction direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
        for (int index = 0; index < 4; index++) {
            seeds.add(new Pawn(direction));
        };
    }

    public Direction getDirection() {
        return this.direction;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }


}
