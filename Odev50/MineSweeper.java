package com.company.Odev50;

import java.util.Scanner;

public class MineSweeper {
    String[][] map;
    String[][] board;
    int row;
    int col;
    int countOfMines;

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.map = new String[row][col];
        this.board = new String[row][col];
        this.countOfMines = (row * col) / 4;
    }

    void showingMap() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println();
        }
    }

    void gameMap() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                this.board[i][j] = "-";
            }
        }
    }

    void minedMap() {
        for (int i = 0; i < countOfMines; i++) {
            int tempRow = (int) (Math.random() * row);
            int tempCol = (int) (Math.random() * col);
            if (this.map[tempRow][tempCol] != "*") {
                this.map[tempRow][tempCol] = "*";
            } else {
                i--;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (this.map[i][j] != "*") {
                    this.map[i][j] = "-";
                }
                System.out.print(this.map[i][j] + " ");
            }
            System.out.println();
        }
    }

    void showingMinedMap() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(this.map[i][j] + " ");
            }
            System.out.println();
        }
    }

    void run() {
        int totalMove = (col * row) - countOfMines;
        Scanner inp = new Scanner(System.in);
        gameMap();
        minedMap();

        while (totalMove > 0) {
            int mineVision = 0;

            System.out.println("===============================");
            showingMap();
            System.out.print("Satır Giriniz: ");
            int rowInput = inp.nextInt();

            System.out.print("Sütun Giriniz: ");
            int colInput = inp.nextInt();
            if ((rowInput < 0 || rowInput >= row) || (colInput < 0 || colInput >= col)) {
                System.out.println("Hatalı giriş yaptınız. Lütfen Sınırlar Dahilinde Seçim Yapınız.");
                continue;
            } else {
                if (this.map[rowInput][colInput] == "*") {
                    System.out.println("Mayına Bastınız.");
                    showingMinedMap();
                    break;
                } else {
                    int minusRow = (rowInput - 1), sumRow = (rowInput + 1);
                    int minusCol = (colInput - 1), sumCol = (colInput + 1);
                    if ((minusRow < 0) || (minusCol < 0)) {
                        minusRow = 0;
                        minusCol = 0;
                    }
                    if ((sumRow >= col) || (sumCol >= col)) {
                        sumRow = rowInput;
                        sumCol = colInput;
                    }
                    for (int i = minusRow; i <= sumRow; i++) {
                        for (int j = minusCol; j <= sumCol; j++) {
                            if (this.map[i][j] == "*") {
                                mineVision++;
                            }
                        }
                    }
                    String convertMineVision = String.valueOf(mineVision);
                    this.board[rowInput][colInput] = convertMineVision;
                    totalMove--;
                }
            }
        }
        if (totalMove == 0) {
            System.out.println("Tebrikler kazandınız.");
        }
    }
}
