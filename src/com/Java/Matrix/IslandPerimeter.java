package com.Java.Matrix;
/*
 * 463. Island Perimeter
 * 
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land 
 * and grid[i][j] = 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally).
 * The grid is completely surrounded by water, and there is exactly one
 *  island (i.e., one or more connected land cells).
 *  The island doesn't have "lakes", meaning the water 
 *  inside isn't connected to the water around the island. 
 *  One cell is a square with side length 1. The grid is rectangular,
 *   width and height don't exceed 100. Determine the perimeter of the island.
 *   
 *   
 *   Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
 *   Output: 16
 *   Explanation: The perimeter is the 16 yellow stripes in the image above.
 */
public class IslandPerimeter {
	
	public int islandPerimeter(int[][] grid) {
        // 0 1 0 0
        // 1 1 1 0
        // 0 1 0 0
        // 1 1 0 0
        
        int count = 0;
        
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                
            
                if(grid[row][col] == 1){
                
                    if(row==0 || grid[row-1][col] == 0 ){
                        count++;
                    }
                    if((row)==grid.length-1 || grid[row+1][col]==0){
                        
                        count++;
                    }
                    if(col==0|| grid[row][col-1]==0){
                        count++;
                    }
                    if((col)==grid[0].length-1 || grid[row][col+1]==0){
                        count++;
                    }
                }
                
            }
        }
        
        return count;
        
    }

}
