public class Coffee {

    private int temp;
    private int conc;


    public Coffee(int temp, int conc) {
        this.temp = temp;
        this.conc = conc;
    }

    public int getTemp() {
        return temp;
    }

    public int getConc() {
        return conc;
    }

    @Override
    public String toString() {
        return "[temperatura cafelei = " +
                 temp +
                " : concentratia = " + conc +
                ']';
    }
}
