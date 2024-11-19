import java.util.Scanner;

public class Airline {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        boolean[][] planeSeats = new boolean[2][5];
        
        mainMenu(input, planeSeats);
    }
    
    
    public static void mainMenu(Scanner input, boolean[][] planeSeats) {
        System.out.println("\033[36mwelcome to divine boss airline\033[0m");
        System.out.println("""
        1. first class
        2. economy
        """);
        int choice = input.nextInt();
        
        switch (choice) {
            case 1: firstClass(input, planeSeats);
              break;
              
            case 2: economyClass(input, planeSeats);
              break;
        }
    
    }
    
    
    
    public static void firstClass(Scanner input, boolean[][] planeSeats) {
           int firstClassChoice = 0;
              do {
                  System.out.println("welcome to firstclass\nchoose a seat (1 - 5)");
                  firstClassChoice = input.nextInt();
                  if (firstClassChoice > 0 && firstClassChoice <= 5 && planeSeats[0][firstClassChoice - 1] == false) {
                      planeSeats[0][firstClassChoice - 1] = true;
                      System.out.println("board pass: \nSeat number: " + firstClassChoice + "\nsection: first-class\n\n");
                  } 
                  else if (firstClassChoice < 0 || firstClassChoice > 5) {
                      System.out.println("seat of of range");
                  }
                  else if (!planeSeats[0][firstClassChoice - 1] == false) {
                      System.out.println("seat booked already, try again");
                  }
              
              } while (firstClassChoice > 5 || !planeSeats[0][firstClassChoice - 1] == false);
    }
    
    
    public static void economyClass(Scanner input, boolean[][] planeSeats) {
            int firstClassChoice = 0;
            int counter = 0;
              do {
                  System.out.println("welcome to economy section\nchoose a seat (1 - 5)");
                  firstClassChoice = input.nextInt();
                  if (firstClassChoice > 0 && firstClassChoice <= 5 && planeSeats[1][firstClassChoice - 1] == false) {
                      planeSeats[1][firstClassChoice - 1] = true;
           
                      System.out.println("board pass: \nSeat number: " + firstClassChoice + "\nsection: economy\n\n");
                   
                  } 
                  else if (firstClassChoice < 0 || firstClassChoice > 5) {
                      System.out.println("seat of of range");
                  }
                  else if (!planeSeats[1][firstClassChoice - 1] == false) {
                      System.out.println("seat booked already, try again");
                  }
              
              } while (firstClassChoice > 5 || !planeSeats[1][firstClassChoice - 1] == false);
                            
                      for (int column = 0; column < planeSeats[1].length; column++) {
                          if (planeSeats[1][column] == true) {
                              counter += 1;
                          }
                      }
                      
                      if (counter == planeSeats[1].length) {
                          System.out.println("economy section is full.\ndo you want to switch to first class?");
                          String answer = input.nextLine();
                          if (answer.equalsIgnoreCase("yes")) {
                              mainMenu(input, planeSeats);
                              
                          } else if (answer.equalsIgnoreCase("no")) {
                              System.out.println("okay thank you, bye.....");
                          }
                          
                      }
    }
}
