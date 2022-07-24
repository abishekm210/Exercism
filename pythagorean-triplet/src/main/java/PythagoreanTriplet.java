import java.util.*;
class PythagoreanTriplet {
    private int a, b, c;
    private static List<PythagoreanTriplet> tripletsList;
    private static int factorsLimit;
    private static int factorsSum;

    PythagoreanTriplet(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
    }

    private final static PythagoreanTriplet INSTANCE = new PythagoreanTriplet(0,0,0);

    @Override
    public boolean equals (Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PythagoreanTriplet))
            return false;
        PythagoreanTriplet pTriplet = (PythagoreanTriplet) o;
        return (this.a == pTriplet.a && this.b == pTriplet.b && this.c == pTriplet.c);
    }

    private static boolean isPythagoreanTriplet (int a, int b, int c) {
        if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
            return true;
        else
            return false;
    }

    public static PythagoreanTriplet makeTripletsList() {
        INSTANCE.tripletsList = new ArrayList<>();
        return INSTANCE;
    }

    public static PythagoreanTriplet withFactorsLessThanOrEqualTo(int factorsLimit) {
        INSTANCE.factorsLimit = factorsLimit;
        return INSTANCE;
    }

    public static PythagoreanTriplet thatSumTo(int factorsSum) {
        INSTANCE.factorsSum = factorsSum;
        return INSTANCE;
    }

    public static List<PythagoreanTriplet> build() {
        int a , b, c;
        a = 1;
        b = 2;
        c = INSTANCE.factorsSum - (a + b);

        while ((3 * a + 3) <= INSTANCE.factorsSum) {
            b = a + 1;
            c = INSTANCE.factorsSum - (a + b);
            while ( b < c ) {
                if ( INSTANCE.isPythagoreanTriplet(a, b, c) ) {
                    PythagoreanTriplet pt = new PythagoreanTriplet(a,b,c);
                    INSTANCE.tripletsList.add(pt);
                }
                b++;
                c--;
            }
            a++;
        }
        return INSTANCE.tripletsList;
    }
}