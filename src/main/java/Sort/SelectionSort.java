package Sort;

public class SelectionSort extends Sort {

    @Override
    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i; j < a.length; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exchange(a, min, i);
        }
        assert isSort(a);
    }
}
