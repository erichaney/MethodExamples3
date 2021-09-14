class MathExamples
{
    
    static double average(double a, double b)
    {
        return (a + b) / 2;
    }
    
    static double average(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
    
    static double abs(double n)
    {
        if (n >= 0)
        {
            return n;
        }
        else
        {
            return -1 * n;
        }
    }
    
    /**
     * Returns true if the input is divisible by three and false otherwise
     */
    static boolean isThreeven(int number)
    {
        return isDivisibleBy(number, 3);
    }
    
    /**
     * Returns true if the input number is divisible by the input divisor.
     */
    static boolean isDivisibleBy(int number, int divisor)
    {
        if (number % divisor == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    static String coinFlip()
    {
        if (Math.random() > 0.5)
        {
            return "Heads";
        }
        else
        {
            return "Tails";
        }
    }
    /**
     * Returns the factorial of the given number.
     * 
     * For example factorial(5) = 1 * 2 * 3 * 4 * 5
     */
    static int factorial(int n)
    {
        int product = 1;
        
        while(n > 0)
        {
            product = product * n;
            n = n - 1;
        }
        
        return product;
    }
    
    static int ageInSeconds(int years)
    {
        return years * 365 * 24 * 60 * 60;
    }
    
    static double solveHypotenuse(double a, double b)
    {
        return Math.sqrt(a*a + b*b);
    }
    
    static double squareRoot(double n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException(
            "Input must be non-negative.");
        }
        
        double guess = n;
        int loop = 0;
        
        while (guess * guess != n && loop < 20)
        {
            guess = average(guess, n / guess);
            System.out.println(guess);
            loop = loop + 1;
        }
        
        return guess;
    }
    
    
}