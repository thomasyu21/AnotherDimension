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

  public static String arrToString(int[] arr){
    if (arr.length == 0) {
      return "{}";
    }
    String converted = "{" + arr[0];
    for (int i = 1; i < arr.length; i++) {
      converted+= (", " + arr[i]);
    }
    converted+= "}";
    return converted;
  }

  public static String arrayDeepToString(int[][] arr) {
    String newStr = "{" + arrToString(arr[0]);
    for (int i = 1; i < arr.length; i++){
      newStr+=(", " + arrToString(arr[i]));
    }
    newStr+="}";
    return newStr;
  }

}
