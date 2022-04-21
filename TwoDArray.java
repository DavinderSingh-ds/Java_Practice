public class TwoDArray { 
    public static void TwoDarray(){
        int arr[][] = { { 1, 2 }, { 3, 4 } };
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = "
                                   + arr[i][j]);
    }
    public static void main(String[] args) {
        TwoDarray();
    }
}
