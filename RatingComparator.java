//Authors: Ethan Kupershtein, Liam Healy, Davian Brown, Daniel Gneco
//05/04/2021
//RatingComparator- This is the comparator for the rating 

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {

    public int compare(Movie m1, Movie m2) {
        if (m1.getAvgRating() < m2.getAvgRating())
            return 1;
        else if (m1.getAvgRating() > m2.getAvgRating())
            return -1;
        else
            return 0;
    }
}