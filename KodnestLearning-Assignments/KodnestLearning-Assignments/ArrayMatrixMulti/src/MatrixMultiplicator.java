
public class MatrixMultiplicator {
	int[][] matrixMulti(int matrixA[][],int matrixB[][]) {
		int result[][]=new int[matrixA.length][matrixB.length];
		
		for(int i=0;i<=matrixA.length-1;i++) {
			for(int j=0;j<=matrixB.length-1;j++) {
				for(int k=0;k<=matrixA.length-1;k++)
				{
				result[i][j]=result[i][j]+(matrixA[i][k]*matrixB[k][j]);
				}
			}
		}
		
		return result;
	}
}
