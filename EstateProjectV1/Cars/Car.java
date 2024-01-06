package Cars;


import Color.Colors;
import FuelType.FuelTypes;
import Price.Prices;

public abstract class Car {


    private Long id;

    protected int bagCapacity;

    protected Colors colors;

    private FuelTypes fuelType;

    protected Prices dailyRentalPrice;

    protected Prices monthlyRentalPrice;


    ////////////////


    public Car(int bagCapacity, Colors colors, FuelTypes fuelType, Prices dailyRentalPrice, Prices monthlyRentalPrice) {

        this.bagCapacity = bagCapacity;
        this.colors = colors;
        this.fuelType = fuelType;
        this.dailyRentalPrice = dailyRentalPrice;
        this.monthlyRentalPrice = monthlyRentalPrice;
    }
}
