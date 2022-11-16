package Backgammon;

import java.util.Arrays;

public class Checkers {
	private int MatrixX = 19, MatrixY = 24;
	private Board board;
	
	Checkers(Board board){
		this.board = board;
		
		
		//initial positions
		for (int i = 2;i<=6;i++){
			board.getSet()[i][1] = "x";
		}
		for (int i = 2;i<=4;i++){
			board.getSet()[i][5] = "o";
		}
		for (int i = 2;i<=6;i++){
			board.getSet()[i][10] = "o";
		}
		for (int i = 2;i<=3;i++){
			board.getSet()[i][15] = "x";
		}
		//lower half
		for (int i = 21;i>=17;i--){
			board.getSet()[i][1] = "o";
		}
		for (int i = 21;i>=19;i--){
			board.getSet()[i][5] = "x";
		}
		for (int i = 21;i>=17;i--){
			board.getSet()[i][10] = "x";
		}
		for (int i = 21;i>=20;i--){
			board.getSet()[i][15] = "o";
		}
	}
	
	public void getPipCount() {
		//find X

		int countT = 0;
		int countB = 0;
		
		for(int y=0; y < MatrixY/2; y++) {
		    for(int i=0; i < MatrixX; i++) {
				if(board.getSet()[y][i] == "x") {
					if (i<9) {
						countT=countT+(12+i);
					}
					if (i>9) {
						countT=countT+(9+i);
					}
				}
			}
		}
		
		for(int y=MatrixY/2; y < MatrixY; y++) {
		    for(int i=0; i < MatrixX; i++) {
				if(board.getSet()[y][i] == "x") {
					if (i<9) {
						countB=countB+(13-i);
					}
					if (i>9) {
						countB=countB+(16-i);
					}
				}
			}
		}
		int Totalx = countT+countB;
		
		// Find o
		int countT1 = 0;
		int countB1 = 0;
		
		for(int y=0; y < MatrixY/2; y++) {
		    for(int i=0; i < MatrixX; i++) {
				if(board.getSet()[y][i] == "o") {
					if (i<9) {
						countT1=countT1+(13-i);
					}
					if (i>9) {
						countT1=countT1+(16-i);
					}
				}
			}
		}
		
		for(int y=MatrixY/2; y < MatrixY; y++) {
		    for(int i=0; i < MatrixX; i++) {
				if(board.getSet()[y][i] == "o") {
					if (i<9) {
						countB1=countB1+(12+i);
					}
					if (i>9) {
						countB1=countB1+(9+i);
					}
				}
			}
		}
		int Totalo = countT1+countB1;
		System.out.print("x pip count: " + Totalx + "\n");
		System.out.print("o pip count: " + Totalo + "\n");

	}

	public void legalMoves() {
		
	}
} 
