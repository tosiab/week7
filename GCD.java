import java.util.*;
public class GCD {
    public static void main(String[]args){
        int num1;
        int num2;
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        num1 = input.nextInt();
        System.out.print("Enter a second positive integer: ");
        num2 = input.nextInt();
        while(num2>0){
            temp = num1%num2;
            num1=num2;
            num2=temp;
        }
        System.out.println("The GCD is "+ num1);
    }
}
