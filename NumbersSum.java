import java.util.*;
public class NumbersSum{
    public static void main(String[]args){
        int number;
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = input.nextInt();
        sum = number;
        System.out.println(number);
        while (number>1){
            number = number - 1;
            System.out.println(number);
            sum = sum + number;

        }
        System.out.println(sum);

    }
}