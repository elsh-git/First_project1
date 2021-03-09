import java.io.Serializable;

public class ILS extends Coin implements Serializable {

    private double value = 3.52;

    public ILS() {
    }


    public double getValue() {
        return value;
    }

    public double calculate(double input) {
        return input * getValue();
    }
}

