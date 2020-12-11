package Array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
                        // 0   1   2   3
//        char[] letters = {'a','b','c','d'}; // 4*4 = 16bytes of storage
//
//        System.out.println(letters[2]); // imprime a posição 2 'c' | O(1)
//        System.out.println(letters); // imprime o array

        int [] intArray = new int[7]; // não podemos alterar o seu tamanho após instanciado.

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -5;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }

        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] == 7){
                index = i;
                break;
            }
        }
        System.out.println(intArray);
        System.out.println(Arrays.stream(intArray).sorted());


    }
}
