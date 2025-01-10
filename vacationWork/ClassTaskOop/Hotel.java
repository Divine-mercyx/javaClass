package ClassTaskOop;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    static Admin admin = new Admin("madam bola", "madamBola@gmail.com", "08107891549");

    static ArrayList<Room> rooms = new ArrayList<>();
    static ArrayList<User> customers = new ArrayList<>();
    static int numberOfRoomsBooked;
    static double hotelRevenue;

    public static void main(String[] args) {
        welcome();
    }

    public static void welcome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1. login as Admin
                2. continue as user
                """);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                if (admin.isAdmin()) {
                    displayAdminMenu();
                }
                break;
            case 2: displayUserMenu(); break;
        }
    }

    public static  void displayUserMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, our esteemed customer!");
        System.out.println("""
                Options:
                1. Book Room
                2. View Booking
                3. Edit Profile
                4. Check Room Availability
                5. Payment Status
                6. Cancel Booking
                7. View All Available Room
                8. View Notification
                9. exit
                """);
        System.out.print("> ");
        int option = input.nextInt();
        switch (option) {
            case 1: manageUserReservations(); break;
            case 2: viewBookings(); break;
            case 3: break;
            case 4: checkARoomAvailability(); break;
            case 5: paymentStatus(); break;
            case 6: cancelBooking(); break;
            case 7: checkRoomAvailability(); break;
            case 8: break;
            case 9: welcome(); break;
            default: displayUserMenu(); break;

        }
    }

    public static void cancelBooking() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter reference number: ");
        String referenceNumber = input.nextLine();
        if (!rooms.isEmpty()) {
            for (Room room : rooms) {
                if (room.getReferenceNumber().equals(referenceNumber)) {
                    room.setAvailabilityToTrue();
                    displayUserMenu();
                }
            }
        }
    }

    public static void paymentStatus() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter reference number: ");
        String referenceNumber = input.nextLine();
        if (!rooms.isEmpty()) {
            for (Room room : rooms) {
                if (room.getReferenceNumber().equals(referenceNumber)) {
                    System.out.println("Payment Status: Paid successfully");
                    System.out.println("amount: " + (room.getNumberOfDays() * room.getPricePerNight()));
                    displayUserMenu();
                }
            }
        } else {
            System.out.println("No rooms available");
            displayUserMenu();
        }
    }



    public static void checkARoomAvailability() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the room number: ");
        String roomNumber = input.nextLine();

        if (!rooms.isEmpty()) {
            for (Room room : rooms) {
                if (room.getRoomNumber().equals(roomNumber) && room.isAvailable()) {
                    System.out.println(room);
                    displayUserMenu();
                } else {
                    System.out.println("Room is not available");
                }
            }
        } else {
            System.out.println("No rooms available.");
            displayUserMenu();
        }
    }


    public static void checkRoomAvailability() {
        if (!rooms.isEmpty()) {
            for (Room room : rooms) {
                if (room.isAvailable()) {
                    System.out.println(room);
                    displayUserMenu();
                }
            }
        } else {
            System.out.println("No rooms available.");
            displayUserMenu();
        }
    }


    public static void viewBookings() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your reference number: ");
        String reference = input.nextLine();
        if (!rooms.isEmpty()) {
            for (Room room : rooms) {
                if (room.getReferenceNumber().equals(reference)) {
                    System.out.println(room);
                    displayUserMenu();
                } else {
                    System.out.println("Room reference number does not match");
                    displayUserMenu();
                }
            }
        } else {
            System.out.println("No rooms available");
        }
    }



    public static void displayAdminMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, madam " + admin.getName());
        System.out.println("""
                Options:
                1. View All Rooms
                2. Manage Reservations
                3. Generate Reports
                4. Mark Rooms for Maintenance
                5. Add rooms
                6. View guest Details
                7. exit
                """);
        System.out.print("> ");
        int choice = input.nextInt();
        switch(choice) {
            case 1: viewAllRooms(); break;
            case 2: manageReservations(); break;
            case 3: getWeeklyReport(); break;
            case 4: markRoomForMaintenance(); break;
            case 5: addRoom(); break;
            case 6: viewGuestDetails(); break;
            case 7: welcome(); break;
            default: displayAdminMenu(); break;
        }
    }

    public static void viewGuestDetails() {
        admin.viewGuestDetails();
        displayAdminMenu();
    }


    public static void viewAllRooms() {
        admin.viewAllRooms();
        displayAdminMenu();
    }


    public static void getWeeklyReport() {
        admin.getWeeklyReport();
        displayAdminMenu();
    }


    public static void markRoomForMaintenance() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter room number: ");
        String roomNumber = input.nextLine();
        admin.markRoomForMaintenance(roomNumber);
        displayAdminMenu();
    }

    public static void manageReservations() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter email: ");
        String email = input.nextLine();
        System.out.print("Enter number: ");
        String number = input.nextLine();
        System.out.print("Enter room type: ");
        String type = input.nextLine();
        System.out.print("Enter number of days: ");
        int days = input.nextInt();

        admin.manageReservation(username, email, number, type, days);
        displayAdminMenu();
    }

    public static void manageUserReservations() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter email: ");
        String email = input.nextLine();
        System.out.print("Enter number: ");
        String number = input.nextLine();
        System.out.print("Enter room type: ");
        String type = input.nextLine();
        System.out.print("Enter number of days: ");
        int days = input.nextInt();

        admin.manageReservation(number, username, email, type, days);
        displayUserMenu();
    }


    public static void addRoom() {
        String roomNumber = "";
        String type = "";
        int days = 0;
        Room room = null;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter room number: ");
            roomNumber = input.nextLine();
            System.out.print("Enter room type: ");
            type = input.nextLine();
            System.out.print("Enter price per day: ");
            days = input.nextInt();
            room = getRoom(roomNumber);
        } while (room != null && room.getRoomNumber().equals(roomNumber));

        admin.createRoom(roomNumber, type, days);
        displayAdminMenu();
    }

    public static Room getRoom(String roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                return room;
            }
        }
        return null;
    }
}
