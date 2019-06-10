
package Sort;

public class Date implements Comparable {

    private int year, month, day;


    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int compareTo(Date that) {
        if (this.year < that.year) return -1;
        if (this.year > that.year) return +1;
        if (this.month < that.month) return -1;
        if (this.month > that.month) return +1;
        if (this.day < that.day) return -1;
        if (this.day > that.day) return +1;

        return 0;

    }


   // @Override
    public int compareTo(Object o) {
        return 0;
    }
}
