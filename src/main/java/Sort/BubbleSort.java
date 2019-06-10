package Sort;

public class BubbleSort extends Sort {

    @Override
    public void sort(Comparable[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (less(a[j+1], a[j])) exchange(a, j+1, j );
            }
        }
        assert isSort(a);
    }
}
