package Part3.model;

public class CarUtiliy {
    public void carPrint(CarDTO car){
        System.out.println(car.carName+car.carType+car.carOwner+car.carYear+car.carSn);
    }
}
