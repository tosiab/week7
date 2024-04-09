import java.util.*;
public class Prompter {
    public static void main(String[]args){
        int min;
        int max;
        int num=0;
        Scanner input = new Scanner(System.in);
        System.out.print("enter a minimum value: ");
        min = input.nextInt();
        System.out.print("enter a maximum value: ");
        max = input.nextInt();
        while((max<num)||(num<min)){
            System.out.print("enter a number in the range: ");
            num = input.nextInt();
        }
        
    }
    
}
