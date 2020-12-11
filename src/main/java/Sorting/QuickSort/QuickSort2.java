package Sorting.QuickSort;
// https://www.devmedia.com.br/algoritmos-de-ordenacao-em-java/32693
public class QuickSort2 {

    public static void main(String[] args) {

        int [] intArray =  {20, 35, -15, 7 , 55, 1, -22};

        quickSort(intArray,0,intArray.length-1);;

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = partition(vetor, inicio, fim);
            quickSort(vetor, inicio, pivoIndex - 1);
            quickSort(vetor, pivoIndex + 1, fim);
        }
    }

    private static int partition(int[] vector, int start, int end) {

        int pivo = vector[start];
        int i = start + 1;
        int j = end;

        while (i <= j) {
            if (vector[i] <= pivo)
                i++;
            else if (pivo < vector[j])
                j--;
            else {
                int swap = vector[i];
                vector[i] = vector[j];
                vector[j] = swap;
                i++;
                j--;
            }
        }
        vector[start] = vector[j];
        vector[j] = pivo;
        return j;
    }


}
