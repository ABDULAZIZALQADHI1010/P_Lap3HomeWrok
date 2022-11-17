import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("input a month;");
        int m=in.nextInt();
        if (m==2)
            System.out.println("28 days");
        else if (m==1||m==3||m==5||m==7||m==8||m==10||m==12)
            System.out.println("31 days");
        else if (m==4||m==6||m==9||m==11)
            System.out.println("30 days");
        else
            System.out.println("out of bounds");
    }
}
