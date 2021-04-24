import java.util.Comparator;

public class YearComparator implements Comparator {

    //Instance Variable
    private int releaseYear;


    public YearComparator(int year) {

        this.releaseYear = year;

    }

    public int getYear() {

        return this.releaseYear;

    }


    @Override
    public int compare(Object o1, Object o2) {

        YearComparator comparator1 = (YearComparator) o1;
        YearComparator comparator2 = (YearComparator) o2;

        return comparator2.getYear() - comparator1.getYear();

    }

}
