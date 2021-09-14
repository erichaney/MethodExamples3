class FractionMath
{
    static Fraction multiply(Fraction a, Fraction b)
    {
        Fraction answer = new Fraction(a.n * b.n, a.d * b.d);
        return answer;
    }
    
    static Fraction reciprocal(Fraction a)
    {
        Fraction answer = new Fraction(a.d, a.n);
        
        return answer;
    }
    
    static Fraction divide(Fraction a, Fraction b)
    {
        Fraction answer = multiply(a, reciprocal(b));
        
        return answer;
    }
}