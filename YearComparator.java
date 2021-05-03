//Authors: Ethan Kupershtein, Liam Healy, Davian Brown, Daniel Gneco
//05/04/2021
//YearComparator- This is the comparator for the release year 

import java.util.Comparator;

public class YearComparator implements Comparator<Movie> {

    public int compare(Movie m1, Movie m2) {
        if (m1.getRelYear() < m2.getRelYear())
            return 1;
        else if (m1.getRelYear() > m2.getRelYear())
            return -1;
        else
            return 0;
    }
}