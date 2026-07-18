package day_8;

public class searchMAXMIN_using2Darray {
    public static void main(String[] args) {

        int[][] arr = {{10, 20, 30}, {5, 40, 15}, {25, -2, 18}};

        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}