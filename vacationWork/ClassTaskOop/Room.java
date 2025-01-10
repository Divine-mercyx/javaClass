package ClassTaskOop;
import java.time.LocalDate;
import java.util.Random;

public class Room {

    private String roomNumber;
    private String roomType;
    private double pricePerNight;
    private String referenceNumber;
    private boolean isAvailable;
    private LocalDate checkInDate;
    public int numberOfDays;
    private int checkOutDate;

    public Room(String roomNumber, String roomType, double pricePerNight) {
        setRoomNumber(roomNumber);
        setRoomType(roomType);
        setPricePerNight(pricePerNight);
        setReferenceNumber();
        setAvailabilityToTrue();
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    private void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    private void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    private void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }


    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckInDate(int lodgeDays) {
        int days = checkInDate.getDayOfMonth();
        int monthIndex = checkInDate.getMonthValue();
        monthIndex = monthIndex - 1;
        String[] months = {"January", "February", "March", "April", "May", "June", "july", "august", "september", "october", "november", "december"};

        if (days == 1) {
            return "your check-in date is " + days + "st " + months[monthIndex] + ", and check-out date is " + (days + lodgeDays) + "st " + months[monthIndex] + "\n";
        }
        else if (days == 2) {
            return "your check-in date is " + days + "nd " + months[monthIndex] + ", and check-out date is " + (days + lodgeDays) + "nd " + months[monthIndex] + "\n";
        }
        else {
            return "your check-in date is " + days + "th " + months[monthIndex] + ", and check-out date is " + (days + lodgeDays) + "th " + months[monthIndex] + "\n";
        }
    }



    private void setReferenceNumber() {
        String bookingReferenceNumber = "";
        Random random = new Random();
        char[] chars = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < 7; i++) {
            int index = random.nextInt(chars.length - 1);
            bookingReferenceNumber += chars[index];
        }
        this.referenceNumber = bookingReferenceNumber;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setAvailabilityToTrue() {
        isAvailable = true;
    }

    public void setAvailabilityToFalse() {
        isAvailable = false;
    }

    public boolean isAvailable() { return isAvailable; }

    @Override
    public String toString() {
        return String.format("Room Number: %s%nRoom Type: %s%nRoom Price Per Night: %s%nRoom Reference Number: %s%nAvailability: %s%n", getRoomNumber(), getRoomType(), getPricePerNight(), getReferenceNumber(), isAvailable());
    }
}
