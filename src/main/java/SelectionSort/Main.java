package SelectionSort;

public class Main {

    public static void main(String[] args) {

        int [] intArray =  {20, 35, -15, 7 , 55, 1, -22};

        for (int finalIndex = intArray.length -1; finalIndex > 0; finalIndex--) {

            int largest = 0;

            for (int i = 0; i <= finalIndex; i++) {
                if (intArray[i] > intArray [largest])
                    largest = i;
            }
            swap(intArray, finalIndex, largest);
        }



        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j){

        if (i == j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
