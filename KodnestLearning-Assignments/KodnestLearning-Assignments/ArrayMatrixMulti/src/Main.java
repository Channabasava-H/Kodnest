import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Matrix A : ");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int matrixA[][]=new int[m][n];
		System.out.println("Enter the size of Matrix B : ");
		int matrixB[][]=new int[scan.nextInt()][scan.nextInt()];
		
		System.out.println("Enter the Elements of Matrix A : ");
		for(int i=0;i<=matrixA.length-1;i++) {
			for(int j=0;j<=matrixA.length-1;j++) {
				matrixA[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Enter the Elements of Matrix B : ");
		for(int i=0;i<=matrixB.length-1;i++) {
			for(int j=0;j<=matrixB.length-1;j++) {
				matrixB[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Matrix A contents are... ");
		//System.out.println(Arrays.deepToString(matrixA));
		for(int i=0;i<=matrixA.length-1;i++) {
			for(int j=0;j<=matrixA.length-1;j++) {
				System.out.print(matrixA[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix B contents are... ");
		//System.out.println(Arrays.deepToString(matrixB));
		for(int i=0;i<=matrixB.length-1;i++) {
			for(int j=0;j<=matrixB.length-1;j++) {
				System.out.print(matrixB[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Product of AxB matrix are : ");
		MatrixMultiplicator matrix=new MatrixMultiplicator();
		matrix.matrixMulti(matrixA, matrixB);
		for(int i=0;i<=matrix.matrixMulti(matrixA, matrixB).length-1;i++) {
			for(int j=0;j<=matrix.matrixMulti(matrixA, matrixB)[i].length-1;j++) {
				System.out.print(matrix.matrixMulti(matrixA, matrixB)[i][j]+" ");
			}
			System.out.println();
		}
	}

}
