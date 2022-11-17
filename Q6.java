import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("input three numbers");
        int a= in.nextInt(),c=in.nextInt(),m=in.nextInt();
        if (c==(a+1)&&m==(c+1))
            System.out.println("increasing");
        else if (c==(a-1)&&m==(c-1))
            System.out.println("decreasing");
        else System.out.println("neither");
    }
}
