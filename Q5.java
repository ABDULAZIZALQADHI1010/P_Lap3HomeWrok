import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("input three numbers");
        int a=in.nextInt(),s=in.nextInt(),d=in.nextInt();
        if (a==s&&s==d&&a==d)
            System.out.println("all the same");
        else if (a!=s&&s!=d&&a!=d) {
            System.out.println("all different");
        }else
            System.out.println("neither");
    }
}
