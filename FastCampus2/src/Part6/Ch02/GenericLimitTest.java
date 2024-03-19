package Part6.Ch02;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers={1,2,3,4,5};
        Double[] doubles={1.0,2.0,3.0,4.0,5.0};

        AvarageCalculator<Integer> integerAvarageCalculator = new AvarageCalculator<>(integers);
        double integerAverage = integerAvarageCalculator.calculateAverage();
        System.out.println(integerAverage);

        AvarageCalculator<Double> doubleAvarageCalculator = new AvarageCalculator<>(doubles);
        double doubleAverage = doubleAvarageCalculator.calculateAverage();
        System.out.println(doubleAverage);
    }
}
