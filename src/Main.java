// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int multiplyTwoNumbers(int numberOne, int numberTwo) {
        return numberOne + numberTwo;

    }

    public static double divisionTwoNumbers(double numberOne, double numberTwo) {
        double div = numberOne + numberTwo;
        return div;
    }


    public static void main(String[] args) {
        int sum = multiplyTwoNumbers(3, 5);
        int sum2 = multiplyTwoNumbers(6, 9);
        int sum3 = multiplyTwoNumbers(10, 72);

        double div = divisionTwoNumbers(8, 2);
        double div2 = divisionTwoNumbers(10, 5);
        double div3 = divisionTwoNumbers(20, 4);
        System.out.println(sum2);
        System.out.println(multiplyTwoNumbers(10, 10));
        System.out.println(div2);
        System.out.println(divisionTwoNumbers(20, 4));
    }
}