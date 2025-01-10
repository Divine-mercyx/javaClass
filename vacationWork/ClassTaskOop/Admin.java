package ClassTaskOop;

import java.time.LocalDate;

public class Admin extends User {

    private boolean isAdmin;

    public Admin(String name, String email, String number) {
        super(name, email, number);
        setAdmin();
    }

    private void setAdmin() {
        this.isAdmin = true;
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }

    public void manageReservation(String name, String email, String number, String roomType, int numberOfDays) {
        if (!Hotel.rooms.isEmpty()) {
            for (Room room : Hotel.rooms) {
                if (room.getRoomType().equals(roomType) && room.isAvailable()) {
                    User user = new User(name, email, number);
                    Hotel.customers.add(user);
                    System.out.println("guest details\n" + user);
                    System.out.println("room details" + room);
                    System.out.println("Total payment: " + (room.getPricePerNight() * numberOfDays));
                    LocalDate today = LocalDate.now();
                    room.setCheckInDate(today);
                    System.out.println(room.getCheckInDate(numberOfDays));
                    Hotel.numberOfRoomsBooked++;
                    Hotel.hotelRevenue += numberOfDays * room.getPricePerNight();
                    room.setNumberOfDays(numberOfDays);
                    room.setAvailabilityToFalse();
                }
                else {
                    System.out.println("room is not available");
                }
            }
        } else {
            System.out.println("there are no room in the hotel");
        }
    }

    public void getWeeklyReport() {
        System.out.println("Weekly report:");
        double occupancyRate = (((double) Hotel.numberOfRoomsBooked / Hotel.rooms.size()) * 100);
        System.out.printf("Total rooms booked: %d%nOccupancy rate: %.0f%%%nTotal revenue: %s%n", Hotel.numberOfRoomsBooked, occupancyRate, Hotel.hotelRevenue);
    }

    public void markRoomForMaintenance(String roomNumber) {
        if (!Hotel.rooms.isEmpty()) {
            for (Room room : Hotel.rooms) {
                if (room.getRoomNumber().equals(roomNumber) && room.isAvailable()) {
                    room.setAvailabilityToFalse();
                }
            }
        }
    }

    public void createRoom(String roomNumber, String roomType, double pricePerNight) {
        Hotel.rooms.add(new Room(roomNumber, roomType, pricePerNight));
    }



    public void viewGuestDetails() {
        if (!Hotel.customers.isEmpty()) {
            for (User user : Hotel.customers) {
                System.out.println(user);
            }
        } else {
            System.out.println("no customers found");
        }
    }

    @Override
    public String toString() {
        return "" + super.toString() + "isAdmin=" + isAdmin;
    }
}
