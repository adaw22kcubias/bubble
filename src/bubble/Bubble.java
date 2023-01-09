package bubble;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        
        int[] a = {50, 26, 7, 9, 15, 27};
        System.out.println("Array inicial: " + Arrays.toString(a));
        //    int[] arrayFinal = selectSort(a);
        System.out.println("Bubble Sort: " + Arrays.toString(selectionSort(a)));

        //ctrl + f5 Debug
        //fn + f8 linea por linea
        //fn f7 
//        System.out.println("");
//        int resultado = suma(3, 5);
//        System.out.println(resultado);
    }
//public static o private static //nombre (tipo valor1, tipo valor2...)

    public static int suma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static int[] selectionSort(int[] a) {
        int count = 0;
        for (int i = a.length - 1; i >= 1; i--) {
            int largestIndex = i;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[largestIndex]) {
                    largestIndex = j;
                }
            }
            swap(a, i, largestIndex);
            System.out.println("canvi! " + Integer.toString(++count));
        }
        return a;
    }

    public static int[] bubbleSort(int[] a) {
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    System.out.println("canvi! " + Integer.toString(++count));
                    isSorted = false;
                }
            }
            if (isSorted) {
                return a;
            }
        }
        return a;
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    
    }

}
