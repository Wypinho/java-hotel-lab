import java.util.ArrayList;

public class BedRoom {
    private int bedroomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    public BedRoom(int bedroomNumber, int capacity, String type){
        this.bedroomNumber = bedroomNumber;
        this.capacity = capacity;
        this.type = type;
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
}
