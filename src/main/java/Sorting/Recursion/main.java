package Sorting.Recursion;

public class main {

    public static void main(String[] args) {

        System.out.println("Recursivo: " + iterativeFactorial(3));
        System.out.println("Iterativo: " + iterativeFactorial(3));


    }

    public  static int recursiveFactorial(int number){

        if (number == 0)
            return 1;

        return number * recursiveFactorial(number -1);
    }

    public  static int iterativeFactorial(int number){

        if (number == 0)
            return 1;

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
