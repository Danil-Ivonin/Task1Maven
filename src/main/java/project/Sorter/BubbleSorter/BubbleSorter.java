package project.Sorter.BubbleSorter;

import project.Sorter.ISorter;

import java.util.Comparator;


public class BubbleSorter<T> implements ISorter<T> {
    /**
     * Sorts the array using the bubble method
     * @param comparator Sorting criterion
     * @param arr The array to be sorted
     * @param arrLenght Array length
     * @return Sorted array
     */
    @Override
    public T[] sort(Comparator<T> comparator, T[] arr, int arrLenght) {
        boolean isSorted = false;
        T buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrLenght-1; i++) {
                if(comparator.compare(arr[i], arr[i + 1]) > 0){
                    isSorted = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        return arr;
    }
}
