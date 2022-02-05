public class Sorts {
    public static void main(String[] args) {
        int[] intArray = { 20, 21, 13, 4, 5, -2, -20, 1};


        System.out.println("BubbleShort: " );
        bubbleShort(intArray);
        for (int j : intArray) {
            System.out.println(j);
        }

        System.out.println();
        System.out.println("SelectionShort");
        selectionShort(intArray);
        for (int j : intArray) {
            System.out.println(j);
        }
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
        int largest = 0;
        for (int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(array, largest,lastUnsortedIndex);
        }
    }
    /*********************** INSERTION SORT *************************/
    public static void insertionSort(int[] array){

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


}
