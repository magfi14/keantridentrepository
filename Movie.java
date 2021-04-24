/**
 * @author Ethan Kupershtein
 * @date 4-20-2021
 */

public class Movie {

    /**
     * Instance Fields
     */

    private int percentageIdentificationNumber;
    private int numberSeen;
    private float averageRating;
    private String movieName;
    private int releaseYear;

    /* Constructor */

    public Movie() {

    }

    /**
     * Creates a new Movie object
     * @param percentageId The distribution of the percentage of people who gave a rating
     * @param numSeen The number of people who saw the movie
     * @param avgRate The average rating given by people who saw the movie
     * @param name The name of the movie
     * @param relYear The release year
     */

    public Movie(int percentageId, int numSeen, float avgRate, String name, int relYear) {

        this();
        this.percentageIdentificationNumber = percentageId;
        this.numberSeen = numSeen;
        this.averageRating = avgRate;
        this.movieName = name;
        this.releaseYear = relYear;

    }

    /**
     *
     * @return The distribution of the percentage of people who gave a rating
     */

    public int getPercentID() {

        return this.percentageIdentificationNumber;

    }

    /**
     * Input the percentage of distribution of people who assigned a rating
     * @param percentID The distribution of the percentage of people who gave a rating
     */

    public void setPercentID(int percentID) {

        this.percentageIdentificationNumber = percentID;

    }

    /**
     *
     * @return The number of people who saw the movie
     */

    public int getNumberSeen() {

        return this.numberSeen;

    }

    /**
     *
     * @param numberSeen The number of people who saw the movie
     */

    public void setNumberSeen(int numberSeen) {

        this.numberSeen = numberSeen;

    }

    /**
     *
     * @return The average rating assigned by viewers who watched the movie
     */

    public float getAvgRating() {

        return this.averageRating;

    }

    /**
     *
     * @param avgRate The average rating assigned by viewers who watched the movie
     */

    public void setAverageRating(float avgRate) {

        this.averageRating = avgRate;

    }

    /**
     *
     * @return The name of the movie
     */

    public String getMovieName() {

        return this.movieName;

    }

    /**
     *
     * @param movieName The name of the movie
     */

    public void setMoviename(String movieName) {

        this.movieName = movieName;
        
    }

    /**
     *
     * @return The year the movie was released
     */

    public int getRelYear() {

        return this.releaseYear;

    }

    /**
     *
     * @param releaseYear The year the movie was released
     */

    public void setRelYear(int releaseYear) {

        this.releaseYear = releaseYear;

    }

    /**
     *
     * @return A properly formatted string depiction of the movie details
     */

    public String toString() {

        return String.format("%d\t%d\t%.1f\t%s\t%d", this.getPercentID(), this.getNumberSeen(), this.getAvgRating(), this.getMovieName(), this.getRelYear());

    }

}
