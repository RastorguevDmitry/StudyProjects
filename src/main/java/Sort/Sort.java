package Sort;

public class Sort {

    public void sort(Comparable[] a) {

    }

    protected boolean less(Comparable v, Comparable w) {
        if (v.compareTo(w) < 0) return true;
        else return false;
    }

    protected void exchange(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    protected boolean isSort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

}
