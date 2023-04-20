package twoDimensionalArray;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        char [][] array = new char[size][size];
        int i;
        int j;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++){
                if (i == j || size - i - 1 == j) {
                    array[i][j] = SYMBOL;
                } else {
                    array[i][j] = ' ';
                }
        }
    }
        return array;
    }
}




