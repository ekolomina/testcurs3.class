public class Fail6 {

    //Последовательность Фибоначчи образуется так: первый и второй члены
    // последовательности равны 1, каждый следующий равен сумме двух
    // предыдущих (1, 1, 2, 3, 5, 8, 13, ...). Дано натуральное число n.
    // 1.Найти k-йчленпоследовательности Фибоначчи.
    // 2.Получить первые n членов последовательности Фибоначчи.
    // 3.Верноли, что сумма первых n членов последовательности Фибоначчи
    // есть четное число?


    public static void main(String[] args) {

        System.out.println(fib(3));
        checkIfEvens(fibNumbers (3));
    }

    //1, 1, 2, 3, 5, 8, 13
    public static int fib(int k){
        int number = 0;
        if (k == 1 || k == 2) {
            number = 1;
        } else {
            number = fib(k - 1) + fib(k - 2); //5-1 5-2
        }
        return number;
    }

    public static int fibNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
            sum += fib(i);
        }
        return sum;
    }

    public static void checkIfEvens(int sum) {
        if (sum%2 == 0){
            System.out.println("сумма чисел чётная");
        }
        else {
            System.out.println("сумма чисел нечётная");
        }
    }
}
