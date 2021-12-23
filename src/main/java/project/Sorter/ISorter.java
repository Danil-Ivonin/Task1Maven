package project.Sorter;

import java.util.Comparator;


public interface ISorter<T> {
    public T[] sort(Comparator<T> comparator, T[] arr, int arrLength);
}
