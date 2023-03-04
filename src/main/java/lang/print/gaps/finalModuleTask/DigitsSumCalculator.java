package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = (number / 1000) % 10;
        int second = number / 100 % 10;
        int third = number / 10 % 10;
        int fourth = number % 10;
        System.out.println(first + second + third + fourth);

    }

    public static void main(String[] args) {
        DigitsSumCalculator digitsSumCalculator = new DigitsSumCalculator();
        digitsSumCalculator.calculateSum(1234);
    }
}
