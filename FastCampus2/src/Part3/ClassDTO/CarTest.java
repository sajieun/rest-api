package Part3.ClassDTO;

import Part3.ClassDTO.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차일년번호:");
        int carSn=scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차이름:");
        String carName=scanner.nextLine();

        System.out.print("자동차가격:");
        int carPrice=scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차소유자:");
        int carOwner=scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차년식:");
        int carYear=scanner.nextInt();

        CarDTO car = new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        carInfoPrint(car);

    }
//    public void carInfoPrint(int carSn, String carName, int carPrice,int carOwner,int carYear){
//
//    }
    public static void carInfoPrint(CarDTO carDTO){
        System.out.println(carDTO.carSn+carDTO.carName+ carDTO.carPrice+ carDTO.carOwner+ carDTO.carYear);
    }
}
