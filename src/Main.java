import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //метод сортировки вставками
    public int[] insertionSort(int[] array) {
//итерация по всем элементам массива
        for (int i = 0; i < array.length; i++) {
            int current = array[i]; //запоминаем текущий элемент
            int j = i - 1; //индекс предыдущего элемента
//цикл перемещения элементов больших текущего на одну позицию вправо
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current; //вставляем текущий элемент в правильное место
        }
        return array; //возвращаем отсортированный массив
    }

    public static void main(String[] args) {
        Main search = new Main(); //создаем экземпляр класса Main
        Scanner scanner = new Scanner(System.in); //создаем экземпляр класса Scanner для считывания ввода
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt(); //считываем количество элементов массива
        int[] array = new int[size]; //создаем массив указанного размера
        //цикл заполнения массива
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); //считываем i-й элемент массива
        }
        //выводим отсортированный массив на экран
        System.out.println("Отсортированный массив: " + Arrays.toString(search.insertionSort(array)));
    }
}
