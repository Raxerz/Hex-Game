package com.hexgame;

import java.util.*;
public class AI {
	static Scanner s=new Scanner(System.in);
	static boolean[] color = new boolean[121];
	static int size=0;
	static int c=0,m=0;
	static ArrayList<Integer> al = new ArrayList<Integer>();
	static int d2[][]=new int[2000][11];
	static int M[][]=new int[11][11];
	static boolean delete[]=new boolean[2000];
	static Queue r = new LinkedList();
	static Queue col1 = new LinkedList();
	static boolean[] visited=new boolean[11];
	static boolean f=false;
	public static void path(int col) {

		int mat[][]=new int[121][121];
		int k=0,i,j;
		int rowNbr[] = {-1, -1,  0, 0,  1, 1};
		int colNbr[] = { 0,  1, -1, 1, -1, 0};

		for(i=0;i<11;i++) {
			for(j=0;j<11;j++) {
				M[i][j]=k++;
			}
		}

		for(j=0;j<11;j++) {
			for(k=0;k<11;k++) {
				for(i=0;i<6;i++) {
					if (isSafe(j + rowNbr[i], k + colNbr[i])) {
						mat[M[j][k]][M[j+rowNbr[i]][ k + colNbr[i]]]=1;
					}
				}
			}
		}

		long start = System.currentTimeMillis( );
		Arrays.fill(color, false);
		for(j=110;j<=120;j++) {
			al.clear();
			size=0;
			dfs(col, j,mat);

		}
		long end = System.currentTimeMillis( );
		long diff = end - start;
		System.out.println("Difference is : " + diff);
	}

	static boolean isSafe(int row, int col) {
		return (row >= 0) && (row < 11) && (col >= 0) && (col < 11) ; // value is 1 and not yet visited
	}

	static int node(int row, int col) {
		return M[row][col] ; // value is 1 and not yet visited
	}

	static void dfs(int src, int dst,int mat[][]) {
		al.add(src);
		size++;
		color[src] = true;
		if (src == dst) {
			c++;
			store(al);
			return;
		}

		for (int I = 1; I <= 120; I++) {
			if (mat[src][I] == 1) {
				if (color[I] == false && al.size()<11) {

					dfs(I, dst,mat);        // These lines do
					color[I] = false;   // main job of backtracking
					size--;
					al.remove(size);
				}
			}
		}
	}

	public static void store(ArrayList<Integer> al) {
		int n=0;
		for (Integer i : al) {
			//     Prints the path
			d2[m][n++]=i;
		}
		m++;
	}
	public static void disp() {
		for(int i=0;i<m;i++) {
			System.out.println(delete[i]);
		}
	}

	public static void select(int n) {
		int i=0;
		while(i<m) {
			for(int j=0;j<11;j++) {
				if(d2[i][j]==n) {
					delete[i]=true;
				}
			}
			i++;
		}
	}

	public static String get_Next() {
		int i=m-1;
		String s="";

		while(i>=0) {
			if(!delete[i]) {
				for(int j=1;j<11;j++) {
					r.add(row(d2[i][j]));
					col1.add(col(d2[i][j]));
				}
			}
			i--;
		}
		return next();
	}

	public static int row(int n) {
		int r=0;
		for(int i=0;i<11;i++) {
			for(int j=0;j<11;j++) {
				if(M[i][j]==n) {
					r=i;
				}
			}
		}
		return r;
	}

	public static int col(int n) {
		int c=0;
		for(int i=0;i<11;i++) {
			for(int j=0;j<11;j++) {
				if(M[i][j]==n) {
					c=j;
				}
			}
		}
		return c;
	}

	public static String next() {
		String s="";

		visited[0]=true;

		for(int i=1;i<11;i++) {
			if(visited[i]!=true) {
				s=r.element()+" "+col1.element();
				visited[i]=true;
				break;
			} else {
				if(r.peek()==null) {
					f=true;
				} else {
					r.remove();
					col1.remove();
				}
			}
		}
		r.clear();
		col1.clear();
		return s;
	}

	public static boolean checkdel() {
		boolean f=false;
		System.out.println(m);
		for(int i=0;i<m;i++) {
			if(!delete[i]) {
				f=true;
				break;
			} else {
				f=false;
			}
		}
		return f;
	}
}