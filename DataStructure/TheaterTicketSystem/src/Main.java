import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olompia", 8, 12);
        theatre.getSeats();

//        if(theatre.reserveSeat())
    }
    public static void printList(List<Seat> list) {

        for (Seat seat :
                list) {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("===================================================");
    }
}

