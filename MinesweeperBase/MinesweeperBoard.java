
/**
 * Write a description of class Minesweeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard{
    Cell[] board;
    int rows;
    int columns;
    public MinesweeperBoard(int row, int col){
        //Put the constructor here.
        rows = row;
        columns = col;
        board = new Cell[row * col];

        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());

        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public MinesweeperBoard(){
        this(10,10);
    }

    public void addMines(int mines) throws Exception{
        if (mines < 0){
            throw new Exception("This is a negative number");
        } else if (mines > 100){
            throw new Exception("There are more mines then spots possible");
        } else{
            for(int i = 0; i < mines; i++){
                int adder = (int)(Math.random() * board.length);
                if(board[adder].getValue() == 0){
                    board[adder].setValueMine();
                } else{
                    i--;
                }
            }
        }
    }

    public void addNums(){
        for(int i = 0; i < board.length; i++){
            if(board[i].isMine()){
                // left and right
                if(i - 1 >= 0 && i % columns != 0 && !board[i - 1].isMine()){
                    board[i - 1].increase();
                }
                if(i + 1 <= board.length - 1 && i % columns != columns - 1 && !board[i + 1].isMine()){
                    board[i + 1].increase();
                }
                
                // top and bottom
                if(i - columns >= 0 && !board[i - columns].isMine()){
                    board[i - columns].increase();
                }
                if(i + columns <= board.length - 1 && !board[i + columns].isMine()){
                    board[i + columns].increase();
                }
                
                // left top
                if(i - columns - 1 >= 0 && i  % columns != 0 && !board[i - columns - 1].isMine()){
                    board[i - columns - 1].increase();
                }
                // right top
                if(i - columns + 1 < board.length && i % columns != columns - 1 && i - columns + 1 >= 0 && !board[i - columns + 1].isMine()){
                    board[i - columns + 1].increase();
                }
                //left bottom
                if(i + columns - 1 >= 0 && i % columns != 0 && i + columns - 1 <= board.length - 1 && !board[i + columns - 1].isMine()){
                    board[i + columns - 1].increase();
                }
                // right bottom
                if(i + columns + 1 <= board.length - 1 && i % columns != columns - 1 && !board[i + columns + 1].isMine()){
                    board[i + columns + 1].increase();
                }
            }
        }
    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){

        for(int r = 0; r < rows; r++){
            for (int c = 0; c < columns; c++){
                if (!board[r * columns + c].isMine()){
                    System.out.print(board[r * columns + c].getValue() + " ");
                } else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows*columns; i++){
            board[i] = new Cell();
            panel.add(board[i].getButton());
        }
        return panel;
    }
}
