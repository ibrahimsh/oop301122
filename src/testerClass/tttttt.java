package testerClass;

public class tttttt {
    public static void main(String[] args) {

//        int[] a = new  int[4];
//        int[][] b = new int[4][8];// new  int[rows][cols]
//
//        int[][] k = new int[3][3];
//        int[][] c = new  int [4][5];
//        c[0][0] = 5;
//        c[0][1] = 3;
//        c[1][0] = 4;
//        c[1][1] =8 ;
//        c[2][0] =9;
//        c[2][1] = 10;
//
//        int[][] m = {{1}, {2,4},{7,8,9}};// ragged matrix
//        System.out.println(c.length);//3
//        System.out.println(c[0].length);//2
//        System.out.println(c[1][1]);
        int[][] mat = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}
                       ,{13,14,15,16}
                        };//4X3
        int sum =0 ;
        int sum1 =0;
        //[0,2] + [1,1] + [2,0]
        System.out.println("test toString ="+mat.toString());
        for (int line =0; line<mat.length;line++) {
            System.out.print(" line-"+line+": ");
            for (int col = 0; col < mat[line].length; col++) {
                System.out.print(mat[line][col] + " ");
            }
//
            System.out.println();
//
        }
        System.out.println("sum all  diagonal elements using method in matrix ="+sumDiagonal(mat));
    }
    public static int sumDiagonal(int[][]mat) {
        int sum = 0;
        for (int line = 0; line < mat.length; line++) {
            //System.out.print(" line-"+line+": ");
            for (int col = 0; col < mat[line].length; col++) {
                //  System.out.print(mat[line][col] + " ");
                if (line+col == (mat.length-1)) {
                    sum = sum + mat[line][col];
                }
            }
        }
        return sum;
    }
}
