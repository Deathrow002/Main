package Distance_Cal;

public class DistanceCal {
    public void Calculator(int liter) {
        int liteBydis = 12350; // liteBydis = circumference( 95 ) * rounds of Wheel ( 13000 )

        System.out.println((liter * liteBydis)/1000+" KM");
    }
}
