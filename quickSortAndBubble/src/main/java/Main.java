import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la lista de números que desea: ");
        int size = scanner.nextInt();

        int[] array = generateRandomArray(size);

        System.out.println("Array original: " + Arrays.toString(array));

        System.out.println("Seleccione el algoritmo de ordenamiento:");
        System.out.println("1. Burbuja");
        System.out.println("2. Quicksort");

        int option = scanner.nextInt();

        if (option == 1) {
            bubbleSort(array);
            System.out.println("Array ordenado mediante el algoritmo de burbuja: " + Arrays.toString(array));
        } else if (option == 2) {
            quickSort(array, 0, array.length - 1);
            System.out.println("Array ordenado mediante el algoritmo Quicksort: " + Arrays.toString(array));
        } else {
            System.out.println("Opción inválida. El programa ha terminado.");
        }
        scanner.close();
    }

    //--------------------------------FUNCTIONS------------------------------------------------
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = (int) (random.nextInt(100) + 1);
        }

        return array;
    }


    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

}
