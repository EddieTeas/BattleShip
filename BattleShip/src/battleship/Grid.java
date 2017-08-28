/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author Edward
 */
public class Grid {
    private int row;
    private int col;
    Grid(){
        row = 7;
        col = 7;
        
        for(int a =0;a < row; a++){
            for(int b = 0; b < col; b++){
                System.out.print("~ ");
        }
        System.out.println(" ");
    }
}
}