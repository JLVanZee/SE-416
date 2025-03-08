package Classes;

import Abstract.Car;

public class SUV extends Car {
    final private int MAX_WEIGHT = 5000;
    private int currentWeight;

    public SUV(String color) {
        super(color);
        currentWeight = 0;
    }

    @Override
    public int addWeight(int weight) {
        if ((currentWeight + weight) < MAX_WEIGHT) {
            return -1;
        } else {
            currentWeight += weight;
        }
        return 0;
    }

    @Override
    public int removeWeight(int weight) {
        if ((currentWeight - weight) < 0) {
            return -1;
        } else {
            currentWeight -= weight;
        }
        return 0;
    }
}
