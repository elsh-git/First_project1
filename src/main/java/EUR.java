import java.io.Serializable;

public class EUR extends Coin implements Serializable {

    private double value = 1/4.23;

    public EUR() {
    }

    public double getValue() {
        return value;
    }

    public  double calculate(double input) {
        return input * getValue();
    }

}
