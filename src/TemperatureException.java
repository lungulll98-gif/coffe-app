public class TemperatureException  extends Exception{
    // props

    int t;

    // constructors


    public TemperatureException(int t, String msg) {
        this.t = t;
        super(msg);

    }

    public int getT() {
        return t;
    }
}
