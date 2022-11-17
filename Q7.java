import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("input three numbers");
        int e= in.nextInt(),r=in.nextInt(),t=in.nextInt();
        if (r==(e+1)&&t==(r+1))
            System.out.println("in order");
        else if (r==(e-1)&&t==(r-1))
            System.out.println("in order");
        else System.out.println("neither");
    }
}
