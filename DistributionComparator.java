import java.util.Comparator;

public class DistributionComparator implements Comparator<Movie> {

    public int compare(Movie m1, Movie m2) {
        if (m1.getSerialDistributionID() < m2.getSerialDistributionID())
            return 1;
        else if (m1.getSerialDistributionID() > m2.getSerialDistributionID())
            return -1;
        else
            return 0;
    }
}