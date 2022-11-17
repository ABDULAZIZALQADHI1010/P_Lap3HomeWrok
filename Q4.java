import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a number");
        int digit = 0;
        int a = in.nextInt();
        for (int s=0;s<=11;s++){
            if (a<0) {
                a*=-1;
            }if (a==0)
                break;
            else if (a<10) {
                digit++;
                a=0;
            } else if (a >= 10) {
                digit ++;
                a/=10;
            } else if (a>=100) {
                digit++;
                a/=100;
            }else if (a>=1000) {
                digit++;
                a/=1000;
            }else if (a>=10000) {
                digit++;
                a/=10000;
            }else if (a>=100000) {
                digit++;
                a/=100000;
            }else if (a>=1000000) {
                digit++;
                a/=1000000;
            }else if (a>=10000000) {
                digit++;
                a/=10000000;
            }else if (a>=100000000) {
                digit++;
                a/=100000000;
            }else if (a<1000000000) {
                digit++;
                a/=1000000000;
            } else if (a>1000000000) {
                System.out.println("out of bounds");
            }
        }
        System.out.println("digit ="+digit);
    }
}
