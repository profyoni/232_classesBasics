import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import person.Fraction;

/**
 *
 * @author Administrator
 */
public class FractionTest {
    

     @Test
     public void ctor1Arg() {
         Fraction _13 = new Fraction(13); // Arrange
         
         String s = _13.toString(); // Act
         
         assertEquals("13", s);
     
     }    

     @Test
     public void ctor0Arg() { 
         Fraction zero = new Fraction(); // Arrange
         
         String s = zero.toString(); // Act
         
         assertEquals("0", s);
     
     }
     @Test
     public void times() {
         Fraction half = new Fraction(1,2); // Arrange
         
         Fraction q = half.times(half);
         
         assertEquals(1, q.getNumerator());
         assertEquals(4, q.getDenominator());
     
     }
}
