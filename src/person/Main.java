package person;

import java.util.ArrayList;


/**
 *
 * @author Administrator
 */
public class Main {

    private static void defensiveCopy() {
         Person p = new Person();
        Date dt = new Date();
        dt.year = 2018;
        p.setBirthDay(dt);
        
        dt.year = 1776;
        System.out.println(dt.year);
        
        Date dt3 = p.getBirthDay();
        dt3.year = 3;
        int q = p.getBirthDay().year = 7;
        System.out.println(p.getBirthDay().year);
        
        System.out.println("hskljthlsakjhgwlihroiw".length());   }
    
    public int add(int a, int b)
    {
        return a+b;
    }
    
    public static void main(String[] args) {
        
        String [] stringList = new String[100];
        for (int i=0;i<stringList.length; i++)
        {
            stringList[i] = "yippee!!" + i;
        }   
        
        Employee [] personList = new Employee[100];
        for (int i=0;i<personList.length; i++)
        {
            personList[i] = new Employee();
            personList[i].setFirstName("First" + i);
            personList[i].setLastName("Last" + i);
            personList[i].setAnnualSalary(1_000_000);
        }
        
        for(Person p : personList){
            System.out.println(p.toString());
        }
        
//        System.out.println(new Main().add(4,5)); // called via classname
//        System.out.println(Math.tan(45));
//        
//        int x = Integer.MAX_VALUE;
//        System.out.println(x);
//        x++;
//        System.out.println(x);
//        System.out.println(Math.abs(x));
//        System.out.println(x);
//        int y = 9, z = 0;
//        int x = y  / z;
        



        //defensiveCopy();
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(2,4);
        
        if (f1.equals(f2)){
            System.out.println("We match!!");
        }
        else{
            System.out.println("We don't match");
        }
        
        ArrayList<Fraction> list = new ArrayList<>();
        list.add(new Fraction(30, 60));
        
        System.out.println(list.contains( f1 ) );
        
//        p.setId(123);
//        p.setFirstName( "Naphtaili");
//        p.setLastName("Shortz");
//        
//        String fName = p.getFirstName();
//        
//        java.lang.String qw = p.toString();
//        System.out.println(qw);
//        System.out.println(p2.toString());
    }
    
}
