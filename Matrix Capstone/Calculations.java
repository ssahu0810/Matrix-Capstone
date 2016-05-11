public class Calculations
{
    public Calculations()
    {
    }

    public Matrix add(Matrix matrix1, Matrix matrix2)
    {
        Matrix temp = new Matrix(matrix1.getNumRows(), matrix1.getNumCols());

        for (int i = 0;i<matrix1.getNumRows();i++)
        {
            for (int j = 0;j<matrix1.getNumCols();j++)
            {
                temp.enter(i,j,matrix1.get(i,j) + matrix2.get(i,j));
            }
        }

        return temp;
    }

    public Matrix multiply(Matrix m1, Matrix m2)
    {
        Matrix temp = new Matrix(m1.getNumRows(), m2.getNumCols());

        for (int i = 0;i<temp.getNumRows();i++)
        {
            for (int j = 0;j<temp.getNumCols();j++)
            {
                int sum = 0;
                for (int k = 0;k<m1.getNumCols();k++)
                {
                    sum += m1.get(i,k) * m2.get(k,j);
                }
                temp.enter(i,j,sum);
            }
        }
        
        return temp;
    }
    
    public Matrix removeRowCol(Matrix m1, int row, int col)
    {
        Matrix temp = new Matrix(m1.getNumRows()-1,m1.getNumCols()-1);
        int r = 0;
        int c = 0;
        for (int i = 0;i<m1.getNumRows();i++)
        {
            for (int j = 0;j<m1.getNumCols();j++)
            {
                if ((i!=row)&&(j!=col))
                {
                    temp.enter(r,c,m1.get(i,j));
                    c++;
                    if (c==temp.getNumCols())
                    {
                        c = 0;
                        r += 1;
                    }
                }
            }
        }
        return temp;
    }
    
    public int determinant(Matrix m1)
    {
        int sum = 0;
        
        if (m1.getNumRows() == 2)
        {
            return m1.get(0,0)*m1.get(1,1)-m1.get(0,1)*m1.get(1,0);
        }        
        for (int i = 0; i<m1.getNumRows();i++)
        {
            Matrix temp = this.removeRowCol(m1,0,i);
            sum += m1.get(0,i)*Math.pow(-1,i)*this.determinant(temp);
        }
        return sum;
    }
}