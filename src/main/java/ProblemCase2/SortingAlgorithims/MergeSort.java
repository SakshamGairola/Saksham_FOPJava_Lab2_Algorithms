package ProblemCase2.SortingAlgorithims;

public class MergeSort {
    public MergeSort(int[] array, int left, int right) {
        mergeSort(array,left, right);
    }

    public void merge(int[] array, int left, int mid, int right) {
        int tempIndex1 = mid - left + 1;
        int tempIndex2 = right - mid;

        int[] tempArray1 = new int[tempIndex1];
        int[] tempArray2 = new int[tempIndex2];

        for (int i = 0; i < tempIndex1; i++)
            tempArray1[i] = array[left + i];
        for (int j = 0; j < tempIndex2; j++)
            tempArray2[j] = array[mid + 1 + j];

        int i, j, k;
        i = 0;
        j = 0;
        k = left;

        while (i < tempIndex1 && j < tempIndex2) {
            if (tempArray1[i] > tempArray2[j]) {
                array[k] = tempArray1[i];
                i++;
            } else {
                array[k] = tempArray2[j];
                j++;
            }
            k++;
        }

        while (i < tempIndex1) {
            array[k] = tempArray1[i];
            i++;
            k++;
        }

        while (j < tempIndex2) {
            array[k] = tempArray2[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }
}
