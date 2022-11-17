import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input a number");
        int a=in.nextInt();
        if (a==0)
            System.out.println("Zero");
        else if (a<0)
            System.out.println("negative");
        else
            System.out.println("positve");
    }
}
