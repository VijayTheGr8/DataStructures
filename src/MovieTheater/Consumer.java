package MovieTheater;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A Consumer class that has the id of the consumer
 * and a list of all the movies
 *
 * @author vijay
 * @since JDK 1.8
 * @version 1.2 - fixed watchMovie() method, wasn't working as expected
 *              - fixed listAllMovies() method, didn't read properly
 */

public class Consumer extends Person {

    private int consumerId = 0;

    /**
     * This constructor is used for new Consumers
     *
     * @param name - The name of the Consumer
     * @param age  - The Consumer's age
     */
    public Consumer(int consumerId, String name, int age) {
        super(name, age);
        this.consumerId = consumerId;
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

    /**
     * Allows the Consumer to watch any movie from the list
     * else it tells him in the console to input the right movie id
     *
     * @param movieId - the id of the movie
     */
    public void watchMovie(int movieId) {
        if(StaffMember.listOfMovies.get(movieId - 1) != null)       // have to minus 1 bc it counts from 0
            System.out.println("Watching " + StaffMember.listOfMovies.get(movieId - 1).getTitle() + " now!");
        else
            System.out.println("Please enter a correct movie ID\n");
    }
}
