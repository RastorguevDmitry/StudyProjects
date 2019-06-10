package Sort;

public class Main {


    public static void main(String[] args) {

        Comparable[] a = {5, 6, 79, 5, 2, 6, 79, 9, 6, 4, 8, 5, 52, 6, 23, 5, 0, 9, 6, 2, 1, 55};
        Comparable[] b = {5, 6, 79, 5, 2, 6, 79, 9, 6, 4, 8, 5, 52, 6, 23, 5, 0, 9, 6, 2, 1, 55};
        Comparable[] c = {5, 6, 79, 5, 2, 6, 79, 9, 6, 4, 8, 5, 52, 6, 23, 5, 0, 9, 6, 2, 1, 55};


        Sort sort = new InsertionSort();
        sort.sort(a);
        for (Comparable d : a
        ) {
            System.out.print(d + " ");
        }
        System.out.println();

        Sort sortSelectionSort = new SelectionSort();
        sortSelectionSort.sort(b);
        for (Comparable d : b
        ) {
            System.out.print(d + " ");
        }
        System.out.println();


        Sort sortBubbleSort = new BubbleSort();
        sortBubbleSort.sort(c);
        for (Comparable d : c
        ) {
            System.out.print(d + " ");
        }

    }
}
