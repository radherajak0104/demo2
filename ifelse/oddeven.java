package ifelse;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println(num + " Is even number");
            
        }

        else{
            System.out.println(num + " Is a odd number");
        }
        
        sc.close();
    }
    
}
