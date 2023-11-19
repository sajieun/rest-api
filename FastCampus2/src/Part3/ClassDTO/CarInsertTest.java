package Part3.ClassDTO;

import Part3.model.CarDTO;
import Part3.model.CarDAO;
import Part3.model.CarUtiliy;

import java.util.Scanner;

public class CarInsertTest {
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
        String carOwner=scanner.nextLine();

        scanner.nextLine();

        System.out.print("자동차년식:");
        int carYear=scanner.nextInt();

        CarDTO car = new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;

        CarUtiliy carUtil=new CarUtiliy();
        carUtil.carPrint(car);
//        CarDAO dao = new CarDAO();
//        dao.carInsert(car); //car에 들어가는것들 다 저장이 됨
//        dao.carSelect();
    }
}
