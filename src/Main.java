import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Integers: ");
        Scanner scanner = new Scanner(System.in);
        int integers[] = new int[scanner.nextInt()];
        for (int i = 0; i < integers.length; i++) {

            integers[i] = scanner.nextInt();
        }
        System.out.println("Integers contains: ");
        for (int i = 0; i < integers.length; i++) {

            System.out.println(integers[i]);
        }
        System.out.println("Math table");

        for (int i = 10; i > 0; i--) {
            System.out.println();
            for (int j = 10; j > 0; j--) {
                System.out.println(i + "*" + j + " = " + i * j);

            }
        }
        System.out.println("Whiles");
        System.out.println();
        int a = 0;
        while (a < 4) {
            System.out.println("Hello" + a);
            a++;
        }
        System.out.println();
        do {
            System.out.println("world" + a);
            a++;
        } while (a < 7);


        System.out.println();
        System.out.println("2Arrays");


        int array[][] = new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[0].length; x++) {
                array[i][x] = scanner.nextInt();
            }
        }
        System.out.println("Array contains: ");
        for (int i = 0; i < array.length; i++) {
            for (int b = 0; b < array[0].length; b++) {
                System.out.println(array[i][b]);
            }
        }

        System.out.println();
        System.out.println("MINIMUM");
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Min = " + min);
        System.out.println();
        System.out.println("Quick sort");

        int[] d = {10, -3, 4, 9, 7, 1, -6, 1, 2};

        quicksort(d, 0, d.length - 1);


        System.out.println(Arrays.toString(d));
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int partition(int[] a, int start, int end) {
        int pivot = a[end];

        int pIndex = start;


        for (int i = start; i < end; i++) {
            if (a[i] <= pivot) {
                swap(a, i, pIndex);
                pIndex++;
            }
        }


        swap(a, end, pIndex);


        return pIndex;
    }


    public static void quicksort(int[] a, int start, int end) {

        if (start >= end) {
            return;
        }


        int pivot = partition(a, start, end);


        quicksort(a, start, pivot - 1);


        quicksort(a, pivot + 1, end);
    }
}






