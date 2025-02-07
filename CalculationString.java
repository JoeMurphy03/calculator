public class CalculationString {
    public String calcStr(double fNum, double sNum, double ans, String sign)
    {
        String calculationString = Double.toString(fNum) + " "+ sign + " " + Double.toString(sNum) + " = " + Double.toString(ans);
        return calculationString;
    }
}
