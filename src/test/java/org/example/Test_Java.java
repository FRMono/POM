package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

@Test
@DisplayName("Test_Java")

public class Test_Java {

    public void TestJava() {
        Selection_Sort selectionSort = new Selection_Sort(5);
        selectionSort.insert(4);
        selectionSort.insert(2);
        selectionSort.insert(5);
        selectionSort.insert(1);
        selectionSort.insert(3);

        selectionSort.selection_Sort();

        int[] sortedArray = {1, 2, 3, 4, 5};
        assertArrayEquals(sortedArray, selectionSort.getArray());
    }
}




