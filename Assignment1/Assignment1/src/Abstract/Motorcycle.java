package Abstract;

public abstract class Motorcycle {
    private int speed;
    private final String design;

    public abstract int getWheels();

    public Motorcycle() {
        speed = 0;
        design = "basic";
    }

    public Motorcycle(String design) {
        this.design = design;
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
}
