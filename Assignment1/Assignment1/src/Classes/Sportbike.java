package Classes;

import Abstract.Motorcycle;

import java.util.HashMap;
import java.util.Map;

public class Sportbike extends Motorcycle {
    private final int totalWheels;
    private Map<String, Integer> mileagePerYear;

    public Sportbike() {
        super();
        totalWheels = 2;
        mileagePerYear = new HashMap<>();
    }

    public Sportbike(String design) {
        super(design);
        totalWheels = 2;
    }

    @Override
    public int getWheels() {
        return totalWheels;
    }

    public void addMileage(String year, int mileage) {
        if (mileagePerYear.containsKey(year)) {
            mileagePerYear.put(year, mileagePerYear.get(year) + mileage);
        } else {
            mileagePerYear.put(year, mileage);
        }
    }

    public Integer getMileageByYear(String year) {
        return calculateMileage(year);
    }

    public Integer getTotalMileage() {
        return calculateMileage("all");
    }

    private Integer calculateMileage(String time) {
        Integer total = 0;
        if (time.equals("all")) {
            for (Integer i : mileagePerYear.values()) {
                total += i;
            }
        } else if (mileagePerYear.containsKey(time)) {
            return mileagePerYear.get(time);
        }
        return total;
    }
}
