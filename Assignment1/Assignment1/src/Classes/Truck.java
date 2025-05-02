package Classes;

import Abstract.CarBase;

public class Truck extends CarBase {
    private int currentWeight;
    private int trailerWeight;

    // checks to see if trailer weight is needed in total weight calculation
    private boolean isHauling;

    public Truck(String color) {
        super(color);
        isHauling = false;
        currentWeight = 0;
    }

    @Override
    public int getMaxWeight() {
        return 10000;
    }

    @Override
    public int addWeight(int weight) {
        if ((currentWeight + weight + trailerWeight) < this.getMaxWeight()) {
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

    // adds trailer weight IFF it does not exceed the max weight
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
