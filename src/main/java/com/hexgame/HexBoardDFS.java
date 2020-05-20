package com.hexgame;

import java.util.*;
import java.io.*;
import java.util.*;
public class HexBoardDFS extends DepthFirstSearch {
	static boolean visited[][]=new boolean[11][11];
	static int count=0;
	public int[] cpu(int board[][], int new_board[][],AI a) {
		StringTokenizer st;
		Scanner s=new Scanner(System.in);
		int c=0;
		Random r=new Random();
		int i,j;

		char ch;
		int row,col,player;
		boolean won=false;
		boolean allowed;
		do {
			allowed=true;
			if(count==0) {
				row=0;
				col=r.nextInt(9)+2;
				a.path(col);
			} else {
				if(a.checkdel()&&!a.f) {
					st=new StringTokenizer(a.get_Next()," ");
					row=Integer.parseInt(st.nextToken());
					col=Integer.parseInt(st.nextToken());
				} else {
					count=-1;
					row=0;
					col=r.nextInt(9)+2;
				}
			}
			count++;
			System.out.println(new_board[row][col]);
			if(new_board[row][col]!=0)
				allowed=false;
			else {
				new_board[row][col]=1;
				board[row][col+row]=1;
				allowed=true;
			}
		} while(allowed==false);

		int p[]=new int[2];
		p[0]=row;
		p[1]=col;
		return p;
	}
}