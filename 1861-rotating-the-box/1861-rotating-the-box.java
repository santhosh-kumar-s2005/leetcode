import java.util.*;

class Solution {
    public char[][] rotateTheBox(char[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        for (int r = 0; r < row; r++) {

            int j = col - 1;

            for (int i = col - 1; i >= 0; i--) {

                if (grid[r][i] == '*') {
                    j = i - 1;
                }

                else if (grid[r][i] == '#') {

                    grid[r][i] = '.';
                    grid[r][j] = '#';

                    j--;
                }
            }

       //     System.out.println(Arrays.deepToString(grid));
        }

        char[][] res = new char[col][row];
        for(int i = 0; i < row; i++) {

    for(int j = 0; j < col; j++) {

        res[j][row - 1 - i] = grid[i][j];
    }
}

        return res;
    }
}