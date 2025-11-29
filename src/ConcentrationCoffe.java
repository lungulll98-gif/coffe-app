public class ConcentrationCoffe extends Exception{
    // props
    int c;

    // constructors

    public ConcentrationCoffe(int c, String msg) {
        this.c = c;
        super(msg);
    }

    public int getC() {
        return c;
    }

}
