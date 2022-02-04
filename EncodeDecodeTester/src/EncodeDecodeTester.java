public class EncodeDecodeTester {
    public static void main(String[] args) {
        System.out.println("EncodeDecodeTester");
        String string = "a";


        String[] originalList = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
                "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4",
                "5", "6", "7", "8", "9", "@", "#"};
        String[] expectedList = {"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
                "V", "W", "X", "Y", "Z", "A", "B", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "2", "3", "4", "5", "6",
                "7", "8", "9", "0", "1", "@", "#"};

        EncodeDecode encodeDecode = new EncodeDecode(originalList);
        String[] encodedList = encodeDecode.getEncodedList();
        String[] decodedList = encodeDecode.getDecodedList();

        for (int i = 0; i < originalList.length; i++) {

            if (originalList[i] == "0" || originalList[i] == "a") {
                System.out.println();
            }
            System.out.println(originalList[i] + " " + expectedList[i] + " " + encodedList[i] + " " + decodedList[i]);

        }

    }
}
