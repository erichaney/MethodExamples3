class Fraction
{
    /** The numerator of the fraction */
    int n;
    /** The denominator of the fraction */
    int d; 
    
    Fraction(int n, int d)
    {
        this.n = n;
        this.d = d;
        
        if (d == 0)
        {
            throw new IllegalArgumentException(
            "The denominator cannot be 0.");
        }
    }
}