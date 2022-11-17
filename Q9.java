import java.util.Scanner;

public class Q9 {
    static String getSeason(int d,int m) {
        String SeasonN =" ";
        if (d<21){
        if (m == 1 || m == 2 || m == 3)
                SeasonN = "Winter";
            else if (m == 4 || m == 5 || m == 6)
                SeasonN = "Spring";
            else if (m == 7 || m == 8 || m == 9)
                SeasonN = "Summer";
            else if (m == 10 || m == 11 || m == 12)
                SeasonN="Fall";
        }
        else{
        if (m == 1 || m == 2 || m == 3)
            SeasonN = "Fall";
        else if (m == 4 || m == 5 || m == 6)
            SeasonN = "Winter";
        else if (m == 7 || m == 8 || m == 9)
            SeasonN = "Spring";
        else if (m == 10 || m == 11 || m == 12)
            SeasonN="Summer";
        }
        return SeasonN;
    }
        public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input the month");
        int monnth=in.nextInt();
        System.out.println("input the day");
        int day=in.nextInt();
        System.out.println("Month : "+getSeason(day,monnth));
    }
}
