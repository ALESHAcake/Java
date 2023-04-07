package Seminar_1;
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120
public class zadacha_1 {
    public static void main(String[] args){
       int number = 5;
       int number_sum = 0;
       int number_product = 1;
       for ( int i = 1; i<=number; i++ ){
        number_sum+=i;
        number_product*=i;

       }
       System.out.println("Сумма чисел: " + number_sum);
       System.out.println("Произведение чисел :" + number_product);

    }
}

