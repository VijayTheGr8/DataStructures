package MovieTheater;

/**
 * A Person abstract class that holds a person's name and age
 *
 * @author vijay
 * @since JDK 1.8
 * @version 1.0
 */

public abstract class Person {

    private String name = "";
    private int age = 0;

    /**
     * This constructor is for new persons
     *
     * @param name - The name of the person
     * @param age - The person's age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns a simple greeting
     *
     * @returns a simple greeting as a String
     */
    public String sayHello() {
        return "Hello there!";
    }

    /**
     * Returns the name of the Person
     *
     * @returns name of Person as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age of the Person
     *
     * @returns the age of the Person as an int
     */
    public int getAge() {
        return age;
    }

}
