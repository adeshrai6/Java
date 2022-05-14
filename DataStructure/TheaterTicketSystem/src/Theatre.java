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
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seat.add(seat);
            }
        }
    }

}
