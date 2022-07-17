import java.util.Scanner;

public class Fail8 {
   // Дано натурально ечисло.
    // Определить:
    // 1.количествоцифр 3 внем;
    // 2.сколько раз в нем встречается последняя цифра;
    // 3.количество четных цифрвнем;
    // 4.сумму ег оцифр, больших пяти;
    // 5.произведение его цифр, больших семи;
    // 6.сколько раз в нем встречаются цифры 0 и 5 (всего).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int threeCount = 0;
        int lastDigit = number % 10;
        int lastDigitCount = 0;
        int evenDigitsCount = 0;
        int sum = 0;
        int product = 1;
        int nullsAndFiveCount = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit == 3){
                threeCount++;
            }

            if (digit == lastDigit){
                lastDigitCount++;
            }

            if (digit % 2 == 0){
                evenDigitsCount++;
            }

            if (digit > 5){
                sum += digit;
            }

            if (digit > 7){
                product *= digit;
            }

            if (digit == 0 || digit == 5){
                nullsAndFiveCount++;
            }

            number  /= 10;
        }

        if (product == 1){
            product = 0;
        }

        System.out.println("количество цифр 3 в нем:  " + threeCount);
        System.out.println("сколько раз в нем встречается последняя цифра: " + lastDigitCount);
        System.out.println("количество четных цифр в нем: " + evenDigitsCount);
        System.out.println("сумму его цифр, больших пяти: " + sum);
        System.out.println("произведение его цифр, больших семи:  " + product);
        System.out.println("сколько раз в нем встречаются цифры 0 и 5: " + nullsAndFiveCount);
    }
}


