import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int n;
        int c =0;
        System.out.println("Enter the Number you want to check: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c>0)
        {
            System.out.println("Number is not Prime");
        }
        else
        {
            System.out.println("Number is Prime");
        }
    }
}
