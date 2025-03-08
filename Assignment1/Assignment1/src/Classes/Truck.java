package Classes;

import Abstract.Car;

public class Truck extends Car {
    final private int MAX_WEIGHT = 10000;
    private int currentWeight;
    private int trailerWeight;

    private boolean isHauling;

    public Truck(String color) {
        super(color);
        isHauling = false;
        currentWeight = 0;
    }

    @Override
    public int addWeight(int weight) {
        if ((currentWeight + weight + trailerWeight) < MAX_WEIGHT) {
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

    private void attachTrailer(int trailerWeight) {
        if (!isHauling && addWeight(trailerWeight) == 0) { // Data coupling
            isHauling = true;
            this.trailerWeight = trailerWeight;
        }

    }

    private void detachTrailer() {
        if (isHauling) {
            isHauling = false;
            trailerWeight = 0;
        }
    }
}
