/**
 * Created by dmitry.arefyev on 04.10.2016.
 */
public class JUnitTesting {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        int n = calculate.calA(10, 5);
        System.out.print("Result: " + n);
    }
}
