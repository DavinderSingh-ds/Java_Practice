//matrix zero problem
public class matrixZero {
    static void setZeroes(int matrix[][]){
        int rows = matrix.length, cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    int ind = i-1;
                    while (ind>=0) {
                        if (matrix[ind][j] != 0) {
                            matrix[ind][j] = -1;
                        }
                        ind--;
                    }
                    ind = i+1;
                    while (ind < rows) {
                        if (matrix[ind][j] != 0) {
                            matrix[ind][j] = -1;
                        }
                        ind++;
                    }
                    ind = j-1;
                    while (ind>=0) {
                        if (matrix[i][ind] != 0) {
                            matrix[i][ind] = -1;
                        }
                        ind--;
                    }
                    ind = j+1;
                    while (ind<cols) {
                        if (matrix[i][ind] !=0) {
                            matrix[i][ind] = -1;
                        }
                        ind++;
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // if (matrix[i][j] == -1) {
                //     matrix[i][j] = 0;
                // }
                if (matrix[i][j] <= 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{2,0,4,5},{4,5,6,7}};
        setZeroes(arr);
        System.out.println("The final matrix is : ");
       for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
       }
    }
}
