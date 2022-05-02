import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++){
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        return array;
    }

    public static void main(String[] args) {
        Main search = new Main();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(search.insertionSort(array)));
    }
}
