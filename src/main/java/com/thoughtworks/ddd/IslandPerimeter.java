package com.thoughtworks.ddd;

public class IslandPerimeter {
    public static void main(String[] args) {
        int i = islandPerimeter();
        System.out.println(i);
    }

    public static int islandPerimeter() {

        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};

        int rows = grid.length;
        int columns = grid[0].length;

        int tempAnswer = 0;

        if (rows == 1 || columns == 1) {
            for (int[] row : grid) {
                for (int yIndex = 0; yIndex < columns; yIndex++) {
                    if (row[yIndex] == 1) {
                        tempAnswer++;
                    }
                }
            }

            if (tempAnswer == 1)
                return 4;
            else {
                return (tempAnswer+1) * 2;
            }
        }

        int[][] perimeter = new int[rows][columns];

        int max = 4;

        for (int xIndex = 0; xIndex < rows; xIndex++) {
            for (int yIndex = 0; yIndex < columns; yIndex++) {
                if (xIndex == 0 || yIndex == 0) {
                    if (grid[xIndex][yIndex] != 0) {
                        perimeter[xIndex][yIndex] = 4;
                    }
                } else {
                    if (grid[xIndex][yIndex] != 0) {
                        int aboveValueInGrid = grid[xIndex - 1][yIndex];
                        int leftValueInGrid = grid[xIndex][yIndex - 1];

                        if (aboveValueInGrid != 0 && leftValueInGrid != 0) {
                            perimeter[xIndex][yIndex] = perimeter[xIndex - 1][yIndex] + perimeter[xIndex][yIndex - 1];
                            max = Math.max(max, perimeter[xIndex][yIndex]);
                        } else {
                            perimeter[xIndex][yIndex] = max + 2;
                            max = perimeter[xIndex][yIndex];
                        }
                    } else {
                        perimeter[xIndex][yIndex] = 0;
                    }
                }
            }
        }

        return max;
    }
}
