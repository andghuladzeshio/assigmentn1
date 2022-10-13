public class Main {

    public static void main(String[] args) {
        System.out.println(getDiscriminant(1.0, 5.0, 4.0));
        System.out.println(getSmallest(new String[]{ "asdasd", "asdasdasasd", "asda", "asdasd", "asdasd" }));
        Fraction f = new Fraction(12, 18);
        System.out.println(f);
        f.truncate();
        System.out.println(f);
        Fraction f1 = new Fraction(1, 3);
        System.out.println(Fraction.subtract(f, f1));
        System.out.println(Fraction.multiply(f, f1));
    }

    public static String getSmallest(String[] strings){
        String smallest = "";
        int smallestSize = -1;

        for (String s : strings) {
            if (smallestSize == -1 || smallestSize > s.length()){
                smallest = s;
                smallestSize = s.length();
            }
        }

        return smallest;
    }

    public static Double getDiscriminant(Double a, Double b, Double c){
        return Math.pow(b, 2) - 4 * a * c;
    }

}
