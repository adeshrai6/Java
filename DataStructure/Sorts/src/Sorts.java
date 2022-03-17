import java.util.Random;

public class Sorts {
    public static void main(String[] args) {
        int[] intArray = { 20, 21, 13, 4, 5, -2, -20, 1};
        int[] testArray = new int[10];


//      Rotate Array in 4th place
        rotateArray(intArray,4);
        print(intArray);
        System.out.println();

//        MERGE SORT
        System.out.println("Merge Sort");
        mergeSort(randomNumber(testArray));
        print(testArray);

//        BUBBLE SORT
        System.out.println();
        System.out.println("BubbleShort: " );
        bubbleShort(randomNumber(testArray));
        print(testArray);

//        SELECTION SORT
        System.out.println();
        System.out.println("SelectionShort");
        selectionShort(randomNumber(testArray));
        print(testArray);


        System.out.println();
        System.out.println("Insertion Sort:");
        insertionSort(randomNumber(testArray));
        print(testArray);

    }

    /*********************** MERGE SHORT *************************/
    public static void mergeSort(int[] array){

        if(array.length < 2){
            return;
        }

        int midIndex = array.length/2; //Dividing array in half
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[array.length - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = array[i];
        }

        for (int i = midIndex; i < array.length; i++) {
            rightArray[i - midIndex] = array[i]; //Starting with first index of right array but getting middle index from original index
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);

    }

    public static void merge(int[] array, int[] leftHalf, int[] rightHalf){
        int leftIncrement = 0;
        int rightIncrement = 0;
        int arrayIncrement = 0;

        while (leftIncrement < leftHalf.length && rightIncrement < rightHalf.length){
            if(leftHalf[leftIncrement] <= rightHalf[rightIncrement]){
                array[arrayIncrement] = leftHalf[leftIncrement]; //Put element of left array to large array
                leftIncrement++; //Go to next element of left array
            }else {
                array[arrayIncrement] = rightHalf[rightIncrement]; //Put element of right array to large array
                rightIncrement++; //Go to next element of right array
            }
            arrayIncrement++; //increment large array

        }

        while (leftIncrement < leftHalf.length){
            array[arrayIncrement] = leftHalf[leftIncrement]; //Put remaining element of left array to large array
            leftIncrement++;
            arrayIncrement++;
        }

        while (rightIncrement < rightHalf.length){
            array[arrayIncrement] = rightHalf[rightIncrement]; //Put remaining element of right array to large array
            rightIncrement++;
            arrayIncrement++;
        }

    }

    /*********************** BINARY SHORT *************************/
    public static boolean binarySearch(int[] array, int value){
        int left = 0;
        int right = array.length-1 ;
        int mid = (int)array.length/2;
        while (left <= right) {
            if (array[mid] == value) {
              return true;
            }else if(value > array[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
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

    /*********************** Rotate Array ************************************/
    public static void rotateArray(int[] arrayToRotate, int placeToRotate){
        int tempPlaceToRotate = placeToRotate;
        int ii;
        while (placeToRotate > 0){
            int lastNumber = arrayToRotate[arrayToRotate.length-1];
            for (ii = arrayToRotate.length -1 ; ii > 0; ii--) {
                arrayToRotate[ii] = arrayToRotate[ii -1];
            }
            arrayToRotate[ii] = lastNumber;
            placeToRotate--;
        }
    }

    /*********************** Print Array ************************************/
    public static void print(int [] array){
        for (int j : array) {
            System.out.print(j + ", ");
        }
    }

    /*********************** Random Number ************************************/
    public static int[] randomNumber(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100000 + 1);
        }
        return array;
    }


}
