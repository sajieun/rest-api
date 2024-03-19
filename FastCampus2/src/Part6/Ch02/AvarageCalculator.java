package Part6.Ch02;

public class AvarageCalculator<T extends Number> {
    private T[] numbers;

    public AvarageCalculator(T[] numbers) {
        this.numbers = numbers;
    }

    public double calculateAverage(){
        double sum =0.0;
        for (T number : numbers){
            sum+=number.doubleValue();
        }
        return sum/numbers.length;
    }
}
