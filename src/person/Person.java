package person;

/**
 * Immutable Date can be shared by 2 objects with nbo need for deep copy
 * fields are final, no setters.. See Effective Java for more details
 */
class Date // implement with get/set/c-tor, copy c-tor..include validation
{

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the dayInMonth
     */
    public int getDayInMonth() {
        return dayInMonth;
    }

    /**
     * @return the nanoseconds
     */
    public int getNanoseconds() {
        return nanoseconds;
    }
    private final int month, year, dayInMonth, nanoseconds;
    
    Date(int month, int year,int dayInMonth,int nanoseconds) {
        this.year = year;
        this.month = month;
        this.dayInMonth = dayInMonth;
        this.nanoseconds = nanoseconds;
        validate();
    }
    
    // probably not needed sionce Date is immutable
    Date(Date that) {
        this(that.month, that.year, that.dayInMonth, that.nanoseconds);
        validate();
    }

    private void validate() {
        if (month <= 0 || month > 12){
            throw new IllegalArgumentException("...");
        }
        int [] monthDays = new int []{31,29,31,30,31,30,31,31,30,31,30,31};
        if (dayInMonth <= 0 || dayInMonth > monthDays[month-1])
        {
            throw new IllegalArgumentException("...");
        }
        if (! leapYear(year) && month == 2 && dayInMonth > 28)
        {
           throw new IllegalArgumentException("..."); 
        }
    }

    private boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || 
                year % 400 ==0;
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
