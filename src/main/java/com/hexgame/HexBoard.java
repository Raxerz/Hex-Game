/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package javafxapplication2;
package com.hexgame;

import javax.swing.*;

public class HexBoard extends javax.swing.JFrame {

    static ImageIcon o=new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/red.png"));
    static ImageIcon b=new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/blue.png"));
    int c;
    int board[][];
    int new_board[][];
    int i,j;
    char ch;
    int row,col,player;
    int ai;
    static AI a=new AI();
    /**
     * Creates new form HexBoard
     */
    public HexBoard(int o) {
        c=0;
        player++;
        System.out.println(ai);
        ai=o;
        System.out.println(ai);
        board=new int[11][21];
        new_board=new int[11][11];
        for(i = 0; i < 11; i++) {
            for(j = 0; j < 21; j++) {
                board[i][j]=0;
            }
        }
        for(i = 1; i < 11; i++) {
            for(j = i; j >= 1; j--) {
                board[i][j-1]=-1;
            }
        }
        for(i = 11; i < 21; i++) {
            for(j = i; j < 21; j++) {
                board[i-11][j]=-1;
            }
        }
        initComponents();

        if(ai!=0) {
            if(ai==1) {
                rand(); player++;
            } else if(ai==2) {
                cpu();
                player++;
            }
        }
    }
    static HexBoardDFS n=new HexBoardDFS();
    public void cpu() {
        int b[]=new int[2];
        b=n.cpu(board,new_board,a);
        set(b[0],b[1]);
        end1();
    }

    public void rand() {
        RandomInteger o=new RandomInteger();
        int a[]=new int[2];
        a=o.random(new_board);
        set(a[0],a[1]);
        end1();
    }

    public void end2() {

        if(check(new_board,2)) {
            JOptionPane.showMessageDialog(null,"P2 WINS");
            System.exit(0);
        }
        jTextField1.setText("");
        jTextField1.setText("Player 1's turn!");

        if(ai==1) {
            rand();
            player=2;
        } else if(ai==2) {
            a.select(a.node(row,col));
            cpu();
            player=2;
        }
    }
    public void end1() {
        //System.out.println("WINS1");
        if(check(new_board,1)) {
            JOptionPane.showMessageDialog(null,"P1 WINS");
            System.exit(0);
        }
        jTextField1.setText("Player 2's turn!");
    }

    public boolean check(int arr[][],int player)
    {
        DepthFirstSearch b=new DepthFirstSearch();
        if(b.countConnected(arr,player)) {
            return true;
        } else {
            return false;
        }
    }

    void set(int row , int col) {
        int i,j;
        i=0;

        j=0;
        if(row==i) {
            if(col==j++) {
                jButton2.setIcon(o);
            }
            if(col==j++) {
                jButton1.setIcon(o);
            }
            if(col==j++) {
                jButton3.setIcon(o);
            }
            if(col==j++) {
                jButton4.setIcon(o);
            }
            if(col==j++) {
                jButton5.setIcon(o);
            }
            if(col==j++) {
                jButton6.setIcon(o);
            }
            if(col==j++) {
                jButton7.setIcon(o);
            }
            if(col==j++) {
                jButton8.setIcon(o);
            }
            if(col==j++) {
                jButton9.setIcon(o);
            }
            if(col==j++) {
                jButton10.setIcon(o);
            }
            if(col==j++) {
                jButton11.setIcon(o);
            }

        }

        //row2
        i++;
        j=0;
        if(row==i) {
            if(col==j++) {
                jButton12.setIcon(o);
            }
            if(col==j++) {
                jButton13.setIcon(o);
            }
            if(col==j++) {
                jButton14.setIcon(o);
            }
            if(col==j++) {
                jButton15.setIcon(o);
            }
            if(col==j++) {
                jButton16.setIcon(o);
            }
            if(col==j++) {
                jButton17.setIcon(o);
            }
            if(col==j++) {
                jButton18.setIcon(o);
            }
            if(col==j++) {
                jButton19.setIcon(o);
            }
            if(col==j++) {
                jButton20.setIcon(o);
            }
            if(col==j++) {
                jButton21.setIcon(o);
            }
            if(col==j++) {
                jButton22.setIcon(o);
            }

        }

        i++;
        j=0;
        if(row==i) {
            if(col==j++) {
                jButton23.setIcon(o);
            }
            if(col==j++) {
                jButton24.setIcon(o);
            }
            if(col==j++) {
                jButton25.setIcon(o);
            }
            if(col==j++) {
                jButton26.setIcon(o);
            }
            if(col==j++) {
                jButton27.setIcon(o);
            }
            if(col==j++) {
                jButton28.setIcon(o);
            }
            if(col==j++) {
                jButton29.setIcon(o);
            }
            if(col==j++) {
                jButton30.setIcon(o);
            }
            if(col==j++) {
                jButton31.setIcon(o);
            }
            if(col==j++) {
                jButton32.setIcon(o);
            }
            if(col==j++) {
                jButton33.setIcon(o);
            }

        }
        i++;
        j=0;
        if(row==i) {
            if(col==j++) {
                jButton35.setIcon(o);
            }
            if(col==j++) {
                jButton43.setIcon(o);
            }
            if(col==j++) {
                jButton41.setIcon(o);
            }
            if(col==j++) {
                jButton44.setIcon(o);
            }
            if(col==j++) {
                jButton42.setIcon(o);
            }
            if(col==j++) {
                jButton40.setIcon(o);
            }
            if(col==j++) {
                jButton38.setIcon(o);
            }
            if(col==j++) {
                jButton39.setIcon(o);
            }
            if(col==j++) {
                jButton36.setIcon(o);
            }
            if(col==j++) {
                jButton34.setIcon(o);
            }
            if(col==j++) {
                jButton37.setIcon(o);
            }
        }
        i++;
        j=0;
        if(row==i) {
            if(col==j++) {
                jButton48.setIcon(o);
            }
            if(col==j++) {
                jButton53.setIcon(o);
            }
            if(col==j++) {
                jButton50.setIcon(o);
            }
            if(col==j++) {
                jButton47.setIcon(o);
            }
            if(col==j++) {
                jButton52.setIcon(o);
            }
            if(col==j++) {
                jButton51.setIcon(o);
            }
            if(col==j++) {
                jButton45.setIcon(o);
            }
            if(col==j++) {
                jButton55.setIcon(o);
            }
            if(col==j++) {
                jButton49.setIcon(o);
            }
            if(col==j++) {
                jButton54.setIcon(o);
            }
            if(col==j++) {
                jButton46.setIcon(o);
            }

        }

        //row6
        i++;
        j=0;
        if(row==i) {
            if(col==j++) {
                jButton59.setIcon(o);
            }
            if(col==j++) {
                jButton64.setIcon(o);
            }
            if(col==j++) {
                jButton61.setIcon(o);
            }
            if(col==j++) {
                jButton58.setIcon(o);
            }
            if(col==j++) {
                jButton63.setIcon(o);
            }
            if(col==j++) {
                jButton62.setIcon(o);
            }
            if(col==j++) {
                jButton56.setIcon(o);
            }
            if(col==j++) {
                jButton66.setIcon(o);
            }
            if(col==j++) {
                jButton60.setIcon(o);
            }
            if(col==j++) {
                jButton65.setIcon(o);
            }
            if(col==j++) {
                jButton57.setIcon(o);
            }

        }
        //row7
        i++;
        j=0;
        if(row==i) {
            if(col==j++) {
                jButton70.setIcon(o);
            }
            if(col==j++) {
                jButton75.setIcon(o);
            }
            if(col==j++) {
                jButton72.setIcon(o);
            }
            if(col==j++) {
                jButton69.setIcon(o);
            }
            if(col==j++) {
                jButton74.setIcon(o);
            }
            if(col==j++) {
                jButton73.setIcon(o);
            }
            if(col==j++) {
                jButton67.setIcon(o);
            }
            if(col==j++) {
                jButton77.setIcon(o);
            }
            if(col==j++) {
                jButton71.setIcon(o);
            }
            if(col==j++) {
                jButton76.setIcon(o);
            }
            if(col==j++) {
                jButton68.setIcon(o);
            }

        }
        //row8
        i++;
        j=0;
        if(row==i) {
            if(col==j++) {
                jButton89.setIcon(o);
            }
            if(col==j++) {
                jButton90.setIcon(o);
            }
            if(col==j++) {
                jButton91.setIcon(o);
            }
            if(col==j++) {
                jButton92.setIcon(o);
            }
            if(col==j++) {
                jButton93.setIcon(o);
            }
            if(col==j++) {
                jButton94.setIcon(o);
            }
            if(col==j++) {
                jButton95.setIcon(o);
            }
            if(col==j++) {
                jButton96.setIcon(o);
            }
            if(col==j++) {
                jButton97.setIcon(o);
            }
            if(col==j++) {
                jButton98.setIcon(o);
            }
            if(col==j++) {
                jButton99.setIcon(o);
            }

        }
        //row9
        i++;
        j=0;
        if(row==i) {
            if(col==j++) {
                jButton100.setIcon(o);
            }
            if(col==j++) {
                jButton101.setIcon(o);
            }
            if(col==j++) {
                jButton102.setIcon(o);
            }
            if(col==j++) {
                jButton103.setIcon(o);
            }
            if(col==j++) {
                jButton104.setIcon(o);
            }
            if(col==j++) {
                jButton105.setIcon(o);
            }
            if(col==j++) {
                jButton106.setIcon(o);
            }
            if(col==j++) {
                jButton107.setIcon(o);
            }
            if(col==j++) {
                jButton108.setIcon(o);
            }
            if(col==j++) {
                jButton109.setIcon(o);
            }
            if(col==j++) {
                jButton110.setIcon(o);
            }

        }
        //row10
        i++;
        j=0;
        if(row==i)
        {
            if(col==j++) {
                jButton111.setIcon(o);
            }
            if(col==j++) {
                jButton112.setIcon(o);
            }
            if(col==j++) {
                jButton113.setIcon(o);
            }
            if(col==j++) {
                jButton114.setIcon(o);
            }
            if(col==j++) {
                jButton115.setIcon(o);
            }
            if(col==j++) {
                jButton116.setIcon(o);
            }
            if(col==j++) {
                jButton117.setIcon(o);
            }
            if(col==j++) {
                jButton118.setIcon(o);
            }
            if(col==j++) {
                jButton119.setIcon(o);
            }
            if(col==j++) {
                jButton120.setIcon(o);
            }
            if(col==j++) {
                jButton121.setIcon(o);
            }

        }
        //row11
        i++;
        j=0;
        if(row==i) {
            if(col==j++) {
                jButton122.setIcon(o);
            }
            if(col==j++) {
                jButton123.setIcon(o);
            }
            if(col==j++) {
                jButton124.setIcon(o);
            }
            if(col==j++) {
                jButton125.setIcon(o);
            }
            if(col==j++) {
                jButton127.setIcon(o);
            }
            if(col==j++) {
                jButton128.setIcon(o);
            }
            if(col==j++) {
                jButton129.setIcon(o);
            }
            if(col==j++) {
                jButton130.setIcon(o);
            }
            if(col==j++) {
                jButton131.setIcon(o);
            }
            if(col==j++) {
                jButton133.setIcon(o);
            }
            if(col==j++) {
                jButton132.setIcon(o);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jTextField1  = new javax.swing.JTextField();
        jTextField1.setText("              PLAYER1!");

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        jButton105 = new javax.swing.JButton();
        jButton106 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        jButton120 = new javax.swing.JButton();
        jButton121 = new javax.swing.JButton();
        jButton122 = new javax.swing.JButton();
        jButton123 = new javax.swing.JButton();
        jButton124 = new javax.swing.JButton();
        jButton125 = new javax.swing.JButton();
        jButton127 = new javax.swing.JButton();
        jButton128 = new javax.swing.JButton();
        jButton129 = new javax.swing.JButton();
        jButton130 = new javax.swing.JButton();
        jButton131 = new javax.swing.JButton();
        jButton132 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label6 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();
        label18 = new java.awt.Label();
        label19 = new java.awt.Label();
        label20 = new java.awt.Label();
        label21 = new java.awt.Label();
        label22 = new java.awt.Label();
        label23 = new java.awt.Label();
        label24 = new java.awt.Label();
        label25 = new java.awt.Label();
        label26 = new java.awt.Label();
        label27 = new java.awt.Label();
        label28 = new java.awt.Label();
        label29 = new java.awt.Label();
        label30 = new java.awt.Label();
        label31 = new java.awt.Label();
        label32 = new java.awt.Label();
        label33 = new java.awt.Label();
        label34 = new java.awt.Label();
        label35 = new java.awt.Label();
        label36 = new java.awt.Label();
        label37 = new java.awt.Label();
        label38 = new java.awt.Label();
        label39 = new java.awt.Label();
        label40 = new java.awt.Label();
        label41 = new java.awt.Label();
        label42 = new java.awt.Label();
        label43 = new java.awt.Label();
        label44 = new java.awt.Label();
        label45 = new java.awt.Label();
        jButton133 = new javax.swing.JButton();
        label46 = new java.awt.Label();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1) {
                            player++;
                            row=0;
                            col=1;
                            if(new_board[row][col]!=0) {
                                JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){
                                    player=2;
                                } else {
                                    player=1;
                                }
                                return;
                            }
                            new_board[row][col]=1;board[row][col]=1;
                            jButton1.setIcon(o);
                            end1();
                        } else {
                            player--;
                            row=0;
                            col=1;
                            if(new_board[row][col]!=0) {
                                JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1) {
                                    player=2;
                                } else {
                                    player=1;
                                }
                                return;
                            }
                            new_board[row][col]=2;board[row][col]=2;
                            jButton1.setIcon(b);
                            jButton1.setOpaque(false);
                            jButton1.setFocusPainted(false);
                            jButton1.setBorderPainted(false);
                            jButton1.setContentAreaFilled(false);
                            end2();
                        }
                        jButton1ActionPerformed(evt);
                    }
                });

        jButton2.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png"))); // NOI18N
        jButton2.setText("jButton1");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1) {
                            player++;
                            row=0;
                            col=0;
                            if(new_board[row][col]!=0) {
                                JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){
                                    player=2;
                                } else {
                                    player=1;
                                }
                                return;
                            }
                            new_board[row][col]=1;board[row][col]=1;
                            jButton2.setIcon(o);
                            end1();
                        } else {
                            player--;
                            row=0;
                            col=0;
                            if(new_board[row][col]!=0) {
                                JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){
                                    player=2;
                                } else {
                                    player=1;
                                }
                                return;
                            }
                            new_board[row][col]=2;board[row][col]=2;
                            jButton2.setIcon(b);
                            end2();
                        }
                        jButton2ActionPerformed(evt);
                    }
                });

        jButton3.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png"))); // NOI18N
        jButton3.setText("jButton1");
        jButton3.setFocusable(false);
        //jButton3.setText("jButton1");
        jButton3.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1) {
                            player++;
                            row=0;
                            col=2;
                            if(new_board[row][col]!=0) {
                                JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){
                                    player=2;
                                } else {
                                    player=1;
                                }
                                return;
                            }
                            new_board[row][col]=1;board[row][col]=1;
                            jButton3.setIcon(o);
                            end1();
                        } else {
                            player--;
                            row=0;
                            col=2;
                            if(new_board[row][col]!=0) {
                                JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){
                                    player=2;
                                } else {
                                    player=1;
                                }
                                return;
                            }
                            new_board[row][col]=2;board[row][col]=2;
                            jButton3.setIcon(b);
                            end2();
                        }
                        jButton3ActionPerformed(evt);
                    }
                });

        jButton5.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png"))); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton6.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton7.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton8.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton9.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton10.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));

        jButton5.setText("jButton1");
        jButton5.setFocusable(false);
        jButton4.setText("jButton1");
        jButton4.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {

                        if(player==1)
                        {
                            player++;
                            row=0;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton4.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=0;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton4.setIcon(b);
                            end2();
                        }







                        jButton4ActionPerformed(evt);
                    };
                });

        jButton5.setText("jButton1");
        jButton5.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=0;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton5.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=0;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton5.setIcon(b);
                            end2();
                        }
                        jButton5ActionPerformed(evt);
                    }
                });

        jButton6.setText("jButton1");
        jButton6.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=0;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton6.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=0;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton6.setIcon(b);
                            end2();
                        }
                        jButton6ActionPerformed(evt);
                    }
                });

        jButton7.setText("jButton1");
        jButton7.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=0;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton7.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=0;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton7.setIcon(b);
                            end2();
                        }


                        jButton7ActionPerformed(evt);
                    }
                });

        jButton8.setText("jButton1");
        jButton8.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=0;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton8.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=0;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton8.setIcon(b);
                            end2();
                        }
                        jButton8ActionPerformed(evt);
                    }
                });

        jButton9.setText("jButton1");
        jButton9.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=0;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton9.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=0;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton9.setIcon(b);
                            end2();
                        }
                        jButton9ActionPerformed(evt);
                    }
                });

        jButton10.setText("jButton1");
        jButton10.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=0;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton10.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=0;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton10.setIcon(b);
                            end2();
                        }
                        jButton10ActionPerformed(evt);
                    }
                });

        jButton11.setText("jButton1");jButton11.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton11.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=0;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton11.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=0;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton11.setIcon(b);
                            end2();
                        }
                        jButton11ActionPerformed(evt);
                    }
                });

        jButton12.setText("jButton1");jButton12.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton12.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=1;
                            col=0;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton12.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=1;
                            col=0;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton12.setIcon(b);
                            end2();
                        }
                        jButton12ActionPerformed(evt);
                    }
                });

        jButton13.setText("jButton1");jButton13.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton13.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=1;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton13.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=1;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton13.setIcon(b);
                            end2();
                        }
                        jButton13ActionPerformed(evt);
                    }
                });

        jButton14.setText("jButton1");jButton14.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton14.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=1;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton14.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=1;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton14.setIcon(b);
                            end2();
                        }
                        jButton14ActionPerformed(evt);
                    }
                });

        jButton15.setText("jButton1");jButton15.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton15.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=1;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton15.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=1;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton15.setIcon(b);
                            end2();
                        }
                        jButton15ActionPerformed(evt);
                    }
                });

        jButton16.setText("jButton1");jButton16.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton16.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=1;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton16.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=1;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton16.setIcon(b);
                            end2();
                        }
                        jButton16ActionPerformed(evt);
                    }
                });

        jButton17.setText("jButton1");jButton17.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton17.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=1;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton17.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=1;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton17.setIcon(b);
                            end2();
                        }
                        jButton17ActionPerformed(evt);
                    }
                });

        jButton18.setText("jButton1");jButton18.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton18.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=1;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton18.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=1;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton18.setIcon(b);
                            end2();
                        }
                        jButton18ActionPerformed(evt);
                    }
                });

        jButton19.setText("jButton1");jButton19.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton19.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=1;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton19.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=1;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton19.setIcon(b);
                            end2();
                        }
                        jButton19ActionPerformed(evt);
                    }
                });

        jButton20.setText("jButton1");jButton20.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton20.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=1;
                            col=8;

                            //if(col>=11)
                            // col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     jButton20.setIcon(o);
                            new_board[row][col]=1;board[row][col]=1;
                            end1();
                        }
                        else
                        {
                            player--;
                            row=1;
                            col=8;

                            //if(col>=11)
                            //col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}
                            new_board[row][col]=2;board[row][col]=2;
                            jButton20.setIcon(b);
                            end2();



                        }
                        jButton20ActionPerformed(evt);
                    }
                });

        jButton21.setText("jButton1");jButton21.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton21.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=1;
                            col=9;
                            //if(col>=11)
                            //col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     jButton21.setIcon(o);
                            new_board[row][col]=1;board[row][col]=1;

                            end1();
                        }
                        else
                        {
                            player--;
                            row=1;
                            col=9;

                            //if(col>=11)
                            //col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}
                            jButton21.setIcon(b);
                            new_board[row][col]=2;board[row][col]=2;
                            end2();
                        }
                        jButton21ActionPerformed(evt);
                    }
                });

        jButton22.setText("jButton1");jButton22.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton22.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=1;
                            col=10;
                            //    if(col>=11)
                            // col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     jButton22.setIcon(o);
                            new_board[row][col]=1;board[row][col]=1;

                            end1();
                        }
                        else
                        {
                            player--;
                            row=1;
                            col=10;

                            // if(col>=11)
                            // col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     jButton22.setIcon(b);
                            new_board[row][col]=2;board[row][col]=2;
                            end2();
                        }
                        jButton22ActionPerformed(evt);
                    }
                });

        jButton23.setText("jButton1");jButton23.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton23.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=2;
                            col=0;
                            // System.out.print(row+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton23.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=2;
                            col=0;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton23.setIcon(b);
                            end2();
                        }
                        jButton23ActionPerformed(evt);
                    }
                });

        jButton24.setText("jButton1");jButton24.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton24.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=2;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton24.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=2;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton24.setIcon(b);
                            end2();
                        }
                        jButton24ActionPerformed(evt);
                    }
                });

        jButton25.setText("jButton1");jButton25.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton25.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=2;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton25.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=2;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton25.setIcon(b);
                            end2();
                        }
                        jButton25ActionPerformed(evt);
                    }
                });

        jButton26.setText("jButton1");jButton26.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton26.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=2;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton26.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=2;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton26.setIcon(b);
                            end2();
                        }
                        jButton26ActionPerformed(evt);
                    }
                });

        jButton27.setText("jButton1");jButton27.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton27.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=2;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton27.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=2;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton27.setIcon(b);
                            end2();
                        }
                        jButton27ActionPerformed(evt);
                    }
                });

        jButton28.setText("jButton1");jButton28.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton28.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=2;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton28.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=2;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton28.setIcon(b);
                            end2();
                        }
                        jButton28ActionPerformed(evt);
                    }
                });

        jButton29.setText("jButton1");jButton29.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton29.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=2;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton29.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=2;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton29.setIcon(b);
                            end2();
                        }
                        jButton29ActionPerformed(evt);
                    }
                });

        jButton30.setText("jButton1");jButton30.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton30.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=2;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton30.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=2;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton30.setIcon(b);
                            end2();
                        }
                        jButton30ActionPerformed(evt);
                    }
                });

        jButton31.setText("jButton1");jButton31.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton31.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=2;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton31.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=2;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton31.setIcon(b);
                            end2();
                        }
                        jButton31ActionPerformed(evt);
                    }
                });

        jButton32.setText("jButton1");jButton32.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton32.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=2;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton32.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=2;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton32.setIcon(b);
                            end2();
                        }
                        jButton32ActionPerformed(evt);
                    }
                });

        jButton33.setText("jButton1");jButton33.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton33.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=2;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton33.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=2;
                            col=10;
                            System.out.print(row+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton33.setIcon(b);
                            end2();
                        }
                        jButton33ActionPerformed(evt);
                    }
                });
        jButton34.setText("jButton1");jButton34.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton34.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=3;
                            col=9;
                            System.out.print(row+"HI"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton34.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=3;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton34.setIcon(b);
                            end2();
                        }
                        jButton34ActionPerformed(evt);
                    }
                });

        jButton35.setText("jButton1");jButton35.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton35.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=3;
                            col=0;
                            System.out.print(row+"HEY"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton35.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=3;
                            col=0;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton35.setIcon(b);
                            end2();
                        }
                        jButton35ActionPerformed(evt);
                    }
                });

        jButton36.setText("jButton1");jButton36.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton36.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;

                            row=3;
                            col=8;
                            System.out.print(row+"O"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton36.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=3;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton36.setIcon(b);
                            end2();
                        }
                        jButton36ActionPerformed(evt);
                    }

                });

        jButton37.setText("jButton1");jButton37.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton37.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=3;
                            col=10;
                            System.out.print(row+"I"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton37.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=3;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton37.setIcon(b);
                            end2();
                        }
                        jButton37ActionPerformed(evt);
                    }
                });

        jButton38.setText("jButton1");jButton38.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton38.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=3;
                            col=6;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton38.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=3;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton38.setIcon(b);
                            end2();
                        }
                        jButton38ActionPerformed(evt);
                    }
                });

        jButton39.setText("jButton1");jButton39.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton39.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=3;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            System.out.print(row+"H"+col);
                            jButton39.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=3;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            System.out.print(row+"H"+col);
                            jButton39.setIcon(b);
                            end2();
                        }
                        jButton39ActionPerformed(evt);
                    }
                });

        jButton40.setText("jButton1");jButton40.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton40.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=3;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            System.out.print(row+"H"+col);
                            jButton40.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=3;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            System.out.print(row+"H"+col);
                            jButton40.setIcon(b);
                            end2();
                        }
                        jButton40ActionPerformed(evt);
                    }
                });

        jButton41.setText("jButton1");jButton41.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton41.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=3;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            System.out.print(row+"H"+col);
                            jButton41.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=3;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton41.setIcon(b);
                            end2();
                        }
                        jButton41ActionPerformed(evt);
                    }
                });

        jButton42.setText("jButton1");jButton42.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton42.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=3;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            System.out.print(row+"H"+col);
                            jButton42.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=3;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            System.out.print(row+"H"+col);
                            jButton42.setIcon(b);
                            end2();
                        }
                        jButton42ActionPerformed(evt);
                    }
                });

        jButton43.setText("jButton1");jButton43.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton43.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=3;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            System.out.print(row+"H"+col);
                            jButton43.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=3;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            System.out.print(row+"H"+col);
                            jButton43.setIcon(b);
                            end2();
                        }
                        jButton43ActionPerformed(evt);
                    }
                });

        jButton44.setText("jButton1");jButton44.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton44.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=3;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            System.out.print(row+"H"+col);
                            jButton44.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=3;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;

                            jButton44.setIcon(b);
                            end2();
                        }
                        jButton44ActionPerformed(evt);
                    }
                });

        jButton45.setText("jButton1");jButton45.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton45.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=4;
                            col=6;
                            System.out.println(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton45.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=4;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton45.setIcon(b);
                            end2();
                        }
                        jButton45ActionPerformed(evt);
                    }
                });

        jButton46.setText("jButton1");jButton46.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton46.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=4;
                            col=10;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton46.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=4;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton46.setIcon(b);
                            end2();
                        }
                        jButton46ActionPerformed(evt);
                    }
                });

        jButton47.setText("jButton1");jButton47.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton47.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=4;
                            col=3;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton47.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=4;
                            col=3;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton47.setIcon(b);
                            end2();
                        }
                        jButton47ActionPerformed(evt);
                    }
                });

        jButton48.setText("jButton1");jButton48.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton48.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=4;
                            col=0;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton48.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=4;
                            col=0;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton48.setIcon(b);
                            end2();
                        }
                        jButton48ActionPerformed(evt);
                    }
                });

        jButton49.setText("jButton1");jButton49.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton49.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=4;
                            col=8;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton49.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=4;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton49.setIcon(b);
                            end2();
                        }
                        jButton49ActionPerformed(evt);
                    }
                });

        jButton50.setText("jButton1");jButton50.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton50.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=4;
                            col=2;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton50.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=4;
                            col=2;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton50.setIcon(b);
                            end2();
                        }
                        jButton50ActionPerformed(evt);
                    }
                });

        jButton51.setText("jButton1");jButton51.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton51.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=4;
                            col=5;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton51.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=4;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton51.setIcon(b);
                            end2();
                        }
                        jButton51ActionPerformed(evt);
                    }
                });

        jButton52.setText("jButton1");jButton52.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton52.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=4;
                            col=4;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton52.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=4;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton52.setIcon(b);
                            end2();
                        }
                        jButton52ActionPerformed(evt);
                    }
                });

        jButton53.setText("jButton1");jButton53.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton53.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=4;
                            col=1;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton53.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=4;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton53.setIcon(b);
                            end2();
                        }
                        jButton53ActionPerformed(evt);
                    }
                });

        jButton54.setText("jButton1");jButton54.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton54.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        System.out.println("HI");
                        if(player==1)
                        {

                            player++;
                            row=4;
                            col=9;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton54.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=4;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton54.setIcon(b);
                            end2();
                        }
                        jButton54ActionPerformed(evt);
                    }
                });

        jButton55.setText("jButton1");jButton55.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton55.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=4;
                            col=7;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton55.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=4;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton55.setIcon(b);
                            end2();
                        }
                        jButton55ActionPerformed(evt);
                    }
                });

        jButton56.setText("jButton1");jButton56.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton56.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=5;
                            col=6;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton56.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=5;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton56.setIcon(b);
                            end2();
                        }
                        jButton56ActionPerformed(evt);
                    }
                });

        jButton57.setText("jButton1");jButton57.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton57.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=5;
                            col=10;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton57.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=5;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton57.setIcon(b);
                            end2();
                        }
                        jButton57ActionPerformed(evt);
                    }
                });

        jButton58.setText("jButton1");jButton58.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton58.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=5;
                            col=3;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton58.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=5;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton58.setIcon(b);
                            end2();
                        }
                        jButton58ActionPerformed(evt);
                    }
                });

        jButton59.setText("jButton1");jButton59.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton59.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=5;
                            col=0;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton59.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=5;
                            col=0;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton59.setIcon(b);
                            end2();
                        }
                        jButton59ActionPerformed(evt);
                    }
                });

        jButton60.setText("jButton1");jButton60.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton60.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            System.out.print(row+"H"+col);
                            row=5;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton60.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=5;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton60.setIcon(b);
                            end2();
                        }
                        jButton60ActionPerformed(evt);
                    }
                });

        jButton61.setText("jButton1");jButton61.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton61.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=5;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            System.out.print(row+"H"+col);
                            jButton61.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=5;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton61.setIcon(b);
                            end2();
                        }
                        jButton61ActionPerformed(evt);
                    }
                });

        jButton62.setText("jButton1");jButton62.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton62.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=5;
                            col=5;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton62.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=5;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton62.setIcon(b);
                            end2();
                        }
                        jButton62ActionPerformed(evt);
                    }
                });

        jButton63.setText("jButton1");jButton63.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton63.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=5;
                            col=4;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton63.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=5;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton63.setIcon(b);
                            end2();
                        }
                        jButton63ActionPerformed(evt);
                    }
                });

        jButton64.setText("jButton1");jButton64.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton64.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=5;
                            col=1;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton64.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=5;
                            col=1;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton64.setIcon(b);
                            end2();
                        }
                        jButton64ActionPerformed(evt);
                    }
                });

        jButton65.setText("jButton1");jButton65.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton65.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=5;
                            col=9;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton65.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=5;
                            col=9;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton65.setIcon(b);
                            end2();
                        }
                        jButton65ActionPerformed(evt);
                    }
                });

        jButton66.setText("jButton1");jButton66.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton66.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=5;
                            col=7;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton66.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=5;
                            col=7;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton66.setIcon(b);
                            end2();
                        }
                        jButton66ActionPerformed(evt);
                    }
                });

        jButton67.setText("jButton1");jButton67.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton67.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=6;
                            col=6;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton67.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=6;
                            col=6;
                            System.out.println(row+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton67.setIcon(b);
                            end2();
                        }
                        jButton67ActionPerformed(evt);
                    }
                });

        jButton68.setText("jButton1");jButton68.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton68.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=6;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton68.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=6;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton68.setIcon(b);
                            end2();
                        }
                        jButton68ActionPerformed(evt);
                    }
                });

        jButton69.setText("jButton1");jButton69.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton69.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=6;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton69.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=6;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton69.setIcon(b);
                            end2();
                        }
                        jButton69ActionPerformed(evt);
                    }
                });

        jButton70.setText("jButton1");jButton70.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton70.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=6;
                            col=0;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton70.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=6;
                            col=0;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton70.setIcon(b);
                            end2();
                        }
                        jButton70ActionPerformed(evt);
                    }
                });

        jButton71.setText("jButton1");jButton71.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton71.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=6;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton71.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=6;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton71.setIcon(b);
                            end2();
                        }
                        jButton71ActionPerformed(evt);
                    }
                });

        jButton72.setText("jButton1");jButton72.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton72.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=6;
                            System.out.print(row+"H"+col);
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton72.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=6;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton72.setIcon(b);
                            end2();
                        }
                        jButton72ActionPerformed(evt);
                    }
                });

        jButton73.setText("jButton1");jButton73.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton73.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=6;
                            col=5;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton73.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=6;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton73.setIcon(b);
                            end2();
                        }
                        jButton73ActionPerformed(evt);
                    }
                });

        jButton74.setText("jButton1");jButton74.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton74.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=6;
                            col=4;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton74.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=6;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton74.setIcon(b);
                            end2();
                        }
                        jButton74ActionPerformed(evt);
                    }
                });

        jButton75.setText("jButton1");jButton75.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton75.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=6;
                            col=1;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton75.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=6;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton75.setIcon(b);
                            end2();
                        }
                        jButton75ActionPerformed(evt);
                    }
                });

        jButton76.setText("jButton1");jButton76.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton76.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=6;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton76.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=6;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton76.setIcon(b);
                            end2();
                        }
                        jButton76ActionPerformed(evt);
                    }
                });

        jButton77.setText("jButton1");jButton77.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton77.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {

                        if(player==1)
                        {
                            player++;
                            row=6;
                            col=7;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton77.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=6;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton77.setIcon(b);
                            end2();
                        }
                        jButton77ActionPerformed(evt);
                    }
                });

        jButton89.setText("jButton1");jButton89.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton89.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {

                            player++;
                            row=7;
                            col=0;

                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton89.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=7;
                            col=0;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton89.setIcon(b);
                            end2();
                        }
                        jButton89ActionPerformed(evt);
                    }
                });

        jButton90.setText("jButton1");jButton90.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton90.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=7;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton90.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=7;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton90.setIcon(b);
                            end2();
                        }
                        jButton90ActionPerformed(evt);
                    }
                });

        jButton91.setText("jButton1");jButton91.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton91.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=7;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton91.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=7;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton91.setIcon(b);
                            end2();
                        }
                        jButton91ActionPerformed(evt);
                    }
                });

        jButton92.setText("jButton1");jButton92.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton92.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=7;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton92.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=7;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton92.setIcon(b);
                            end2();
                        }
                        jButton92ActionPerformed(evt);
                    }
                });

        jButton93.setText("jButton1");jButton93.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton93.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=7;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton93.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=7;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton93.setIcon(b);
                            end2();
                        }
                        jButton93ActionPerformed(evt);
                    }
                });

        jButton94.setText("jButton1");jButton94.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton94.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=7;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton94.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=7;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton94.setIcon(b);
                            end2();
                        }
                        jButton94ActionPerformed(evt);
                    }
                });

        jButton95.setText("jButton1");jButton95.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton95.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=7;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton95.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=7;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton95.setIcon(b);
                            end2();

                        }
                        jButton95ActionPerformed(evt);
                    }
                });

        jButton96.setText("jButton1");jButton96.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton96.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=7;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton96.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=7;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton96.setIcon(b);
                            end2();
                        }
                        jButton96ActionPerformed(evt);
                    }
                });

        jButton97.setText("jButton1");jButton97.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton97.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        System.out.println(row+col);
                        if(player==1)
                        {
                            player++;
                            row=7;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton97.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=7;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton97.setIcon(b);
                            end2();
                        }
                        jButton97ActionPerformed(evt);
                    }
                });

        jButton98.setText("jButton1");jButton98.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton98.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=7;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton98.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=7;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton98.setIcon(b);
                            end2();
                        }
                        jButton98ActionPerformed(evt);
                    }
                });

        jButton99.setText("jButton1");jButton99.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton99.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=7;
                            col=10;
                            //       System.out.println(row+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton99.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=7;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton99.setIcon(b);
                            end2();
                        }
                        jButton99ActionPerformed(evt);
                    }
                });

        jButton100.setText("jButton1");jButton100.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton100.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=8;
                            col=0;
                            System.out.println(row+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton100.setIcon(o);
                            end1();

                        }
                        else
                        {
                            player--;
                            row=8;
                            col=0;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton100.setIcon(b);
                            end2();
                        }
                        jButton100ActionPerformed(evt);
                    }
                });

        jButton101.setText("jButton1");jButton101.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton101.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=8;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton101.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=8;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton101.setIcon(b);
                            end2();
                        }
                        jButton101ActionPerformed(evt);
                    }
                });

        jButton102.setText("jButton1");jButton102.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton102.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=8;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton102.setIcon(o);
                            end1();

                        }
                        else
                        {
                            player--;
                            row=8;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton102.setIcon(b);
                            end2();
                        }
                        jButton102ActionPerformed(evt);
                    }
                });

        jButton103.setText("jButton1");jButton103.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton103.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=8;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton103.setIcon(o);
                            end1();
                            //return;
                        }
                        else
                        {
                            player--;
                            row=8;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton103.setIcon(b);
                            end2();
                        }
                        jButton103ActionPerformed(evt);
                    }
                });

        jButton104.setText("jButton1");jButton104.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton104.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=8;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton104.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=8;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton104.setIcon(b);
                            end2();

                        }
                        jButton104ActionPerformed(evt);
                    }
                });

        jButton105.setText("jButton1");jButton105.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton105.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=8;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton105.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=8;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton105.setIcon(b);
                            end2();
                        }
                        jButton105ActionPerformed(evt);
                    }
                });

        jButton106.setText("jButton1");jButton106.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton106.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=8;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton106.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=8;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton106.setIcon(b);
                            end2();
                        }
                        jButton106ActionPerformed(evt);
                    }
                });

        jButton107.setText("jButton1");jButton107.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton107.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=8;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton107.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=8;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton107.setIcon(b);
                            end2();
                        }
                        jButton107ActionPerformed(evt);
                    }
                });

        jButton108.setText("jButton1");jButton108.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton108.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=8;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton108.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=8;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton108.setIcon(b);
                            end2();
                        }
                        jButton108ActionPerformed(evt);
                    }
                });

        jButton109.setText("jButton1");jButton109.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton109.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=8;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton109.setIcon(o);
                            end1();

                        }
                        else
                        {
                            player--;
                            row=8;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton109.setIcon(b);
                            end2();
                        }
                        jButton109ActionPerformed(evt);
                    }
                });

        jButton110.setText("jButton1");jButton110.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton110.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=8;
                            col=10;
                            System.out.println(row+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton110.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=8;
                            col=10;
                            System.out.print(row+"H"+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton110.setIcon(b);
                            end2();
                        }
                        jButton110ActionPerformed(evt);
                    }
                });

        jButton111.setText("jButton1");jButton111.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton111.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=9;
                            col=0;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton111.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=9;
                            col=0;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton111.setIcon(b);
                            end2();
                        }
                        jButton111ActionPerformed(evt);
                    }
                });

        jButton112.setText("jButton1");jButton112.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton112.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=9;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton112.setIcon(o);
                            end1();

                        }
                        else
                        {
                            player--;
                            row=9;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton112.setIcon(b);
                            end2();
                        }
                        jButton112ActionPerformed(evt);
                    }
                });

        jButton113.setText("jButton1");jButton113.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton113.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=9;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton113.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=9;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton113.setIcon(b);
                            end2();
                        }
                        jButton113ActionPerformed(evt);
                    }
                });

        jButton114.setText("jButton1");jButton114.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton114.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=9;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton114.setIcon(o);
                            end1();

                        }
                        else
                        {
                            player--;
                            row=9;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton114.setIcon(b);
                            end2();
                        }
                        jButton114ActionPerformed(evt);
                    }
                });

        jButton115.setText("jButton1");jButton115.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton115.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=9;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton115.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=9;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton115.setIcon(b);
                            end2();
                        }
                        jButton115ActionPerformed(evt);
                    }
                });

        jButton116.setText("jButton1");jButton116.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton116.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=9;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton116.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=9;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton116.setIcon(b);
                            end2();
                        }
                        jButton116ActionPerformed(evt);
                    }
                });

        jButton117.setText("jButton1");jButton117.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton117.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=9;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton117.setIcon(o);
                            end1();

                        }
                        else
                        {
                            player--;
                            row=9;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton117.setIcon(b);
                            end2();
                        }
                        jButton117ActionPerformed(evt);
                    }
                });

        jButton118.setText("jButton1");jButton118.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton118.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=9;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton118.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=9;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton118.setIcon(b);
                            end2();
                        }
                        jButton118ActionPerformed(evt);
                    }
                });

        jButton119.setText("jButton1");jButton119.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton119.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=9;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton119.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=9;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton119.setIcon(b);
                            end2();
                        }
                        jButton119ActionPerformed(evt);
                    }
                });

        jButton120.setText("jButton1");jButton120.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton120.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=9;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton120.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=9;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton120.setIcon(b);
                            end2();
                        }
                        jButton120ActionPerformed(evt);
                    }
                });

        jButton121.setText("jButton1");jButton121.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton121.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=9;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton121.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=9;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton121.setIcon(b);
                            end2();
                        }
                        jButton121ActionPerformed(evt);
                    }
                });

        jButton122.setText("jButton1");jButton122.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton122.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=10;
                            col=0;
                            System.out.println(row+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton122.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=10;
                            col=0;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton122.setIcon(b);
                            end2();
                        }
                        jButton122ActionPerformed(evt);
                    }
                });

        jButton123.setText("jButton1");jButton123.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton123.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=10;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton123.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=10;
                            col=1;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton123.setIcon(b);
                            end2();
                        }
                        jButton123ActionPerformed(evt);
                    }
                });

        jButton124.setText("jButton1");jButton124.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton124.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=10;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton124.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=10;
                            col=2;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton124.setIcon(b);
                            end2();
                        }
                        jButton124ActionPerformed(evt);
                    }
                });

        jButton125.setText("jButton1");jButton125.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton125.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=10;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton125.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=10;
                            col=3;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton125.setIcon(b);
                            end2();
                        }
                        jButton125ActionPerformed(evt);
                    }
                });

        jButton127.setText("jButton1");jButton127.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton127.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=10;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton127.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=10;
                            col=4;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton127.setIcon(b);
                            end2();
                        }
                        jButton127ActionPerformed(evt);
                    }
                });

        jButton128.setText("jButton1");jButton128.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton128.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=10;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton128.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=10;
                            col=5;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton128.setIcon(b);
                            end2();
                        }
                        jButton128ActionPerformed(evt);
                    }
                });

        jButton129.setText("jButton1");jButton129.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton129.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=10;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton129.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=10;
                            col=6;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton129.setIcon(b);
                            end2();
                        }
                        jButton129ActionPerformed(evt);
                    }
                });

        jButton130.setText("jButton1");jButton130.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton130.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=10;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                return; };
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton130.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=10;
                            col=7;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton130.setIcon(b);
                            end2();
                        }
                        jButton130ActionPerformed(evt);
                    }
                });

        jButton131.setText("jButton1");jButton131.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton131.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=10;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton131.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=10;
                            col=8;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton131.setIcon(b);
                            end2();
                        }
                        jButton131ActionPerformed(evt);
                    }
                });

        jButton133.setText("jButton1");jButton133.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton133.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=10;
                            col=9;
                            System.out.println(row+col);
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton133.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=10;
                            col=9;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton133.setIcon(b);
                            end2();
                        }
                        jButton133ActionPerformed(evt);
                    }
                });

        jButton132.setText("jButton1");jButton132.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png")));
        jButton132.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if(player==1)
                        {
                            player++;
                            row=10;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                      new_board[row][col]=1;board[row][col]=1;
                            jButton132.setIcon(o);
                            end1();
                        }
                        else
                        {
                            player--;
                            row=10;
                            col=10;
                            if(new_board[row][col]!=0) {JOptionPane.showMessageDialog(null,"INVALID MOVE");
                                if(player==1){player=2;} else {player=1;} return;}                     new_board[row][col]=2;board[row][col]=2;
                            jButton132.setIcon(b);
                            end2();
                        }
                        jButton132ActionPerformed(evt);
                    }
                });


        label1.setBackground(new java.awt.Color(0, 0, 250));
        label1.setText("   3");

        label2.setBackground(new java.awt.Color(0, 0, 250));
        label2.setText("   1");

        label3.setBackground(new java.awt.Color(0, 0, 250));
        label3.setText("   2");

        label4.setBackground(new java.awt.Color(0, 0, 250));
        label4.setText("   5");

        label6.setBackground(new java.awt.Color(0, 0, 250));
        label6.setText("   4");

        label8.setBackground(new java.awt.Color(0, 0, 250));
        label8.setText("   8");

        label9.setBackground(new java.awt.Color(0, 0, 250));
        label9.setText("   6");

        label10.setBackground(new java.awt.Color(0, 0, 250));
        label10.setText("   9");

        label11.setBackground(new java.awt.Color(0, 0, 250));
        label11.setText("   7");

        label12.setBackground(new java.awt.Color(0, 0, 250));
        label12.setText("   11");

        label13.setBackground(new java.awt.Color(0, 0, 250));
        label13.setText("  1");

        label14.setBackground(new java.awt.Color(0, 0, 250));
        label14.setText("   3   ");

        label15.setBackground(new java.awt.Color(0, 0, 250));
        label15.setText("   4   ");

        label16.setBackground(new java.awt.Color(0, 0, 250));
        label16.setText("   5   ");

        label17.setBackground(new java.awt.Color(0, 0, 250));
        label17.setText("   6   ");

        label18.setBackground(new java.awt.Color(0, 0, 250));
        label18.setText("   7   ");

        label19.setBackground(new java.awt.Color(0, 0, 250));
        label19.setText("   10  ");

        label20.setBackground(new java.awt.Color(0, 0, 250));
        label20.setText("   9   ");

        label21.setBackground(new java.awt.Color(0, 0, 250));
        label21.setText("   8   ");

        label22.setBackground(new java.awt.Color(0, 0, 250));
        label22.setText("   11  ");

        label23.setBackground(new java.awt.Color(255, 51, 51));
        label23.setText("   C   ");

        label24.setBackground(new java.awt.Color(255, 51, 51));
        label24.setText("   D");

        label25.setBackground(new java.awt.Color(255, 51, 51));
        label25.setText("    A");

        label26.setBackground(new java.awt.Color(255, 51, 51));
        label26.setText("   E");

        label27.setBackground(new java.awt.Color(255, 51, 51));
        label27.setText("   F");

        label28.setBackground(new java.awt.Color(255, 51, 51));
        label28.setText("   G");

        label29.setBackground(new java.awt.Color(255, 51, 51));
        label29.setText("   B   ");

        label30.setBackground(new java.awt.Color(255, 51, 51));
        label30.setText("   I");

        label31.setBackground(new java.awt.Color(255, 51, 51));
        label31.setText("   H");

        label32.setBackground(new java.awt.Color(255, 51, 51));
        label32.setText("    K");

        label33.setBackground(new java.awt.Color(255, 51, 51));
        label33.setText("   J");

        label34.setBackground(new java.awt.Color(255, 51, 51));
        label34.setText("    C");

        label35.setBackground(new java.awt.Color(255, 51, 51));
        label35.setText("   A");

        label36.setBackground(new java.awt.Color(255, 51, 51));
        label36.setText("   B");

        label37.setBackground(new java.awt.Color(255, 51, 51));
        label37.setText("   D");

        label38.setBackground(new java.awt.Color(255, 51, 51));
        label38.setText("     F");

        label39.setBackground(new java.awt.Color(255, 51, 51));
        label39.setText("    G");

        label40.setBackground(new java.awt.Color(255, 51, 51));
        label40.setText("    E");

        label41.setBackground(new java.awt.Color(255, 51, 51));
        label41.setText("     I");

        label42.setBackground(new java.awt.Color(255, 51, 51));
        label42.setText("     H");

        label43.setBackground(new java.awt.Color(255, 51, 51));
        label43.setText("     K");

        label44.setBackground(new java.awt.Color(255, 51, 51));
        label44.setText("     J");

        label45.setBackground(new java.awt.Color(0, 0, 250));
        label45.setText("   10");

        jButton133.setIcon(new javax.swing.ImageIcon(Thread.currentThread().getContextClassLoader().getResource("images/icons/yellow.png"))); // NOI18N
        jButton133.setText("jButton1");
        jButton133.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton133ActionPerformed(evt);
                    }
                });

        label46.setBackground(new java.awt.Color(0, 0, 250));
        label46.setText("   2   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(1, 1, 1)
                                                                .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(20, 20, 20)
                                                                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(2, 2, 2)
                                                                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(129, 129, 129)
                                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(250, 250, 250)
                                                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(276, 276, 276)
                                                .addComponent(label45, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(339, 339, 339)
                                                .addComponent(label35, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)
                                                .addComponent(label36, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label34, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label37, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label40, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label38, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label42, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label41, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label44, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label43, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(297, 297, 297)
                                                .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton125, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton127, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton128, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton129, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton130, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton131, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton133, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGap(80, 80, 80)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(label25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(17, 17, 17)
                                                                                .addComponent(label29, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(24, 24, 24)
                                                                                .addComponent(label23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(17, 17, 17)
                                                                                .addComponent(label24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(label26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(label27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(label28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(19, 19, 19)
                                                                                .addComponent(label31, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(label30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(label33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(label32, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(0, 0, 0)
                                                                .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGap(105, 105, 105)
                                                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(label46, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(212, 212, 212)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(2, 2, 2)
                                                                                .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(1, 1, 1)
                                                                                .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(1, 1, 1)
                                                                                .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(769, 769, 769))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton35, jButton36});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {label12, label22});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton103, jButton105, jButton107, jButton109, label20});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton90, jButton91, jButton92, jButton93, jButton94, jButton95, jButton96, jButton97, jButton98, jButton99, label21, label8});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(label23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(label25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(label26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(label24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(label27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(label28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(label29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(label30, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(label32, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(label13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(6, 6, 6))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, 0)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, 0)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(label16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, 0)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, 0)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, 0)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(label45, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 0, 0)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton125, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton127, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton128, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton129, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton130, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton131, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton133, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(label12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, 0)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label36, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label40, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label39, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label43, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(272, 272, 272))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton26, jButton27, jButton28, jButton29, jButton30, jButton31, jButton32, jButton33, label14});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton34, jButton35, jButton36, jButton37, jButton38, jButton39, jButton40, jButton41, jButton42, jButton43, jButton44, label15, label6});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton45, jButton46, jButton47, jButton48, jButton49, jButton50, jButton51, jButton52, jButton53, jButton54, jButton55});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton56, jButton57, jButton58, jButton59, jButton60, jButton61, jButton62, jButton63, jButton64, jButton65, jButton66, label17, label9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton67, jButton68, jButton69, jButton70, jButton71, jButton72, jButton73, jButton74, jButton75, jButton76, jButton77, label11});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton122, jButton123, jButton124, jButton125, jButton127, jButton128, jButton129, jButton130, jButton131, jButton132, jButton133, label12, label22});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton111, jButton112, jButton113, jButton114, jButton115, jButton116, jButton117, jButton118, jButton119, jButton120, jButton121, label19, label45});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton100, jButton101, jButton102, jButton103, jButton104, jButton105, jButton106, jButton107, jButton108, jButton109, jButton110, label10, label20});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton89, jButton90, jButton91, jButton92, jButton93, jButton94, jButton95, jButton96, jButton97, jButton98, jButton99, label21, label8});

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javafxapplication2/images.png")));
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton105ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton106ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton108ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton109ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton110ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton111ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton112ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton113ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton114ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton115ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton116ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton117ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton118ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton119ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton120ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton121ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton122ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton123ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton124ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton125ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton127ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton128ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton129ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton130ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton131ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton132ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton133ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HexBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HexBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HexBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HexBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        po.setVisible(true);
    }
    static HexBoard po=new HexBoard(1);
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton121;
    private javax.swing.JButton jButton122;
    private javax.swing.JButton jButton123;
    private javax.swing.JButton jButton124;
    private javax.swing.JButton jButton125;
    private javax.swing.JButton jButton127;
    private javax.swing.JButton jButton128;
    private javax.swing.JButton jButton129;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton131;
    private javax.swing.JButton jButton132;
    private javax.swing.JButton jButton133;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private java.awt.Label label2;
    private java.awt.Label label20;
    private java.awt.Label label21;
    private java.awt.Label label22;
    private java.awt.Label label23;
    private java.awt.Label label24;
    private java.awt.Label label25;
    private java.awt.Label label26;
    private java.awt.Label label27;
    private java.awt.Label label28;
    private java.awt.Label label29;
    private java.awt.Label label3;
    private java.awt.Label label30;
    private java.awt.Label label31;
    private java.awt.Label label32;
    private java.awt.Label label33;
    private java.awt.Label label34;
    private java.awt.Label label35;
    private java.awt.Label label36;
    private java.awt.Label label37;
    private java.awt.Label label38;
    private java.awt.Label label39;
    private java.awt.Label label4;
    private java.awt.Label label40;
    private java.awt.Label label41;
    private java.awt.Label label42;
    private java.awt.Label label43;
    private java.awt.Label label44;
    private java.awt.Label label45;
    private java.awt.Label label46;
    private java.awt.Label label6;
    private java.awt.Label label8;
    private java.awt.Label label9;
    // End of variables declaration
}
