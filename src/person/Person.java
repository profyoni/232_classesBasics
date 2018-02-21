package person;

class Date // implement with get/set/c-tor, copy c-tor..include validation
{

    public int month, year, dayInMonth, nanoseconds;

    Date() { // no arg c-tor
    }

    Date(Date that) {
        this.year = that.year;
        this.month = that.month;
        // remainder elided ....
    }
}

class Employee extends Person {

    private double annualSalary;
    private String jobTitle;
    
    // Employee ctor that takes all args
    // Employee ctors that first last annual salary
    // Employy ctor that first last and birthday

    public double getAnnualSalary() {
        return annualSalary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setAnnualSalary(double s) {
        annualSalary = s;
    }

    public void setJobTitle(String jt) {
        jobTitle = jt;
    }
    
   
        @Override
    public String toString() { // finish for all remaining fierlds in Perosn and Employee
        return super.toString() + 
                String.format("annualSalary = [%.2f]", getAnnualSalary());
    }
}

public class Person {// implement with get/set/c-tor, copy c-tor
    // unit tests Copy ctor..
    // test that a definsive copy was returned

    static int population;

    public Person() {    // name of method = class Name
        // no return type
        System.out.printf("Mazel tov on a new Person!! #%d%n", ++Person.population);
        setId(Math.abs((int) (System.nanoTime() / 1000)));
    }
    private int id;
    private String firstName, lastName;
    private Date birthDay;

    public Date getBirthDay() {
        return new Date(birthDay);
    }

    public void setBirthDay(Date d) {
        birthDay = new Date(d);  // defensive copy ... Josh Bloch Effective Java
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String s) {
        firstName = s;
    }

    public void setLastName(String s) {
        lastName = s;
    }

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        if (_id < 0) {
            throw new RuntimeException(String.format("Id must be greater than 0. Iw as [%d]",
                    _id));
        }
        id = _id;
    }

    @Override
    public String toString() {
        return String.format("id=[%d], firstName=[%s], lastName=[%s]",
                id, firstName, lastName);
    }
}
