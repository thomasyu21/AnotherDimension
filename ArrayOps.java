public class ArrayOps {

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum+=arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr) {
    int largestNum = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largestNum) {
        largestNum = arr[i];
      }
    }
    return largestNum;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] sums = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      sums[i] = sum(matrix[i]);
    }
    return sums;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] withLargest = new int [matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      withLargest[i] = largest(matrix[i]);
    }
    return withLargest;
  }

  public static int sum(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum+=sum(arr[i]);
    }
    return sum;
  }

  public static int[] sumCols(int[][] matrix) {
    int[] sumCol = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i++) {
      int sumOfCol = 0;
      for (int j = 0; j < matrix.length; j++) {
        sumOfCol+=matrix[j][i];
      }
      sumCol[i] = sumOfCol;
    }
    return sumCol;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int equalSum = 0;
    for (int i = 0; i < matrix.length; i++) {
      if (sum(matrix[0]) == sum(matrix[i])) {
        equalSum++;
      }
    }
    return equalSum == matrix.length;
  }

  public static boolean isColMagic(int[][] matrix) {
    int equalSum2 = 0;
    for (int i = 0; i < matrix[0].length; i++) {
      int[] sumColsTemp = sumCols(matrix);
      if (sumColsTemp[0] == sumColsTemp[i]) {
        equalSum2++;
      }
    }
    return equalSum2 == matrix[0].length;
  }

}
