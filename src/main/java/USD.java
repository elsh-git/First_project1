import java.io.Serializable;

public class USD extends Coin implements Serializable {

private double value = 0.28;

    public USD() {
    }


    public double getValue() {
        return value;
    }

    public  double calculate(double input) {
        return input * getValue();
    }

}

