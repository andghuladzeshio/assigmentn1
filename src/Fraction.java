public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Fraction){
            return ((Fraction) o).numerator * this.denominator == ((Fraction) o).denominator * this.numerator;
        }

        return false;
    }

    @Override
    public String toString() {
        return "%d/%d".formatted(numerator, denominator);
    }

    public static Fraction truncate(Fraction fraction){
        int gcd = 1;

        for(int i = 1; i <= Math.min(fraction.numerator, fraction.denominator); i++)
        {
            if(fraction.numerator % i==0 && fraction.denominator % i==0) gcd = i;
        }

        return new Fraction(fraction.numerator / gcd, fraction.denominator / gcd);
    }

    public static Fraction subtract(Fraction f1, Fraction f2){
        int n = f1.numerator * f2.denominator - f2.numerator * f1.denominator;
        int d = f1.denominator * f2.denominator;
        return truncate(new Fraction(n, d));
    }

    public static Fraction multiply(Fraction f1, Fraction f2){
        return truncate(new Fraction(f1.numerator * f2.numerator, f1.denominator * f2.denominator));
    }
}
