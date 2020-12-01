package Objects;

/*
 * An Object that holds the name, course, and coolness factor of a teacher
 *
 * @author Vijay Patnaik
 * @since jdk 1.8
 * @version 1.0
 *
 */

public class Teacher {

    private String name;
    private String course;
    private int coolness_factor;
    private int coolness_factor_limit = 10;

    /*
     * This is the constructor for a new teacher
     *
     * @param name - The name of the teacher
     * @param course - The course the teacher is teaching
     *
     */

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
        this.coolness_factor = 0;
    }

    public String toString() {
        return "Name of Teacher: " + this.name + "\n" +
                "Course: " + this.course + "\n" +
                "Coolness Factor: " + this.coolness_factor + "\n";

    }

    /*
     * This method increases the coolness factor by the given value until a limit of the coolness factor limit
     *
     * @param the value the coolness factor should increase by
     *
     */

    public void increase_coolness_factor(int value) {
        if ((this.coolness_factor += value) > coolness_factor_limit)
            this.coolness_factor = coolness_factor_limit;
    }

}
