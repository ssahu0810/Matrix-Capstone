public class Matrix
{
    private int[][] matrix1;

    /**
     * Matrix Constructor
     *
     * @param matrix1 2d array representing matrix
     */
    public Matrix(int[][] matrix1)
    {
        this.matrix1 = matrix1;
    }
    
    /**
     * Matrix Constructor
     *
     * @param rows number of rows
     * @param cols number of coloumns
     */
    public Matrix(int rows, int cols)
    {
        this.matrix1 = new int[rows][cols];
    }
    
    /**
     * Method getArray
     *
     * @return 2d array representing matrix
     */
    public int[][] getArray()
    {
        return this.matrix1;
    }
    
    /**
     * Method show
     * Prints out matrix
     *
     */
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
    
    /**
     * Method transpose
     * Flips matrix about it's diagonal line
     *
     */
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
    
    /**
     * Method getNumRows
     *
     * @return number of rows
     */
    public int getNumRows()
    {
        return this.matrix1.length;
    }
    
    /**
     * Method getNumCols
     *
     * @return number of coloumns
     */
    public int getNumCols()
    {
        return this.matrix1[0].length;
    }
    
    /**
     * Method get
     *
     * @param row row position
     * @param col coloumn position
     * @return element at specific position
     */
    public int get(int row, int col)
    {
        return matrix1[row][col];
    }
    
    /**
     * Method enter
     *
     * @param row row position
     * @param col coloun position
     * @param element element to be entered
     */
    public void enter(int row, int col, int element)
    {
        matrix1[row][col] = element;
    }
    
    /**
     * Method getRow
     *
     * @param row row position
     * @return entire row specified
     */
    public int[] getRow(int row)
    {
        int[] temp = new int[matrix1.length];
        for (int i = 0;i<matrix1.length;i++)
        {
            temp[i] = matrix1[row][i];
        }
        return temp;
    }
    
    /**
     * Method getCol
     *
     * @param col coloumn position
     * @return entire coloumn specified
     */
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