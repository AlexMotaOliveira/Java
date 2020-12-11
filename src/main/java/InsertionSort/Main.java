package InsertionSort;

public class Main {

    public static void main(String[] args) {

        int [] intArray =  {20, 35, -15, 7 , 55, 1, -22};

        for (int firstIndex = 0; firstIndex < intArray.length; firstIndex++) {

            int newElement = intArray[firstIndex];
            int i;

            for (i = firstIndex; i > 0 && intArray[ i - 1] > newElement; i--) {
                intArray[i] = intArray[i -1];
            }
            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }


}
