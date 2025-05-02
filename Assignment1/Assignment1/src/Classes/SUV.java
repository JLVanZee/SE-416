package Classes;

import Abstract.CarBase;

public class SUV extends CarBase {
    private int currentWeight;

    public SUV(String color) {
        super(color);
        currentWeight = 0;
    }

    @Override
    public int getMaxWeight() {
        return 5000;
    }

    @Override
    public int addWeight(int weight) {
        if ((currentWeight + weight) < this.getMaxWeight()) {
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
