
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
        
    }

    public void addNums(){

    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){

        for(int r = 0; r < rows; r++){
            for (int c = 0; c < columns; c++){
                System.out.print(board[rows + 5 * columns].getValue());
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
