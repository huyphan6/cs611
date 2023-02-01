
/*
*
* Author: Huy Phan
* Assignment: PS1
* Date: 02/03/2023
*
* */

import java.util.*;
public class Board {
    private int rows;
    private int columns;
    public char[][] Board;
    public static Scanner scan = new Scanner(System.in);

    // Setter and Getter methods for rows and columns
    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }
    public void setRows(int row) {
        if (row < 0 || row > 3) {
            throw new IllegalArgumentException("Invalid row number");
        }
        rows = row;
    }
    public void setColumns(int col) {
        if (col < 0 || col > 3) {
            throw new IllegalArgumentException("Invalid column number");
        }
        columns = col;
    }

    private String winner = "";
    private boolean isWinner = false;
    private boolean isTie = false;
    private boolean restart = false;

    public String getWinner() {
        return winner;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }
    public boolean getIsWinner() {
        return isWinner;
    }
    public void setIsWinner(boolean winner) {
        isWinner = winner;
    }
    public boolean getIsTie() {
        return isTie;
    }
    public void setIsTie(boolean tie) {
        isTie = tie;
    }
    public boolean getRestart() {
        return restart;
    }
    public void setRestart(boolean restart) {
        this.restart = restart;
    }

    // Board Constructor
    public Board (int rows, int cols) {
        if (rows != cols) {
            throw new IllegalArgumentException("Board must me square");
        }
        else {
            setRows(rows);
            setColumns(cols);
            Board = new char[getRows()][getColumns()];
        }
    }

    /*
    *
    * Board Coordinates:
    * (0,0) (0,1), (0,2)
    * (1,0) (1,1), (1,2)
    * (2,0) (2,1), (2,2)
    *
    */

    public void initializeBoard() {
        for (int i = 0; i < Board.length; i++) {
            Arrays.fill(Board[i], '?');
        }
    }

    public void printBoard() {
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }

    //function that checks if someone has won the game
    public void checkIfWin(){
        // check if there are 3 in a row

        if (Board[0][0] == Board[0][1] && Board[0][1] == Board[0][2] && Board[0][0] != '?') {
            setIsWinner(true);
        }
        else if (Board[1][0] == Board[1][1] && Board[1][1] == Board[1][2] && Board[1][0] != '?') {
            setIsWinner(true);
        }
        else if (Board[2][0] == Board[2][1] && Board[2][1] == Board[2][2] && Board[2][0] != '?') {
            setIsWinner(true);
        }

        // check if there are 3 in a column
        if (Board[0][0] == Board[1][0] && Board[1][0] == Board[2][0] && Board[0][0] != '?') {
            setIsWinner(true);
        }
        else if (Board[0][1] == Board[1][1] && Board[1][1] == Board[2][1] && Board[0][1] != '?') {
            setIsWinner(true);
        }
        else if (Board[0][2] == Board[1][2] && Board[1][2] == Board[2][2] && Board[0][2] != '?') {
            setIsWinner(true);
        }

        // check if there are 3 in a diagonal
        if (Board[0][0] == Board[1][1] && Board[1][1] == Board[2][2] && Board[0][0] != '?') {
            setIsWinner(true);
        }
        else if (Board[0][2] == Board[1][1] && Board[1][1] == Board[2][0] && Board[0][2] != '?') {
            setIsWinner(true);
        }

        // check if there is a tie
        if (Board[0][0] != '?' && Board[0][1] != '?' && Board[0][2] != '?' && Board[1][0] != '?' && Board[1][1] != '?' && Board[1][2] != '?' && Board[2][0] != '?' && Board[2][1] != '?' && Board[2][2] != '?') {
            setIsTie(true);
        }
    }

    //function that adds pieces to the board
    public void addPiece(int row, int col, char piece) {
        Board[row][col] = piece;
    }

    public static void main(String[] args) {
    }
}
