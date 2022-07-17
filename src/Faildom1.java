import java.util.Scanner;

public class Faildom1 {
    // Составить программу вывода любого числа любое заданное число раз.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Scanner st = new Scanner(System.in);
        int t= sc.nextInt();


        for (int i=0; i<n; i++){
            System.out.printf(t+ " ");
        }
    }
}
