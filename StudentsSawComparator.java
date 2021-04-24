import java.util.Comparator;

public class StudentsSawComparator implements Comparator {

    /** Instance Variables */

    private int numberOfStudents;

    /**
     *
     * @param numberOfStudents The number of students who watched the movie
     */

    public StudentsSawComparator(int numberOfStudents) {

        this.numberOfStudents = numberOfStudents;

    }

    /**
     *
     * @return The comparable number of students who watched the movie
     */

    public int getNumberOfStudents() {

        return this.numberOfStudents;

    }

    /**
     *
     * @param o1 The first comparator
     * @param o2 The second comparator
     * @return The difference between the 2 movies
     */

    @Override
    public int compare(Object o1, Object o2) {

        StudentsSawComparator comparator1 = (StudentsSawComparator) o1;
        StudentsSawComparator comparator2 = (StudentsSawComparator) o2;

        return comparator2.getNumberOfStudents() - comparator1.getNumberOfStudents();

    }

}