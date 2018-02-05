package person;


/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
//        int y = 9, z = 0;
//        int x = y  / z;
        
        person.Person p = new Person();
        Person p2 = new Person();
        
        p.setId(123);
        p.setFirstName( "Naphtaili");
        p.setLastName("Shortz");
        
        String fName = p.getFirstName();
        
        java.lang.String qw = p.toString();
        System.out.println(qw);
        System.out.println(p2.toString());
    }
    
}
