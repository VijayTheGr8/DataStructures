package MovieTheater;

/**
 * An Employee abstract class that holds a employee's id, salary and attendance
 *
 * @author vijay
 * @since JDK 1.8
 * @version 1.0
 */

public abstract class Employee extends Person {

    private int empId = 0;
    private float salary = 0;
    private boolean attendance = false;

    /**
     * This constructor is used for new Employees
     *
     * @param name - The name of the employee
     * @param age - The age of the employee
     * @param empId - The id of the employee
     * @param salary - The salary of the employee
     * @param attendance - If the employee is currently in attendance
     */
    public Employee(int empId, String name, int age, float salary, boolean attendance) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
        this.attendance = attendance;
    }

    /**
     * This method increases the salary of an employee
     *
     * @param empId - employee's id
     * @param increment - the amount to increase the salary by
     */
    public void increaseSalary(int empId, float increment) {
        if (increment < 0)  // this is a decrement, not an increment
            throw new RuntimeException("Hey! You're increment is less than 0");

        this.salary += increment;
        System.out.println("Employee #" + empId + ", you just got a raise of $" + increment + "!");
    }

    public int getEmpId() {
        return empId;
    }

    public boolean getAttendance() {
        return attendance;
    }

    /**
     * Returns the employee's salary
     *
     * @returns the employee's salary as a float
     */
    public float getSalary() {
        return this.salary;
    }

    /**
     * changes the employee's attendance status
     *
     * @param empId - The employee's id
     */
    public void changeAttendance(int empId) {
        if(this.attendance == true)
            this.attendance = false;
        else
            this.attendance = true;

        System.out.println("Employee #" + empId + " has changed his/her attendance to " + ((this.attendance) ? "working" : "on leave"));
    }

}
