package person;

/**
 * A fraction with a numerator and denominator. No arg c-tor
 * will instantiate a fraction with a numerator of 0 and denominator of 1
 * 
 * setters and getters for both Numerator and Denominator
 * 
 * data validation: denominator must not be 0
 * 
 * toString return e.g. "3 / 4"
 * 
 * 
 */ 
class MathLib
{
    /**
     * Doubles the fraction
     * @param f 
     */
    public static void doubleMe(Fraction f){
        f.setNumerator( f.getNumerator() * 2);        
    }
}


public class Fraction {
    private int numerator, denominator;
    
    public Fraction(Fraction that){        
        this.numerator = that.numerator;
        this.denominator = that.denominator;
    }
    
    public Fraction(int numerator, int denominator){
        
        this.numerator = numerator;
        this.denominator = denominator;
        validation();
    }    
    
    public Fraction(int numerator){
        this(numerator,1); // telescoping c-tor
    }    
    
    public Fraction(){
        this(0); // telescoping c-tor
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        validation();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
        validation();
    }
    
    @Override
    public String toString(){
        return  denominator == 1 
                ? numerator + ""
                : String.format("%d /  %d", numerator, denominator);
    }
    
    @Override
    public boolean equals(Object o){
        Fraction that = (Fraction) o;
        return this.numerator * that.denominator == that.numerator * this.denominator;
    }

    private void validation() {
        if (this.denominator==0)
            throw new IllegalArgumentException("Denominator may not be zero");
        if (numerator < 0 && denominator < 0)
        {
            numerator *= -1;
            denominator = -denominator;
        }
    }
    
    /**
     * Reduce this Fraction to lowest form
     * 4/8 => 1/2
     */
    public void reduce(){
         
    }
    public Fraction plus(Fraction that){
        return new Fraction();
    }
    
    public Fraction minus(Fraction that){
        //TODO 
        throw new UnsupportedOperationException();
    }
    
    public Fraction dividedBy(Fraction that){
        throw new UnsupportedOperationException();
    }
    
    public Fraction negate(){
        throw new UnsupportedOperationException();
    }
    
    public Fraction times(Fraction that){
        return new Fraction(
                this.numerator * that.numerator,
                this.denominator * that.denominator);
    }
    
    
    
    
}
