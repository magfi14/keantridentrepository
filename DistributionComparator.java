/**
 * @author Ethan Kupershtein
 */

import java.util.Comparator;

public class DistributionComparator implements Comparator {

    /** Instance Variables */

    int distributionID;

    /**
     *
     * @param ID the percentage distribution ID
     */

    public DistributionComparator(int ID) {

        this.distributionID = ID;

    }

    /**
     *
     * @return The comparable distribution ID
     */

    public String getComparableID() {

        return Integer.toString(this.distrubtionID);

    }

    /**
     * Converts the string representation of the percentage distribution ID into a formatted array. Iterates through the array to calculate the final serial distribution ID as a representation of the percentage of people who rated a certain score
     * @return The serial distribution ID number to be used in comparing the percentage distribution between two movies
     */

    public int getSerialDistributionID() {

        int finalID = 0;

        String ID = this.getComparableID();
        int [] distributionArr = new int[ID.length];

        // Converts string representation of percentage distribution ID into an array

        for (int i = 0; i < distributionArr.length; i++) {

            distributionArr[i] = Integer.parseInt(ID.substring(i, i + 1));

        }

        // Iterate through the array to calculate the final serial distribution ID as a representation of the percentage of people who rated a certain score

        for (int i = 0; i < distributionArr.length; i++) {

            int cellResult = 0;
            cellResult = (10 * (i + 1)) * distributionArr[i];
            finalID += cellResult;

        }

        return finalID;

    }

    /**
     *
     * @param comparator1 The first comparator
     * @param comparator2 The second comparator
     * @return The difference between the 2 movies
     */

    public int compare(DistributionComparator comparator1, DistributionComparator comparator2) {

        return comparator2.getSerialDistributionID() - comparator1.getSerialDistributionID();

    }

    public String toString() {

        return Integer.toString(compare(DistributionComparator comparator1, DistributionComparator comparator2));

    }

}