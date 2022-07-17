import java.util.Scanner;

public class Fail8 {
   // ���� ���������� ������.
    // ����������:
    // 1.�������������� 3 ����;
    // 2.������� ��� � ��� ����������� ��������� �����;
    // 3.���������� ������ ��������;
    // 4.����� �� �����, ������� ����;
    // 5.������������ ��� ����, ������� ����;
    // 6.������� ��� � ��� ����������� ����� 0 � 5 (�����).

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

        System.out.println("���������� ���� 3 � ���:  " + threeCount);
        System.out.println("������� ��� � ��� ����������� ��������� �����: " + lastDigitCount);
        System.out.println("���������� ������ ���� � ���: " + evenDigitsCount);
        System.out.println("����� ��� ����, ������� ����: " + sum);
        System.out.println("������������ ��� ����, ������� ����:  " + product);
        System.out.println("������� ��� � ��� ����������� ����� 0 � 5: " + nullsAndFiveCount);
    }
}


