import java.util.Scanner;
public class PrintingStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();
        if (n<=0){
            System.out.print("Please enter a positive number: ");
        }
        else{
            DisplayTriangle(n);
        }
        scanner.close();
    }
    public static void DisplayTriangle(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
