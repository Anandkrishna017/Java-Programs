import java.util.Scanner;

class MatrixAdd
{
	public static void main(String[] args) {
		System.out.println("Enter row size :\t");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Enter r column size of matrix :\t");
		int col = sc.nextInt();
		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row][col];
		int[][] ans = new int[row][col];
		
		System.out.println("Enter the elements matrix 1:");
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				matrix1[i][j] = sc.nextInt();
			
		System.out.println("Enter the elements matrix 2:");		
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				matrix2[i][j] = sc.nextInt();		
	
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				ans[i][j] = matrix1[i][j] + matrix2[i][j];
				
		System.out.println("\nMatrix 1:");
		for(int i=0; i < row; i++) {
			for(int j=0; j < col; j++)
				System.out.print(matrix1[i][j]+"\t");
			System.out.println();	
		}
		
		System.out.println("\nMatrix 2:");
		for(int i=0; i < row; i++) {
			for(int j=0; j < col; j++)
				System.out.print(matrix2[i][j]+"\t");
			System.out.println();	
		}
		
		System.out.println("\nSum of the Matrices:");
		for(int i=0; i < row; i++) {
			for(int j=0; j < col; j++)
				System.out.print(ans[i][j]+"\t");
			System.out.println();	
		}	
		
		
	}
}
