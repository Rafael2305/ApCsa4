
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

public class MinesweeperBoard2{
    Cell[][] board;
    int rows;
    int columns;
    public MinesweeperBoard2(int row, int col){
        //Put the constructor here.
        rows = row;
        columns = col;
        board = new Cell[row][col];
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());

        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public MinesweeperBoard2(){
        this(10,10);
    }

    public void addMines(int mines) throws Exception{
        if (mines < 0){
            throw new Exception("This is a negative number");
        } else if (mines > rows * columns){
            throw new Exception("There are more mines then spots possible");
        } else{
            for(int i = 0; i < mines; i++){
                int adderRow = (int)(Math.random() * rows);
                int adderCol = (int)(Math.random() * columns);
                if (board[adderRow][adderCol].getValue() == 0){
                    board[adderRow][adderCol].setValueMine();
                } else{
                    i--;
                }
            }
        }
    }

    public void addNums(){
        for(int r = 0; r < rows; r++){
            for (int c = 0; c < columns; c++){
                if(board[r][c].isMine()){
                    //top
                    if(r - 1 >= 0 && !board[r - 1][c].isMine()){
                        board[r - 1][c].increase();
                    }
                    //bottom
                    if(r + 1 < rows && !board[r + 1][c].isMine()){
                        board[r + 1][c].increase();
                    }
                    //left
                    if(c - 1 >= 0 && !board[r][c - 1].isMine()){
                        board[r][c-1].increase();
                    }
                    //right
                    if(c + 1 < columns && !board[r][c + 1].isMine()){
                        board[r][c + 1].increase();
                    }
                    //
                    //top left
                    if(r - 1 >= 0 && c - 1 >= 0 && !board[r - 1][c - 1].isMine()){
                        board[r - 1][c - 1].increase();
                    }
                    //top right
                    if(r - 1 >= 0 &&  c + 1 < columns && !board[r - 1][c + 1].isMine()){
                        board[r - 1][c + 1].increase();
                    }
                    //bottom left
                    if(r + 1 < rows && c - 1 >= 0 && !board[r + 1][c - 1].isMine()){
                        board[r + 1][c - 1].increase();
                    }
                    //bottom right
                    if(r + 1 < rows && c + 1 < columns && !board[r + 1][c + 1].isMine()){
                        board[r + 1][c + 1].increase();
                    }
                }
            }
        }
    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        for(Cell[] row : board){
            for(Cell cell : row){
                if(!cell.isMine()){
                    System.out.print(cell.getValue() + " ");
                } else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                board[r][c] = new Cell();
                panel.add(board[r][c].getButton());
            }
        }
        return panel;
    }
}

