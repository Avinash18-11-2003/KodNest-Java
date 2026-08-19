import java.util.Scanner;

public class TwoDimension {
    public static void main(String[] args) {
        int [][] ar = new int[3][5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Array elements:");
        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar[i].length; j++)
            {
                ar[i][j] = scan.nextInt();    
            }
        }
        System.out.println("Array Elements are:");
        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar[i].length; j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}

