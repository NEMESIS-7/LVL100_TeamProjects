public class advCalc extends baseCalc {
    public int min(int a, int b) {
        if (a > b){
            return a;
        }
        return b;
    }
    public int multiply(int x, int y) {
        return x * y;
    }
    public double divide(double x, double y) {
        return x / y;
    }
}
