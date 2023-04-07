package Seminar_1;
// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;

public class zadacha_3 {
    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int first_num = sc.nextInt();
        System.out.println("Введите знак: ");
        char signe = sc.next().charAt(0);
        System.out.println("Введите второе число: ");
        int second_num = sc.nextInt();
        sc.close();
        var result = 0;
        if(signe == '+'){
            result = first_num+ second_num;
            System.out.println("Сумма чисел: " + result);

        }
        if(signe == '-'){
            result = first_num - second_num;
            System.out.println("Разность чисел: " + result);
        }
        if(signe == '*'){
            result = first_num * second_num;
            System.out.println("произведение чисел: " + result);
        }
        if(signe == '/'){
            double first_num1 = first_num;
            double second_num1 = second_num;
            double result1 = result;
            result1 = first_num1/second_num1;
            System.out.println("Частное чисел: " + result1);
        }
    }
    
}
