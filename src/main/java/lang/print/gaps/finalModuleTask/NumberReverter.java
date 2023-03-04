package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundred = (number % 10) * 100;
        int ten = (number / 10 % 10) * 10;
        int one = number / 100 % 10;
        System.out.println(hundred + ten + one);

    }

    public static void main(String[] args) {
        NumberReverter numberReverter = new NumberReverter();
        numberReverter.revert(489);
    }
}
