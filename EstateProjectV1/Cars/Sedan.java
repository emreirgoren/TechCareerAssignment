package Cars;

import Color.Colors;
import FuelType.FuelTypes;
import Price.Prices;

public class Sedan extends Car{

    public Sedan(int bagCapacity, Colors color, FuelTypes fuelType, Prices dailyRentalPrice, Prices monthlyRentalPrice) {
        super(bagCapacity, color, fuelType, dailyRentalPrice, monthlyRentalPrice);
    }

}
