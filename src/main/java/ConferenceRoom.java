import java.util.ArrayList;

public class ConferenceRoom {
    private String conferenceRoomName;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String conferenceRoomName, int capacity){
        this.conferenceRoomName = conferenceRoomName;
        this.capacity = capacity;
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
}
