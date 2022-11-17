import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input employee name");
        String ename = in.next();
        System.out.println("input employee salary");
        float esal = in.nextFloat();
        System.out.println("input the total worked hours in the last week");
        float wHours = in.nextFloat();
        double Pay = 0;
        float OriginPay=wHours*esal;
        double AddPay=wHours*(esal*1.5);
        if (wHours < 40){
            Pay=OriginPay;
        }
        else
            Pay=AddPay;
        System.out.println("worked Hours =" + wHours + "salary =" + esal + "pay =" + Pay);
    }}