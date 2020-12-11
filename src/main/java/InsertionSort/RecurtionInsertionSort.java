package InsertionSort;

public class RecurtionInsertionSort {

    public static void main(String[] args) {

        int [] intArray =  {20, 35, -15, 7 , 55, 1, -22};

        insertionSort(intArray, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void insertionSort(int[] input, int numberItems){

        if(numberItems < 2)
            return;

        insertionSort(input, numberItems -1);

            int newElement = input[numberItems -1];
            int i;

            for (i = numberItems -1; i > 0 && input[ i - 1] > newElement; i--)
                input[i] = input[i -1];

            input[i] = newElement;
        }


}
