/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tictactoekata;

import java.util.InputMismatchException;
import java.util.Scanner;

import static tictactoekata.GFG.board;
import static tictactoekata.GFG.checkWinner;
import static tictactoekata.GFG.printBoard;
import static tictactoekata.GFG.turn;



/**
 *
 * @author YGT
 */
public class TictactoeKata {

    


    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.setName("TictactoeKata");
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;
        thread.setName(turn);
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }
  
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();
  
        System.out.println(
            "X will play first. Enter a slot number to place X in:");
        

        
  
        while (winner == null) {
          
            
            
            int numInput;
            
            

           
               try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                        "Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                    "Invalid input; re-enter slot number:");
                continue;
            }
              

            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = turn;
  
                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }

  
                printBoard();
                    if(winner==null){
                    System.out.println("Round Break for 2 secs");
                    Thread.sleep(2000);
                }
                
                winner = checkWinner();
                
                
                
            }
            else {
                System.out.println(
                    "Slot already taken; re-enter slot number:");
            }
        }

        

        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                "It's a draw! Thanks for playing.");
        }
        

        else {
            System.out.println(
                "Congratulations! " + winner
                + "'s have won! Thanks for playing.");
        }
    }
}

    
    

