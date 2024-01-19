public class array2d {
    public static void main(String[] args) {
        int[][] myArray = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

       System.out.println("2D Array:");
        print2DArray(myArray);

        
        System.out.println("\nSum of elements in each row:");
        calculateAndPrintRowSum(myArray);

       
        System.out.println("\nSum of elements in each column:");
        calculateAndPrintColumnSum(myArray);
    }

    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void calculateAndPrintRowSum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row " + i + ": " + rowSum);
        }
    }

    public static void calculateAndPrintColumnSum(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < arr.length; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Column " + j + ": " + colSum);
        }
    }
}
