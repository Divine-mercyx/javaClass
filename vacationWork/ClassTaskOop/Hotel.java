package ClassTaskOop;

import java.util.ArrayList;

public class Hotel {

    private static ArrayList<Room> rooms = new ArrayList<>();
    private static ArrayList<User> guests = new ArrayList<>();
    private static double totalRevenue;
    private static int numberOfBookedRooms;
    private static int roomNumber;
    private static User currentUser;

    public static void main(String[] args) {
        rooms.add(new Room("single", roomNumber(), 15000));
        rooms.add(new Room("suite", roomNumber(), 30000));
        rooms.add(new Room("single", roomNumber(), 35000));
        rooms.add(new Room("double", roomNumber(), 15000));
        rooms.add(new Room("suite", roomNumber(), 15000));
        rooms.add(new Room("single", roomNumber(), 15000));
        rooms.add(new Room("double", roomNumber(), 5000));
        rooms.add(new Room("single", roomNumber(), 15000));
        rooms.add(new Room("double", roomNumber(), 5000));
        rooms.add(new Room("suite", roomNumber(), 16000));


    }

    public static String roomNumber() {
        roomNumber++;
        String temp = "";
        temp += roomNumber;
        return temp;
    }

    public static void bookRoom(User user, String roomType, String numberOfDays) {
        for (Room room : rooms) {
            if (room.getRoomType().equalsIgnoreCase(roomType)) {
                room.setAvailable(false);
                numberOfBookedRooms++;
                guests.add(user);
            }
        }
    }


    public static void viewBooking(String referenceId) {
        for (Room room  : rooms) {
            if (room.getReferenceId().equals(referenceId)) {
                System.out.println(room);
            }
        }
    }


    public static User login(String email, String password) {
        for (User user : guests) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }


    public static boolean checkRoomAvailability(Room room) {
        if (room.isAvailable()) {
            return true;
        }
        return false;
    }


    public static Room findRoom(String roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                return room;
            }
        }
        return null;
    }

    public static void cancelReservation(String referenceId) {
        for (Room room : rooms) {
            if (room.getReferenceId().equals(referenceId)) {
                room.setAvailable(true);
            }
        }
    }
}