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
public class Fraction {
    private int numerator, denominator;
    
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
    
    public Fraction times(Fraction that){
        return new Fraction(
                this.numerator * that.numerator,
                this.denominator * that.denominator);
    }
    
    
    
    
}
