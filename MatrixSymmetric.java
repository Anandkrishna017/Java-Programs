import java.util.Scanner;
import java.util.Arrays;

class MatrixSymmetric {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows of the matrix:\t");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int[][] matrix = new int[row][row];
		int[][] transpose = new int[row][row];
		
		System.out.println("Enter the "+row*row+" integers in matrix 1");
		for(int i = 0; i < row; i++)
			for(int j = 0; j < row; j++)
				matrix[i][j] = sc.nextInt();
		
	
		for(int i = 0; i < row; i++)
			for(int j = 0; j < row; j++)
				transpose[i][j] = matrix[j][i];
				
		System.out.println("\nThe Matrix read is:");
		for(int i=0; i < row; i++) {
			for(int j=0; j < row; j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();	
		}
		
		System.out.println("\nThe Transpose of the Matrix is:");
		for(int i=0; i < row; i++) {
			for(int j=0; j < row; j++)
				System.out.print(transpose[i][j]+"\t");
			System.out.println();	
		}
		
		if(Arrays.deepEquals(matrix, transpose))
                    System.out.println("\nThe Matrix is a Symmetric Matrix");
                else
                    System.out.println("\nThe Matrix is not Symmetric");    	
		
		
	}
}
