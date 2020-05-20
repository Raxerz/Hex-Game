package com.hexgame;

import java.io.*;
import java.util.*;
public class DepthFirstSearch {


	static int player1[]=new int[11];
	static int player2[]=new int[11];
	static int c=0;


	static boolean isSafe(int M[][], int row, int col, boolean visited[][],int player) {
		return (row >= 0) && (row < 11) &&     // row number is in range
				(col >= 0) && (col < 11) &&     // column number is in range
				(M[row][col]==player && !visited[row][col]); // value is 1 and not yet visited

	}

	static void DFS(int M[][], int row, int col, boolean visited[][],int player) {

		// These arrays are used to get row and column numbers of 8 neighbors of a given cell
		int rowNbr[] = { -1, -1,  0, 0,  1, 1};
		int colNbr[] = {  0,  1, -1, 1, -1, 0};

		// Mark this cell as visited
		visited[row][col] = true;

		// Recur for all connected neighbours
		for (int k = 0; k < 6; k++)
			if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited,player) ) {

				if(player==1)
					player1[row+rowNbr[k]]=1;
				else
					player2[col+colNbr[k]]=1;

				DFS(M, row + rowNbr[k], col + colNbr[k], visited,player);
			}

	}


	// The main function that returns count of islands in a given boolean 2D matrix
	static boolean countConnected(int M[][],int player) {

		// Make a bool array to mark visited cells.

		// Initially all cells are unvisited

		int count1=0;
		int count2=0;

		boolean visited[][]=new boolean[11][11];
		int i,j;

		boolean s=false;
		for (i = 0; i < 11; ++i)
			for (j = 0; j < 11; ++j)
				// If a cell with value 1 is not visited yet, then new node found
				if (M[i][j]==player && !visited[i][j]) {
					DFS(M, i, j, visited,player);
				}

		for(i=1;i<11;++i){
			if(player2[i]==1)
				count2++;

			if(player1[i]==1)
				count1++;
		}

		if(count1==10||count2==10){
			s=true;
		}

		return s;

	}

}
