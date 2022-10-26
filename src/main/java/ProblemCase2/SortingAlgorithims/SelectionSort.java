package ProblemCase2.SortingAlgorithims;

public class SelectionSort {
    public SelectionSort(int array[], int size) {
        for (int i = 0; i < size - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] > array[max_idx]) {
                    max_idx = j;
                }
            }
            int temp = array[i];
            array[i] = array[max_idx];
            array [max_idx] = temp;
        }
    }
}
