package project.Sorter.SelectionSorter;

import project.Sorter.ISorter;

import java.util.Comparator;

public class SelectionSorter<T> implements ISorter<T> {
    /**
     * Sorts the array using the selection method
     * @param comparator Sorting criterion
     * @param arr The array to be sorted
     * @param arrLenght Array length
     * @return Sorted array
     */
    @Override
    public T[] sort(Comparator<T> comparator, T[] arr, int arrLenght) {
        T min;
        T temp;
        int pos;
        for (int i = 0; i < arrLenght - 1; i++) {
            pos = i;
            min = arr[i];
            for (int j = i + 1; j < arrLenght; j++){
                if (comparator.compare(arr[j], min) < 0) {
                    min = arr[j];
                    pos = j;
                }
            }
            temp = arr[i];
            arr[i] = min;
            arr[pos] = temp;
        }
        return arr;
    }
}