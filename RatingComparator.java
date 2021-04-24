//Author: Liam Healy

import java.util.Comparator;

public class RatingComparator implements Comparator {

    //Instance Variable
    private float averageRating;
    
    public RatingComparator(float rating) {

        this.averageRating = rating;
    }
    
    public float getComparableRating() {

        return this.averageRating;
    }

    @Override
    public int compare(Object o1, Object o2) {
        
        RatingComparator compare1 = (RatingComparator) o1;
        RatingComparator compare2 = (RatingComparator) o2;

        return (int) (compare2.getComparableRating() - compare1.getComparableRating());
    }
    
}