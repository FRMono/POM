package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * Created on 19.10.2018, 12:38:16
 *
 * @author Vladislav_Borisov
 */

public class Selection_Sort {
    private int[] array = {5};
    private int nElems;

    public Selection_Sort(int max) {
        array = new int[max];
        nElems = 5;
    }

    public static void selection_Sort(int[] array) {
    }

    public void insert(int value) {
        array[nElems] = value;
        nElems++;
    }

    public void selection_Sort() {
        for (int i = 0; i < nElems - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nElems; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
                swap(i, min);
            }
        }
        System.out.print("Sorted array: ");
        display();
    }

    public void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    public void display() {
        System.out.println(Arrays.toString(array));
    }
    public int[] getArray() {
        return array;
    }
}

class Launcher {

    public static void main(String[] args) {
        System.out.print("Enter the number of the array: ");

        Scanner scan = new Scanner(System.in);
        int maxSize = scan.nextInt();
        Random random = new Random();

        Selection_Sort array = new Selection_Sort(maxSize);

        for (int i = 0; i < maxSize; i++) {
            int randNum = random.nextInt(maxSize);
            array.insert(randNum);
        }

        System.out.print("Source array: ");
        array.display();
        array.selection_Sort();

    }
}

