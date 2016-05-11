public class CalculationsTester
{

    public static void testAdd()
    {
        int[][] matrix1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = new int[][]{{7,8,9},{4,5,6},{1,2,3}};
        Matrix m1 = new Matrix(matrix1);
        Matrix m2 = new Matrix(matrix2);
        m1.show();
        m2.show();

        Calculations c1 = new Calculations();

        Matrix m3 = c1.add(m1,m2);
        m3.show();
    }

    public static void returnRow()
    {
        int[][] matrix1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Matrix m1 = new Matrix(matrix1);
        m1.show();
        int[] temp = m1.getRow(1);
        for (int i = 0;i<temp.length;i++)
        {
            System.out.print(temp[i] + " ");
        }
    }

    public static void testMultiply()
    {
        int[][] matrix1 = new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] matrix2 = new int[][]{{7,8,9},{4,5,6},{1,2,3}};
        Matrix m1 = new Matrix(matrix1);
        Matrix m2 = new Matrix(matrix2);
        m1.show();
        m2.show();

        Calculations c1 = new Calculations();

        Matrix m3 = c1.multiply(m1,m2);
        m3.show();
    }
    
    public static void testRemoveRowCol()
    {
        int[][] matrix1 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Matrix m1 = new Matrix(matrix1);
        m1.show();
        Calculations c1 = new Calculations();

        Matrix m2 = c1.removeRowCol(m1,1,1);
        m2.show();
    }
    
    public static void testDeterminant()
    {
        int[][] matrix1 = new int[][]{{3,0,6,1,1},{2,4,8,1,1},{3,7,9,1,1},{4,6,4,5,4},{1,2,4,1,6}};
        Matrix m1 = new Matrix(matrix1);
        m1.show();
        Calculations c1 = new Calculations();
        int sum = c1.determinant(m1);
        System.out.println(sum);
    }
    
    public static void testInverse()
    {
        int[][] matrix1 = new int[][]{{17,10,6,11,9},{12,14,18,31,21},{13,17,29,12,14},{24,16,14,15,14},{21,32,24,41,16}};
        Matrix m1 = new Matrix(matrix1);
        m1.show();
        Calculations c1 = new Calculations();
        Matrix m2 = c1.inverse(m1);
        m2.show();
    }
}