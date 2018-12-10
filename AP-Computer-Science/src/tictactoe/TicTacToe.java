package tictactoe;

import java.util.Scanner;

public class TicTacToe {

	private static boolean play = true;
	private static int numOfPlays = 0;	
	
	public static void main(String[] args) {
		String [][] board = new String[3][3];
		for(int x = 0; x<3; x++) {
			for(int i = 0; i<3; i++) {
				board[x][i] = " ";
			}
		}
		Scanner consoleinput = new Scanner(System.in);
		display(board);
		while(play) {
			play = xMove(board, consoleinput);
			if(play) {
				play = oMove(board, consoleinput);
			}
		}
	}
	
	public static boolean xMove(String [][] board, Scanner consoleinput) {
		System.out.println("Enter X Cords:");
		Scanner xInput = new Scanner(consoleinput.next()).useDelimiter(",");
		int x = xInput.nextInt();
		int y = xInput.nextInt();
		if(board[x-1][y-1].equals(" ")) {
			board[x-1][y-1] = "X";
			display(board);
			return checkWinX(board);
		} else {
			System.out.println("Invalid Move");
			xMove(board, consoleinput);
		}
		return true;
	}
	
	public static boolean oMove(String [][] board, Scanner consoleinput) {
		System.out.println("Enter O Cords:");
		Scanner parseyInput = new Scanner(consoleinput.next()).useDelimiter(",");
		int x = parseyInput.nextInt();
		int y = parseyInput.nextInt();
		if(board[x-1][y-1].equals(" ")) {
			board[x-1][y-1] = "O";
			display(board);
			return checkWinO(board);
		} else {
			System.out.println("Invalid Move");
			oMove(board, consoleinput);
		}
		return true;
	}
	
	public static void display(String [][] board) {
		for(int i = 0; i < 3; i++) {
			System.out.println("+-+-+-+");
			for(int x = 0; x < 3; x++) {
				System.out.print("|" + board[i][x]);
			}
			System.out.println("|");
		}
		System.out.println("+-+-+-+");
	}
	
	public static boolean checkWinX(String [][] board) {
		//Draw Check
		if(numOfPlays == 9) {
			System.out.println("Draw");
			//play = false;
			return false;
		}
		//Horizontal Check
		for (int horizontal = 0; horizontal <= 2; horizontal++) {
			if (board[horizontal][0].equals("X") && board[horizontal][1].equals("X") && board[horizontal][2].equals("X")) {
				System.out.println("Player 1 Wins!");
				//play = false;
				return false;
			}
		}
		for (int vertical = 0; vertical <=2; vertical++) {
			if (board[0][vertical].equals("X") && board[1][vertical].equals("X") && board[2][vertical].equals("X")) {
				System.out.println("Player 1 Wins!");
				return false;
			}
		} 
		if (board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) {
			System.out.println("Player 1 Wins!");
			return false;
		} 
		if (board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) {
			System.out.println("Player 1 Wins!");
			return false;
		}
		return true;
	}
	
	public static boolean checkWinO(String [][] board) {
		//Horizontal Check
		for (int horizontal = 0; horizontal <= 2; horizontal++) {
			if (board[horizontal][0].equals("O") && board[horizontal][1].equals("O") && board[horizontal][2].equals("O")) {
				System.out.println("Player 2 Wins!");
				//play = false;
				return false;
			}
		}
		//Vertical Check	
		for (int vertical = 0; vertical <=2; vertical++) {
			if (board[0][vertical].equals("O") && board[1][vertical].equals("O") && board[2][vertical].equals("O")) {
				System.out.println("Player 2 Wins!");
				//play = false;
				return false;
			}
		}
		if (board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")) {
			System.out.println("Player 2 Wins!");
			//play = false;
			return false;
		} 
		if (board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")) {
			System.out.println("Player 2 Wins!");
			//play = false;
			return false;
		}
		return true;
	}
}