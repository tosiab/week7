import java.util.*;
public class DigitsSum {
    public static void main(String[]args){
        int num;
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number");
        num = input.nextInt();
        while(num>0){
            sum+=num%10;
            num = (num-(num%10))/10;
        }
        System.out.print("The sum is "+ sum +".");
    }
}
