import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] arg)
    {
        //1
        int sum = 0;
        int []b = new int [10];

        for(int i=1; i < b.length; i++)
        {
            b[i] = i;
        }

        System.out.println("1-е задание");
        System.out.println("for:");

        for(int i=1; i < b.length; i++)
        {
            sum = b[i] + sum;
        }
        System.out.println(sum);

        sum = 0;

        System.out.println("while");

        int i = 1;
        while(i < b.length)
        {
            sum = b[i] + sum;
            i++;
        }
        System.out.println(sum);

        sum = 0;
        i = 0;

        System.out.println("do while");

        do
        {
            sum = b[i] + sum;
            i++;
        } while (i < b.length);
        System.out.println(sum);

        //2

        System.out.println("2-е задание");

        for(i = 0; i < 3; i++)
        {
            System.out.println("Введите строку:");
            Scanner sc = new Scanner(System.in);
            String k = sc.nextLine();
            System.out.println("Вы ввели: " + k);
        }

        //3

        System.out.println("3-е задание");

        int num = 1;
        double result = 0.0;

        System.out.println("Гармоническая серия : ");

        while (num < 11)
        {
            result = (double) 1 / num;
            num++;
            System.out.print(result + ", ");
        }

        //4

        System.out.println("4-е задание");

        int[] numbers = new int[10];
        Random random = new Random();
        for (i = 0; i < numbers.length; i++)
        {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Сгенерированный массив:");
        for (i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }

        Arrays.sort(numbers);

        System.out.println("Отсортированный массив:");

        for (i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }

        //5

        System.out.println("5-е задание");

        int number = 5;
        long factorial = calculateFactorial(number);

        System.out.println("Факториал числа " + number + " равен " + factorial);

    }
    public static long calculateFactorial(int number)
    {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
