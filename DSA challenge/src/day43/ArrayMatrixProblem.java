package day43;

import java.util.ArrayList;

public class ArrayMatrixProblem {

    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }

        }

        for (int i = 0; i < row.size(); i++) {
            int index = row.get(i);
            for (int j = 0; j < n; j++) {
                matrix[index][j] = 0;
            }
        }


        for (int i = 0; i < col.size(); i++) {
            int index = col.get(i);

            for (int j = 0; j < m ; j++) {
                matrix[j][index] = 0;
            }
            
        }
    }

   static void dsiplay(int matrix[][]){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int[][] matrix  = {{1,1,1}, {1,0,1}, {1,1,1}};

        dsiplay(matrix);

        ArrayMatrixProblem arrayMatrixProblem = new ArrayMatrixProblem();

        arrayMatrixProblem.setZeroes(matrix);
        System.out.println("****************");
        dsiplay(matrix);

    }
}
