package MovieTheater;

import java.util.ArrayList;

/**
 * An Manager object that holds a list of the manager's employees
 *
 * @author vijay
 * @since JDK 1.8
 * @version 1.1 - made sure the fireStaff() method actually fired people
 */

public class Manager extends Employee {

    private ArrayList<StaffMember> listOfStaffMembers = new ArrayList<>();

    /**
     * This constructor is used for new Managers
     *
     * @param name       - The name of the employee
     * @param age        - The age of the employee
     * @param empId      - The id of the employee
     * @param salary     - The salary of the employee
     * @param attendance - If the employee is currently in attendance
     */
    public Manager(int empId, String name, int age, float salary, boolean attendance) {
        super(empId, name, age,  salary, attendance);
    }

    /**
     * adds a new recruit to the staff
     *
     *
     * @param staffMember - an StaffMember object
     */
    public void hireStaff(StaffMember staffMember) {
        listOfStaffMembers.add(staffMember);
        System.out.println("Welcome to the crew " + staffMember.getName() + "!");
    }

    /**
     * removes a Staff Member from the list and returns if
     * the deletion of the Staff Member was successful
     *
     * @param empId - id of Employee
     * @returns if the deletion of the Staff Member was successful as a boolean
     */
    public boolean fireStaff(int empId, String name) {
        System.out.println("Hey " + name + ", you've been fired!");
        return listOfStaffMembers.removeIf(emp -> emp.getEmpId() == empId);
    }

    /**
     *  Returns a list of all the staff members
     *
     * @returns a list of all the staff members
     */
    public String listAllStaffMembers() {
        // turn into readable String
        String allStaffMembers = "";
        for (StaffMember member : listOfStaffMembers) {
            allStaffMembers += member.getEmpId() + " : " +
                    member.getName() + " : " +
                    member.getAge() + " : " +
                    member.getSalary() + " : " +
                    member.getYearHired() + "\n";
        }

        return allStaffMembers;
    }
}
