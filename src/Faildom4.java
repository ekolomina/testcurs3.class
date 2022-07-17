import java.util.Scanner;

public class Faildom4 {
    //Вычислить сумму 1+1/2+1/3+...+1/n.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (double i = 1; i <=n; i++) {
            sum = sum + 1 / i;
        }
        System.out.println("сумма 1+1/2+1/3+...+1/n= "+sum);
    }

}
