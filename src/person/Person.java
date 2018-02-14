package person;

class Date  // implement with get/set/c-tor, copy c-tor
{
    private int month, year, dayInMonth, nanoseconds;
}

public class Person {// implement with get/set/c-tor, copy c-tor
    // unit tests Copy ctor..
    // test that a definsive copy was returned
    static int population;
    
    public Person(){    // name of method = class Name
                        // no return type
        System.out.printf("Mazel tov on a new Person!! #%d%n", ++Person.population);
        setId(Math.abs((int) (System.nanoTime() / 1000)));        
    }
    private int id;
    private String firstName, lastName;
    private Date birthDay;

    public Date getBirthDay(){
        return birthDay;
    }
    
    public void setBirthDay(Date d){
        birthDay = d;
    } 
    
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }    
    public void setFirstName(String s){
        firstName = s;
    }
    public void setLastName(String s){
        lastName = s;
    }
    
    public int getId(){ 
        return id;
    }
    
    public void setId(int _id){
        if (_id < 0){
            throw new RuntimeException(String.format("Id must be greater than 0. Iw as [%d]", 
                    _id));
        }
        id = _id;
    }
    
    public java.lang.String toString()
    {
        return java.lang.String.format("id=[%d], firstName=[%s], lastName=[%s]", 
                id, firstName, lastName);
    }
}
