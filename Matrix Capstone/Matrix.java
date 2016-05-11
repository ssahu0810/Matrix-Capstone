public class Matrix
{
    private int[][] matrix1;

    public Matrix(int[][] matrix1)
    {
        this.matrix1 = matrix1;
    }
    
    public Matrix(int rows, int cols)
    {
        this.matrix1 = new int[rows][cols];
    }
    
    public int[][] getArray()
    {
        return this.matrix1;
    }
    
    public void show()
    {
        for (int i = 0;i<matrix1.length;i++)
        {
            for (int j = 0;j<matrix1[0].length;j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void transpose()
    {
        int[][] temp1 = this.matrix1;
        int[][] temp2 = new int[this.matrix1[0].length][this.matrix1.length];
        
        for (int i = 0;i<temp1.length;i++)
        {
            for (int j = 0;j<temp1.length;j++)
            {
                temp2[i][j] = temp1[j][i];
            }
        }
        
        this.matrix1 = temp2;
    }
    
    public int getNumRows()
    {
        return this.matrix1.length;
    }
    
    public int getNumCols()
    {
        return this.matrix1[0].length;
    }
    
    public int get(int row, int col)
    {
        return matrix1[row][col];
    }
    
    public void enter(int row, int col, int element)
    {
        matrix1[row][col] = element;
    }
    
    public int[] getRow(int row)
    {
        int[] temp = new int[matrix1.length];
        for (int i = 0;i<matrix1.length;i++)
        {
            temp[i] = matrix1[row][i];
        }
        return temp;
    }
    
    public int[] getCol(int col)
    {
        int[] temp = new int[matrix1[0].length];
        for (int i = 0;i<matrix1[0].length;i++)
        {
            temp[i] = matrix1[i][col];
        }
        return temp;
    }
    
}