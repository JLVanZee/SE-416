package Classes;

import Abstract.Car;

public class Sedan extends Car {
    //private int speed;
    final private int MAX_WEIGHT = 1000;
    private int currentWeight;

    public Sedan(String color) {
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
