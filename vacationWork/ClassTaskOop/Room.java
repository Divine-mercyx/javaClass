package ClassTaskOop;

import java.time.LocalDate;
import java.util.Random;

public class Room {

    private String roomType;
    private String roomNumber;
    private double roomPrice;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private boolean isAvailable;
    private User owner;
    private String referenceId = "REF";

    public Room(String roomType, String roomNumber, double roomPrice) {
        setRoomType(roomType);
        setRoomNumber(roomNumber);
        setRoomPrice(roomPrice);
        setCheckInDate(LocalDate.now());
        setCheckOutDate(LocalDate.now());
        setAvailable(true);
        generateReferenceId();
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getOwner() {
        return owner;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void generateReferenceId() {
        Random rand = new Random();
        String temporaryReference = "";

        for (int index = 0; index < 3; index++) {
            int temp = rand.nextInt(9);
            temporaryReference += temp;
        }
        this.referenceId += temporaryReference;
    }

    public String getReferenceId() {
        return referenceId;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomPrice=" + roomPrice +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", isAvailable=" + isAvailable +
                ", owner=" + owner +
                ", referenceId='" + referenceId + '\'' +
                '}';
    }
}