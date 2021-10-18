import java.util.Scanner;

public class AssignmentJava {
    public static void main(String[] args) {
        int n;
        int c = 0;

        System.out.println("Enter the Number you want to check: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n!=0)
        {

            n = n/10;
            c = c+1;

        }

        System.out.println(c);
        /*
        Or Simply
       System.out.println(String.valueOf(n).length());
        */
    }
}
