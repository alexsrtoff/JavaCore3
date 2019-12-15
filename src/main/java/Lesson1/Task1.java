package Lesson1;
/*1. Написать метод, который меняет два элемента массива местами
(массив может быть любого ссылочного типа);*/
public class Task1 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E", "F"};
        System.out.printf("Исходный массив:");
        System.out.println();
        printArr(arr);
        changePlaces(arr, 0, 5);
        System.out.println("Измененный массив:");
        printArr(arr);
    }

    private static void changePlaces(String[] arr, int firstElement, int secondElement) {
        if (firstElement > 0 || secondElement< 0) System.out.println("Индексы массива не могут быть меньше 0");
        if (firstElement > arr.length || secondElement > arr.length) System.out.println("Пытаешься поменять местами несуществующие элементы");
        String temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement]= temp;
    }

    private static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
