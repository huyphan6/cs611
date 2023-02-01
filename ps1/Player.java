
/*
 *
 * Author: Huy Phan
 * Assignment: PS1
 * Date: 02/03/2023
 *
 * */


import java.util.*;
public class Player {
    private String name;
    private char symbol;
    private int points = 0;
    public static Scanner scan = new Scanner(System.in);

    // Setter and Getter methods for name, symbol, and points
    public String getName() {
        return name;
    }
    public char getSymbol() {
        return symbol;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPoints() {
        return points;
    }
    public void addPoints() {
        this.points += 1;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public void setSymbol(char symbol) {
        if (symbol != 'X' && symbol != 'O') {
            throw new IllegalArgumentException("Invalid symbol");
        }
        this.symbol = symbol;
    }

    // Player Constructor
    public Player(String name, char symbol, int points) {
        setName(name);
        setSymbol(symbol);
        setPoints(points);
    }

    // method that adds a piece to the board
    public void addPiece(Board board) {
        System.out.println("Enter the row: ");
        int row = scan.nextInt();
        System.out.println("Enter the column: ");
        int col = scan.nextInt();
        board.Board[row][col] = getSymbol();
    }

    public static void main(String[] args) {
    }
}
