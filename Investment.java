import java.text.NumberFormat;
public class Investment {
    public static void main(String[]args){
        double value= 2500.0;
        double interest= 0.075;
        int year=0;
        NumberFormat money= NumberFormat.getCurrencyInstance();
        while(value<5000.0){
            value+=(value*interest);
            year+=1;
        }
        System.out.println("After "+year+" years the value of your investment will be "+value+".");
    }
    
}
