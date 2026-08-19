import java.util.Scanner;

public class TwoDimension {
    public static void main(String[] args) {
        int [][] ar = new int[3][5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Array elements");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<4; j++)
            {
                ar[i][j] = scan.nextInt();    
            }
        }
        System.out.println("Array Elements are:");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<4; j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
