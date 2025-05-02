package Classes;

import Abstract.CarBase;

public class Sedan extends CarBase {
    //private int speed;
    private int currentWeight;

    public Sedan(String color) {
        super(color);
        currentWeight = 0;
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

    @Override
    public int getMaxWeight() {
        return 1000;
    }

}
