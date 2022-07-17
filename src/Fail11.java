public class Fail11 {
    //Найти максимальное из натуральных чисел, непревышающих 5000,
    // которое на цело делитсяна 39.

    public static void main(String[] args) {
        for (int i = 5000; i>0; i--){
            if (i % 39 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}

