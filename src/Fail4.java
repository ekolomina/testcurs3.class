import java.util.Scanner;

public class Fail4 {
    //Найти:
    // 1.сумму всех целых чисел от 100 до 500;
    // 2.сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b>=a).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b<a){
            System.out.println("b должно быть больше a");
        }

        int sum = 0;
        for (int i=a; i<=b; i++){
            sum += i;
        }
        System.out.printf("сумму всех целых чисел- %d", sum);
    }

    }

