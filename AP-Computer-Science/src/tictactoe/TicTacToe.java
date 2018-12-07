package tictactoe;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		String [][] board = new String[3][3];
		for(int x = 0; x<3; x++) {
			for(int i = 0; i<3; i++) {
				board[x][i] = " ";
			}
		}
		Scanner consoleinput = new Scanner(System.in);
		boolean play = true;
		display(board);
		while(play) {
			xMove(board, consoleinput);
			oMove(board, consoleinput);
		}
	}
	
	public static void xMove(String [][] board, Scanner consoleinput) {
		System.out.println("Enter X Cords:");
		Scanner xInput = new Scanner(consoleinput.next()).useDelimiter(",");
		int x = xInput.nextInt();
		int y = xInput.nextInt();
		if(board[x-1][y-1].equals(" ")) {
			board[x-1][y-1] = "X";
			display(board);
			checkWinX(board);
		} else {
			System.out.println("Invalid Move");
			xMove(board, consoleinput);
		}
	}
	
	public static void oMove(String [][] board, Scanner consoleinput) {
		System.out.println("Enter O Cords:");
		Scanner parseyInput = new Scanner(consoleinput.next()).useDelimiter(",");
		int x = parseyInput.nextInt();
		int y = parseyInput.nextInt();
		if(board[x-1][y-1].equals(" ")) {
			board[x-1][y-1] = "O";
			display(board);
		} else {
			System.out.println("Invalid Move");
			oMove(board, consoleinput);
		}
	}
	
	public static void display(String [][] board) {
		for(int i = 0; i < 3; i++) {
			System.out.println("+-+-+-+");
			for(int x = 0; x < 3; x++) {
				System.out.print("|" + board[x][i]);
			}
			System.out.println("|");
		}
		System.out.println("+-+-+-+");
	}
	
	public static void checkWinX(String [][] board) {
		boolean win = true;
		for(int col = 0; col < board.length; col++) {
			while(win) {
				for(int square = 0; square < board.length; square++) {
					if(!board[col][square].equals("X")) {
						System.out.println("loose");
						win = false;
					}
				}
			}
			System.out.println("Out While");
		}
		System.out.println(win);
		System.out.println("Out All");
	}
}