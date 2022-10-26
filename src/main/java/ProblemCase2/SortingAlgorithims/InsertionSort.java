package ProblemCase2.SortingAlgorithims;

public class InsertionSort {
    public InsertionSort(int array[], int size) {
        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key > array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j+1] = key;
        }
    }
}
