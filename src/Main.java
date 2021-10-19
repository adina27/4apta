import java.util.Scanner;
public class main {

    public static int main(String[] args) {

     Scanner num = new Scanner(System.in);
     int n, i , a[];
     System.out.print("Enter n: ");
     n = num.nextInt();
     for(i=0; i<n; i++){
         System.out.print("Enter a[i]: ");
         a[i] = num.nextInt();
         sort (a , a+n );
     }
     for(i=0; i<n; i++){
         System.out.println(" "+ a[i]);
         return 0;
     }
    }
}