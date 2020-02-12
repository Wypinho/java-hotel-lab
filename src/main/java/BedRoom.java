import java.util.ArrayList;

public class BedRoom {
    private int bedroomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int nightlyRate;

    public BedRoom(int bedroomNumber, int capacity, String type, int nightlyRate){
        this.bedroomNumber = bedroomNumber;
        this.capacity = capacity;
        this.type = type;
        this.nightlyRate = nightlyRate;
        this.guests = new ArrayList<Guest>();
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (this.guests.size() < capacity) {
            this.guests.add(guest);
        }
    }

    public void removeGuest() {
        this.guests.remove(0);
    }

    public int getBedRoomNumber() {
        return this.bedroomNumber;
    }

    public int getNightlyRate() {
        return this.nightlyRate;
    }
}
