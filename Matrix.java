import java.util.*;
public class Matrix{
    public static double[][] generateMatrix(int row,int col){
        Random random=new Random();
        double[][] matrix=new double[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                matrix[i][j]=random.nextInt(10);
            }
        }
        return matrix;
    }
    public static double[][] addMatrices(double[][] a,double[][] b){
        int row=a.length,col=a[0].length;
        double[][] result=new double[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                result[i][j]=a[i][j]+b[i][j];
            }
        }
        return result;
    }
    public static double[][] subtractMatrices(double[][] a,double[][] b){
        int row=a.length,col=a[0].length;
        double[][] result=new double[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                result[i][j]=a[i][j]-b[i][j];
            }
        }
        return result;
    }
    public static double[][] multiplyMatrices(double[][] a,double[][] b) {
        int row=a.length,col=b[0].length,c=a[0].length;
        double[][] result=new double[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=0;k<c;k++) {
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return result;
    }
    public static double[][] transposeMatrix(double[][] matrix) {
        int row=matrix.length,col=matrix[0].length;
        double[][] transpose=new double[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
    public static double determinant2x2(double[][] matrix){
        return matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
    }
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])-matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0])+matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0]);
    }
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if(det == 0){
            throw new ArithmeticException("Matrix is not invertible");
        }    
        double[][] inverse={{matrix[1][1]/det,-matrix[0][1]/det },{-matrix[1][0]/det,matrix[0][0]/det }};
        return inverse;
    }
    public static void displayMatrix(double[][] matrix){
        for (double[] row:matrix){
            for (double value : row) {
                System.out.printf("%.2f\t",value);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Matrix A:");
        double[][] matrixA=generateMatrix(3, 3);
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        double[][] matrixB=generateMatrix(3, 3);
        displayMatrix(matrixB);
        System.out.println("Addition of A and B ");
        displayMatrix(addMatrices(matrixA, matrixB));
        System.out.println("Subtraction of A and B ");
        displayMatrix(subtractMatrices(matrixA,matrixB));
        System.out.println("Multiplication of A and B ");
        displayMatrix(multiplyMatrices(matrixA,matrixB));
        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(matrixA));
        double[][] matrix2x2=generateMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);
        System.out.println("Determinant of 2x2 Matrix "+determinant2x2(matrix2x2));
        System.out.println("Inverse of 2x2 Matrix ");
        displayMatrix(inverse2x2(matrix2x2));
    }
}
