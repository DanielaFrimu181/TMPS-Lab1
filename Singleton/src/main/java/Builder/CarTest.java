package Builder;

public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car
                .CarBuilder()
                .withBrand("Mercedes")
                .withModel("ML 230")
                .ofYear(1999)
                .withVin("x45v894ERTR97456")
                .withFuel("Petrol")
                .withEngineVolume(2398)
                .withWeight(1830)
                .build();

        Car car2 = new Car
                .CarBuilder()
                .withBrand("Suzuki")
                .withModel("SX4")
                .ofYear(2013)
                .withVin("JN8AS5MT7EW612009")
                .withFuel("Petrol")
                .withEngineVolume(1599)
                .withWeight(1155)
                .build();

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
