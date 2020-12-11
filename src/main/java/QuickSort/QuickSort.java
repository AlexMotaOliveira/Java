package QuickSort;
// https://stackabuse.com/merge-sort-in-java/#:~:text=Merge%20sort%20is%20a%20divide,(which%20are%20typically%20halves).
public class QuickSort {

    public static void main(String[] args) {

        int [] intArray =  {20, 35, -15, 7 , 55, 1, -22};

        quickSort(intArray,0, intArray.length);

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void quickSort (int [] input, int start, int end) {

        if (end - start < 2)
            return;

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j){

            // Looping vazio para a busca dos valores
            while (i < j && input[--j] >= pivot);

            if (i < j)
                input[i] = input[j];

            // Looping vazio para a busca dos valores
            while (i < j && input[++i] <= pivot);

            if (i < j)
                input[j] = input[i];

        }

        input[j] = pivot;
        return j;

    }


}
