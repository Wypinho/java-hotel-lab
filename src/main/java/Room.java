import java.util.ArrayList;

public class Room {
    private int bedroomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private String conferenceRoomName;

//    bedroom constructor
    public Room(int bedroomNumber, int capacity, String type){
        this.bedroomNumber = bedroomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }

    public Room(String conferenceRoomName, int capacity){
        this.conferenceRoomName = conferenceRoomName;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int guestCount() {
        return this.guests.size();
    }
}
