public class vAdvCalc extends advCalc{
    public double power(double x, double y) {
        return Math.pow(x, y);
    }
    public int absolutes(int a) {
        if (a > 0){
            return a * -1;
        }
        return a;
    }


}
