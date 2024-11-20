public class ArcheryGame {
    public static void main(String... args) {
        int[][] archeryScores = new int[4][3];
        
        for (int row = 0; row < archeryScores.length; row++) {
            for (int column = 0; column < archeryScores[row].length; column++) {
                archeryScores[row][column] = (int) (Math.random() * 50);
            }
        }
        
        
        System.out.println("archers\t\tfst\tsec\tthd\ttot");
        for (int row = 0; row < archeryScores.length; row++) {
            int total = 0;
            System.out.print("player " + (row + 1));
            for (int column = 0; column < archeryScores[row].length; column++) {
                System.out.print("\t" + archeryScores[row][column]);
                total += archeryScores[row][column];
                if (column == (archeryScores[row].length - 1)) {
                    System.out.print("\t" + total);
                }
            }
            System.out.println();
        }
    }
}
