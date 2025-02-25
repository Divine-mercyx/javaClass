/*package myLudo;

import java.util.HashMap;
import java.util.Random;

public class Board {
    private Players[] players;
    private int currentPlayerIndex;
    private Random random;
    private HashMap<Integer, Players> positions;

    public Board(Players[] players) {
        this.players = players;
        this.currentPlayerIndex = 0;
        this.random = new Random();
        this.positions = new HashMap<>();
    }

    public int rollDice() {
        return random.nextInt(6) + 1;
    }

    public void movePlayer(int diceValue) {
        Players currentPlayer = players[currentPlayerIndex];
        Pawn pawn = currentPlayer.getPawns().get(0);
        int newPosition = pawn.getPosition() + diceValue;

        if (positions.containsKey(newPosition)) {
            System.out.println("Captured " + positions.get(newPosition).getColor() + " pawn!");
            positions.remove(newPosition);
        }

        if (newPosition >= 56) {
            pawn.enterHome();
            System.out.println(currentPlayer.getColor() + " pawn entered home!");
        } else {
            pawn.move(diceValue);
            positions.put(newPosition, currentPlayer);
        }

        displayBoard();

        if (currentPlayer.hasWon()) {
            System.out.println(currentPlayer.getColor() + " has won the game!");
        } else {
            nextPlayer();
        }
    }

    public void nextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
    }

    public void displayBoard() {

    }

}*/