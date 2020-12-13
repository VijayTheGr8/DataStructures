package MovieTheater;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * An Staff Member object that holds the year hired of a
 * staff member, calculates the current year
 * and also holds a list of all the movies
 *
 * @author vijay
 * @since JDK 1.8
 * @version 1.4 - made sure that the removeMovie() method really removes a movie
 *              - figured out that a private ArrayList leads to every Staff Member having their own list of movies,
 *                which is not what I want. I want a shared list that everyone can edit. So I made the ArrayList
 *                public and static
 *              - changed how commitMovieList() method wrote to the file
 *              - changed how listAllMovies() method read from the file
 */

public class StaffMember extends Employee {

    private int yearHired = 0;
    private int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    public static ArrayList<Movie> listOfMovies = new ArrayList<>();

    /**
     * This constructor is used for new Staff Members
     *
     * @param empId      - The id of the Staff Member
     * @param name       - The name of the Staff Member
     * @param age        - The age of the Staff Member
     * @param salary     - The salary of the Staff Member
     * @param attendance - If the Staff Member is currently in attendance
     */
    public StaffMember(int empId, String name, int age, float salary, boolean attendance, int yearHired) {
        super(empId, name, age, salary, attendance);
        if (yearHired > currentYear)
            throw new RuntimeException("yearHired can't be greater than " + currentYear);
        this.yearHired = yearHired;
    }

    /**
     * A simple method that an StaffMember object can use to make popcorn
     *
     */

    public void makePopcorn() {
        System.out.println("Making popcorn!");
    }

    /**
     * Returns how long this Staff Member has been employed
     *
     * @returns a String containing how long this Staff Member has been employed
     */
    public String yearsOfEmployment() {
        return "Staff Member #" + this.getEmpId() + " has been employed for " + Integer.toString(currentYear - this.yearHired) + " years.";
    }

    /**
     * Allows a Staff Member to add a movie to the listOfMovies
     * THIS DOES NOT COMMIT!
     *
     * @param movie - the Movie object to add
     */
    public void addMovie(Movie movie) {
        listOfMovies.add(movie);
        System.out.println("Added Movie. Remember to commit!");
    }

    /**
     * Allows a Staff Member to delete a movie from the listOfMovies
     * THIS DOES NOT COMMIT!
     *
     * @param movieId - the id of the movie
     */
    public void removeMovie(int movieId) {
        listOfMovies.removeIf(movie -> movie.getId() == movieId);
        System.out.println("Removed movie. Remember to commit!");
    }

    /**
     * Returns all the movies in the file "movies.txt"
     *
     * @returns a String containing all the movies in the file "movies.txt"
     */
    public String listAllMovies() {

        String allMovies = "";

        try {
            FileInputStream fis = new FileInputStream("movies.txt");
            byte[] buffer = new byte[10];
            StringBuilder sb = new StringBuilder();
            while (fis.read(buffer) != -1) {
                sb.append(new String(buffer));
                buffer = new byte[10];
            }
            fis.close();

            allMovies = sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return allMovies;
    }
//

    /**
     * This method commits all changes to the listOfMovies
     *
     */
    public void commitMovieList() {
        try (PrintStream stream = new PrintStream(new FileOutputStream("movies.txt"))) {

            for (int i = 0; i < listOfMovies.size(); i++) {
                int movieId = listOfMovies.get(i).getId();
                String movieTitle = listOfMovies.get(i).getTitle();
                int movieRating = listOfMovies.get(i).getRating();

                // write to file
                stream.println(movieId + " : " + movieTitle + " : " + movieRating);
            }

            stream.close();

            System.out.println("\nCommited!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the year this Staff Members was hired
     *
     * @returns the year this Staff Members was hired as an int
     */
    public int getYearHired() {
        return yearHired;
    }
}
