public class Part4 {

    public static void main(String[] args) {
        System.out.println("sum of digits: " + sumOfDigits(Integer.parseInt(args[0])));
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        int number = num;

        while (number != 0) {

            sum = sum + (number % 10);
            number /= 10;
        }
        return sum;
    }
}
