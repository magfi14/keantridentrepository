//Authors: Ethan Kupershtein, Liam Healy, Davian Brown, Daniel Gneco
//05/04/2021
//StudentsSawComparator- This is the comparator for the total views 

import java.util.Comparator;

public class StudentsSawComparator implements Comparator<Movie> {

    public int compare(Movie m1, Movie m2) {
        if (m1.getNumberSeen() < m2.getNumberSeen())
            return 1;
        else if (m1.getNumberSeen() > m2.getNumberSeen())
            return -1;
        else
            return 0;
    }
}