package Price;

public enum Prices {

    SUVMODEL1(10),
    SUVMODEL2(20),
    SEDANMODEL1(30),
    SEDANMODEL2(40),
    HATCHBACKMODEL1(50),
    HATCHBACKMODEL2(60);

    private int price;

    Prices(int price) {
        this.price=price;
    }

}
