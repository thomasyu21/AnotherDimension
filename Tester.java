import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[][]  A  = {  {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
                  };
    int[]  B  =   {  1, 3, 5 };
    int[] C = {};
    int[] D = {-1,5,20,-43};
    int[][] E = { {  1,  2, 3, 4 },
                {  2, 3,  4,  1 },
                { 3, 4,  1, 2 } };
    int[][] F = { {  1,  1, 1 },
                {  2, 2, 2 },
                { 3,  3, 3 } };
    int[][] G = { {  2,  2, 2 },
                {  2, 2, 2 } };
    System.out.println(ArrayOps.sum(B));
    System.out.println(ArrayOps.sum(C));
    System.out.println(ArrayOps.sum(D));

    System.out.println(ArrayOps.largest(B));
    System.out.println(ArrayOps.largest(D));

    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));

    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));

    System.out.println(ArrayOps.sum(A));

    System.out.println(Arrays.toString(ArrayOps.sumCols(A)));

    System.out.println(ArrayOps.isRowMagic(E));
    System.out.println(ArrayOps.isRowMagic(F));
    System.out.println(ArrayOps.isRowMagic(G));

    System.out.println(ArrayOps.isColMagic(E));
    System.out.println(ArrayOps.isColMagic(F));
    System.out.println(ArrayOps.isColMagic(G));
  }
}
