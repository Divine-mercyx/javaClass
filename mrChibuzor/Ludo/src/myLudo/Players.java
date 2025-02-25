/*package myLudo;

import java.util.ArrayList;

public class Players {

    private String color;
    private ArrayList<Pawn> pawns;

    public Players(String color) {
        this.color = color;
        this.pawns = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            pawns.add(new Pawn());
        }
    }

    public String getColor() {
        return color;
    }

    public ArrayList<Pawn> getPawns() {
        return pawns;
    }

    public boolean hasWon() {
        for (Pawn p : pawns) {
            if (!p.isHome()) {
                return false;
            }
        }
        return true;
    }


}*/