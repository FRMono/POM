package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

@Test
@DisplayName("Test de Selección")

public class testJava {

    int[] array = {8, 2, 9, 3};

    void selectionSort() {
        for (int i = 2;;){
            int[] solucion = {2};
            Selection_Sort.selection_Sort(array);
            assertArrayEquals(array, solucion);
        }
    }
}


