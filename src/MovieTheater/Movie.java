package MovieTheater;

/**
 * A Movie class that has the id, title and rating
 *
 * @author vijay
 * @since JDK 1.8
 * @version 1.0
 */

public class Movie {

    private int id = 0;
    private String title = "";
    private int rating = 0;

    /**
     * This constructor is used for new Movies
     *
     * @param id - id of the Movie
     * @param title - Movie title
     * @param rating - the rating of the Movie
     */
    public Movie(int id, String title, int rating) {
        this.id = id;
        this.title = title;
        this.rating = rating;
    }

    /**
     * Simple getter that gets the id of the Movie
     *
     * @returns the id of the Movie
     */
    public int getId() {
        return id;
    }

    /**
     * Simple getter that gets the title of the Movie
     *
     * @returns the title of the Movie
     */
    public String getTitle() {
        return title;
    }

    /**
     * Simple getter that gets the rating of the Movie
     *
     * @returns the rating of the Movie
     */
    public int getRating() {
        return rating;
    }
}
