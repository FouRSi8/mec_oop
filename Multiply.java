import java.util.Scanner;
 
public class Multiply
{
    public static void main(String args[])
    {
        int n;
        Scanner keyIn = new Scanner(System.in);

        System.out.println("Enter no: ");

        n = keyIn.nextInt();

        int[][] mat1 = new int[n][n];

        int[][] mat2 = new int[n][n];

        int[][] mat3 = new int[n][n];

        System.out.println("Enter elements of Mat1: ");

        for (int i = 0; i < n; i++)

        {
            for (int j = 0; j < n; j++)

            {
                mat1[i][j] = keyIn.nextInt();
            }
        }

        System.out.println("Enter elements of Mat2: ");

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)

            {
                mat2[i][j] = keyIn.nextInt();
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)

                {
                    mat3[i][j] = mat3[i][j] + mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("The product is:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
