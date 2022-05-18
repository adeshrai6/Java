import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new LinkedList<>();
    public Theatre(String theatreName, int numRows, int seatsPerRow){
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum), 10);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for(Seat seat : seats) {
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserve();
    }

    public Collection<Seat> getSeats() {
        return seats;
    }
}
