import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int sub1,sub2,sub3,sub4,sub5;
        float avrg,total;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter sub1 marks");
        sub1 = s.nextInt();
        System.out.println("Enter sub2 marks");
        sub2 = s.nextInt();
        System.out.println("Enter sub3 marks");
        sub3 = s.nextInt();
        System.out.println("Enter sub4 marks");
        sub4 = s.nextInt();
        System.out.println("Enter sub5 marks");
        sub5 = s.nextInt();
//        sub1 = 91;
//        sub2 = 98;
//        sub3 = 97;
//        sub4 = 95;
//        sub5 = 93;
        total = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total marks = "+total);
        avrg = total/5;
        System.out.println("Averge = "+avrg);
    }
}
