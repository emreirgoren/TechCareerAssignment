package Cars;

import Color.Colors;
import FuelType.FuelTypes;
import Price.Prices;

public class Hatchback extends Car{

    public Hatchback(int bagCapacity, Colors color, FuelTypes fuelType, Prices dailyRentalPrice, Prices monthlyRentalPrice) {
        super(bagCapacity, color, fuelType, dailyRentalPrice, monthlyRentalPrice);
    }

}
