public class Movie {

    private int percentageIdentificationNumber;
    private int numberSeen;
    private float averageRating;
    private String movieName;
    private int releaseYear;

    public Movie() {

    }

    public Movie(int percentageId, int numSeen, float avgRate, String name, int relYear) {

        this();
        this.percentageIdentificationNumber = percentageId;
        this.numberSeen = numSeen;
        this.averageRating = avgRate;
        this.movieName = name;
        this.releaseYear = relYear;

    }

    public int getPercentID() {

        return this.percentageIdentificationNumber;

    }

    public void setPercentID(int percentID) {

        this.percentageIdentificationNumber = percentID;

    }

    public int getNumberSeen() {

        return this.numberSeen;

    }

    public void setNumberSeen(int numberSeen) {

        this.numberSeen = numberSeen;

    }

    public float getAvgRating() {

        return this.averageRating;

    }

    public void setAverageRating(float avgRate) {

        this.averageRating = avgRate;

    }

    public String getMovieName() {

        return this.movieName;

    }

    public void setMoviename(String movieName) {

        this.movieName = movieName;
        
    }

    public int getRelYear() {

        return this.releaseYear;

    }

    public void setRelYear(int releaseYear) {

        this.releaseYear = releaseYear;

    }

    public String toString() {

        return String.format("%d\t%d\t%.1f\t%s\t%d", this.getPercentID(), this.getNumberSeen(), this.getAvgRating(), this.getMovieName(), this.getRelYear());

    }

}
