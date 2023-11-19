package Part3.ClassDTO;

import Part3.model.CarDTO;
import Part3.model.CarUtiliy;

public class CarUtilityTest {
    public static void main(String[] args) {
        int carSn=1100;
        String carName="santa";
        int carPrice = 9000000;
        String carOwner="sajieun";
        int carYear=2024;
        int carType=6;

        CarDTO car = new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;
//        carPrint(car);
        CarUtiliy carUtil=new CarUtiliy();
        carUtil.carPrint(car);
    }

//   얘를 CarUtility에 넣어서 사용할때 마다 쓰게 한다.
//    public static void carPrint(CarDTO car){
//        System.out.println(car.carName+car.carType+car.carOwner+car.carYear+car.carSn);
//    }
}
