package Classes;

import Abstract.Motorcycle;

public class Trimotorcycle extends Motorcycle {
    private final int totalWheels;

    private boolean passenger;

    public Trimotorcycle() {
        super();
        totalWheels = 3;
        passenger = false;
    }

    public Trimotorcycle(String design) {
        super(design);
        totalWheels = 3;
        passenger = false;
    }

    @Override
    public int getWheels() {
        return totalWheels;
    }

    public boolean addPassenger() {
        if (!passenger) {
            passenger = true;
            return true;
        }

        return false;
    }

    public void removePassenger() {
        passenger = false;
    }
}
