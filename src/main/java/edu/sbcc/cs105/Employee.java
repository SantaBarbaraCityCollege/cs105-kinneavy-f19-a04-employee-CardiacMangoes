/**
 * CS 105 Theory and Practice I
 * CRN: [38066]
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CardiacMangoes]
 */
package edu.sbcc.cs105;

/**
 * This class implements an employee which is a person with a name and a salary.
 *
 */
public class Employee {
    String name;
    double salary;

    /**
     * Constructor that creates a new Employee with an initial name and salary.
     * @param employeeName assigns name to Employee object
     * @param currentSalary assigns salary to Employee object
     */
    public Employee(String employeeName, double currentSalary) {
		name = employeeName;
        salary = currentSalary;
    }

    // Accessors that are obvious and have no side effects don't have to have
    // any documentation unless you are creating a library to be used by other
    // people.
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * Raise the salary by the amount specified by the explicit argument.
     * @param byPercent percent at which the salary will be raised
     */
    public void raiseSalary(double byPercent) {
        salary += salary * byPercent * .01;
    }
}