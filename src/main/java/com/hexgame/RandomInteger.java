package com.hexgame;

import java.util.Random;
import javax.swing.*;
/** Generate 10 random integers in the range 0..99. */
public class RandomInteger {

  public int[] random(int a[][]){
    // log("Generating 10 random integers in range 0..99.");
    int row=0,col=0,i=0;
    //note a single Random object is reused here
    Random randomGenerator = new Random();
    for (int idx = 0; idx <= 10; ++idx) {
      row = randomGenerator.nextInt(10);
      col = randomGenerator.nextInt(10);
      System.out.println("row: + col + no"+row+""+col+""+a[row][col]);
      if(a[row][col]==1 || a[row][col]==2) {
        row=col=0;
        idx=0;
        i++;
        System.out.println("row:"+row);
        System.out.println("col:"+col);
      } else {
        break;
      }
    }

    a[row][col]=1;
    System.out.println("finally i :"+i);
    int b[]=new int[2];
    b[0]=row;
    b[1]=col;

    return b;
  }


}
 