package Abstract;

import Interface.*;

public abstract class CarBase implements IDriveable {
    private int speed;
    private final String color;

    public abstract int addWeight(int weight);

    public abstract int removeWeight(int weight);

    public abstract int getMaxWeight();


    public CarBase(String color) {
        this.color = color;
        speed = 0;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        }

        this.speed = speed;
    }

    public void stop() {
        speed = 0;
    }

    public String getColor() {
        return color;
    }
}
