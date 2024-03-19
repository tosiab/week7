import java.util.*;
public class Grades {
    public static void main(String[]args){
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter you grade numerically: ");
        grade = input.nextInt();
        if(grade>=90){
            System.out.println("Your grade is an A.");
        }
        if(grade>=80 && grade<90){
            System.out.println("Your grade is a B.");
        }
        if(grade>=70 && grade<80){
            System.out.println("Your grade is a C. You should study a little more.");
        }
        if(grade>=65 && grade<70){
            System.out.println("Your grade is a D. Try getting a tutor.");
        }
        if(grade<65){
            System.out.println("Your grade is a F. Get some help.");
        }

    }
}