public class Sorts {
    public static void main(String[] args) {
        int[] intArray = { 20, 21, 13, 4, 5, -2, -20, 1};

//        BUBBLE SORT
        System.out.println("BubbleShort: " );
        bubbleShort(intArray);
        print(intArray);

//        SELECTION SORT
        System.out.println();
        System.out.println("SelectionShort");
        selectionShort(intArray);
        print(intArray);


        System.out.println();
        System.out.println("Insertion Sort:");
        insertionSort(intArray);
        print(intArray);
    }

    /*********************** BUBBLE SHORT *************************/
    public static void bubbleShort(int[] array){
        for (int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex; i++){
                if(array[i] > array[i+1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    /*********************** SELECTION SHORT *************************/
    public static void selectionShort(int[] array){

        for (int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }
    }
    /*********************** INSERTION SORT *************************/
    public static void insertionSort(int[] array){
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i-1];
            }
            array[i] = newElement;
        }
    }

    /*********************** SWAP ************************************/
    public static void swap(int[] array, int index, int nextIndex){
        if (index == nextIndex){
            return;
        }
        int tempArrayValue = array[index];
        array[index] = array[nextIndex];
        array[nextIndex] = tempArrayValue;
    }

    public static void print(int [] array){
        for (int j : array) {
            System.out.println(j);
        }
    }

}
