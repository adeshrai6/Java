import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olompia", 8, 12);
        theatre.getSeats();

//        if(theatre.reserveSeat())
    }
    public static void printList(List<Seat> list) {

        for (Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("===================================================");
    }

    public static void sortList(List<Seat> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i, j);
                }

            }
        }
    }
}

