package tictactoe;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TicTacToe {

	private static boolean play = true;
	private static int numOfPlays = 0;	
	private static File log = new File("log.txt");
	
	
	public static void main(String[] args) throws IOException{
		//Create file or reset file it already exists
		if(!log.exists()) {
			log.createNewFile();
		} else {
			log.delete();
			log.createNewFile();
		}
		PrintStream fPrint = new PrintStream(log);
		//Create the 3x3 game board as a array.
		String [][] board = new String[3][3];
		//fill the array with spaces
		for(int x = 0; x<3; x++) {
			for(int i = 0; i<3; i++) {
				board[x][i] = " ";
			}
		}
		Scanner consoleinput = new Scanner(System.in);
		display(board, fPrint);
		//Loop that constantly asks for input until somone wins or it is a draw.
		while(play) {
			play = xMove(board, consoleinput, fPrint);
			if(play) {
				play = oMove(board, consoleinput, fPrint);
			}
		}
	}
	
	public static boolean xMove(String [][] board, Scanner consoleinput, PrintStream fPrint) {
		System.out.println();
		System.out.println("Player X, your move: (e.g. 1,3)");
		fPrint.println();
		fPrint.println("Player X, your move: (e.g. 1,3)");
		//take in the input cords
		Scanner xInput = new Scanner(consoleinput.next()).useDelimiter(",");
		int x = xInput.nextInt();
		int y = xInput.nextInt();
		fPrint.println(x + "," + y);
		//check to make sure the input is valid
		if(!((x > 3 || y > 3) || (x < 0 || y < 0 ))){
			if(board[x-1][y-1].equals(" ")) {
				board[x-1][y-1] = "X";
				display(board, fPrint);
				numOfPlays++;
				return checkWinX(board, fPrint);
				
			} else {
				System.out.println("Invalid Move");
				fPrint.println("Invalid Move");
				xMove(board, consoleinput, fPrint);
			}
			return true;	
		} else {
			System.out.println("Invalid Input");
			fPrint.println("Invalid Input");
			xMove(board, consoleinput, fPrint);
			return true;
		}
	}
	public static boolean oMove(String [][] board, Scanner consoleinput, PrintStream fPrint) {
		System.out.println();
		System.out.println("Player O, your move: (e.g. 1,3)");
		fPrint.println();
		fPrint.println("Player O, your move: (e.g. 1,3)");
		//Take in the cords
		Scanner parseyInput = new Scanner(consoleinput.next()).useDelimiter(",");
		int x = parseyInput.nextInt();
		int y = parseyInput.nextInt();
		fPrint.println(x + "," + y);
		//Check to make sure they are valid numbers
		if(!((x > 3 || y > 3) || (x < 0 || y < 0 ))){
			if(board[x-1][y-1].equals(" ")) {
				board[x-1][y-1] = "O";
				display(board, fPrint);
				numOfPlays++;
				return checkWinO(board, fPrint);
			} else {
				System.out.println("Invalid Move");
				fPrint.println("Invalid Move");
				oMove(board, consoleinput, fPrint);
			}
			return true;
		} else {
			//If input invalid
			System.out.println("Invalid Input");
			fPrint.println("Invalid Input");
			oMove(board, consoleinput, fPrint);
			return true;
		}
	}
	

	
	public static void display(String [][] board, PrintStream fPrint) {
		//Display the board
		for(int i = 0; i < 3; i++) {
			System.out.println("+-+-+-+");
			fPrint.println("+-+-+-+");
			for(int x = 0; x < 3; x++) {
				System.out.print("|" + board[i][x]);
				fPrint.print("|" + board[i][x]);
			}
			System.out.println("|");
			fPrint.println("|");
		}
		System.out.println("+-+-+-+");
		fPrint.println("+-+-+-+");
	}
	
	public static boolean checkWinX(String [][] board, PrintStream fPrint) {
		//Horizontal Check
		for(int horizontal = 0; horizontal <= 2; horizontal++) {
			if (board[horizontal][0].equals("X") && board[horizontal][1].equals("X") && board[horizontal][2].equals("X")) {
				System.out.println("Player X Wins!");
				fPrint.println("Player x Wins!");
				return false;
			}
		}
		//Vert Check
		for(int vertical = 0; vertical <=2; vertical++) {
			if (board[0][vertical].equals("X") && board[1][vertical].equals("X") && board[2][vertical].equals("X")) {
				System.out.println("Player X Wins!");
				fPrint.println("Player X Wins!");
				return false;
			}
		}
		//Diag Check
		if(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) {
			System.out.println("Player X Wins!");
			fPrint.println("Player X Wins!");
			return false;
		} 
		if(board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) {
			System.out.println("Player X Wins!");
			fPrint.println("Player X Wins!");
			return false;
		}
		//Draw Check
		if(numOfPlays == 9) {
			System.out.println("Draw");
			fPrint.println("Draw");
			return false;
		}
		return true;
	}
	
	public static boolean checkWinO(String [][] board, PrintStream fPrint) {
		//Horizontal Check
		for (int horizontal = 0; horizontal <= 2; horizontal++) {
			if (board[horizontal][0].equals("O") && board[horizontal][1].equals("O") && board[horizontal][2].equals("O")) {
				System.out.println("Player O Wins!");
				fPrint.println("Player O Wins!");
				return false;
			}
		}
		//Vertical Check	
		for (int vertical = 0; vertical <=2; vertical++) {
			if (board[0][vertical].equals("O") && board[1][vertical].equals("O") && board[2][vertical].equals("O")) {
				System.out.println("Player O Wins!");
				fPrint.println("Player O Wins!");
				return false;
			}
		}
		//Diag Check
		if (board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")) {
			System.out.println("Player O Wins!");
			fPrint.println("Player O Wins!");
			return false;
		} 
		if (board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")) {
			System.out.println("Player O Wins!");
			fPrint.println("Player O Wins!");
			return false;
		}
		return true;
	}
}