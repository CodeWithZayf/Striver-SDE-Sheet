class Solution {
    public void setZeroes(int[][] matrix) {
        int i, j, rows = matrix.length, cols = matrix[0].length;
        int zerorows[] = new int[rows];
        int zerocols[] = new int[cols];

        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                if(matrix[i][j]==0)
                {
                    zerorows[i]=1;
                    zerocols[j]=1;
                }
            }
        }

        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                if(zerorows[i]==1||zerocols[j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }

        // Print the modified matrix (optional)
        // for(i=0;i<rows;i++) {
        //     for(j=0;j<cols;j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }        
    }
}