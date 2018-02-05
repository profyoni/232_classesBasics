package person;

public class Person {
    
    public Person(){    // name of method = class Name
                        // no return type
        //System.out.println("Mazel tov on a new Person!!");
        setId(Math.abs((int) (System.nanoTime() / 1000)));
    }
    private int id;
    private String firstName, lastName;

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
