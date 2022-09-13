import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        If nr divizibile by 5 -> "Fizz"
//        If nr divizibile by 3 -> "Buzz"
//        If nr divizibile by 3 & 5 -> "FizzBuzz"
//        If nr not divizibile by 3 & 5 -> nr


        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0 )
            System.out.println("Buzz");
        else
            System.out.println(number);

    }
}