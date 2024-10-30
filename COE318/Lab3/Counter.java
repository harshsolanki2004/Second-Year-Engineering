/**
 *
 * @501167786 Harsh Solanki
 */
package coe318.lab3;
public class Counter {
    private int Modulus;
    private int Digit;
    private Counter Left;
    
    public Counter(int modulus, Counter left) {    
        Modulus = modulus;
        Left = left;
        Digit = 0;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return Modulus;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return Left;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return Digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        if (digit<Modulus){
            Digit = digit;
        }
        else {
            Digit=0;
        }
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() { //adds one to the existing value of digit. if that digit is grater or equal to the modulus, it's put ointo the setdigit method and reincremented
    Digit++;
    if (Digit>=Modulus){
        setDigit(Digit);
        if(Left != null){
         Left.increment();   
        }
    }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if (Left != null){
            return Digit+(Modulus*Left.Digit);
        }
        return Digit;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
