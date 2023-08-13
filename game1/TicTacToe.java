package game1;

import java.util.*;
public class TicTacToe {
public static Scanner sc= new Scanner(System.in);
public static char[] b= {'0','0','0','0','0','0','0','0','0'};
public static int player=0;
public static boolean gameOver=false;
public static char symbol;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		while(!gameOver) {
			printBoard();
			player=count%2==0  ? 1:2;
			if(play(player)==false) {
				System.out.println("invalid input");
				count--;
			}
			if(checkWinner(player)==1) {
				printBoard();
				winningMessage(player);
				gameOver=true;
			}else if(checkWinner(player)==2) {
				printBoard();
				winningMessage(player);
				gameOver=true;
			}
			if(checkDraw()) {
				printBoard();
				Drawmessage();
				gameOver=true;
			}
			count++;
		}
		
	}
	private static void Drawmessage() {
		// TODO Auto-generated method stub
		System.out.println("The game is draw...");
	}
	private static boolean checkDraw() {
		// TODO Auto-generated method stub
		boolean res=false;
		if (b[1] != '0' && b[1] != '0'&& b[2] != '0' &&
			b[3] != '0' && b[4] != '0'&& b[5] != '0' &&
			b[6] != '0' && b[7] != '0'&& b[8] != '0' )
			res=true;
			return res;
		
			
		
	}
	private static void winningMessage(int player) {
		// TODO Auto-generated method stub
		System.out.println("The Winner is "+ player);
	}
	private static int checkWinner(int player) {
		// TODO Auto-generated method stub
		int res=0;
		switch(player) {
		
		case 1: if ( b[0]=='X' && b[1]=='X' && b[2]=='X'||  
				b[3]=='X'&& b[4]=='X'&& b[5]=='X'||
				b[6]=='X'&& b[7]=='X'&& b[8]=='X'||
				b[0]=='X'&& b[3]=='X'&& b[6]=='X'||
				b[1]=='X'&& b[4]=='X'&& b[7]=='X'||
				b[2]=='X'&& b[3]=='X'&& b[8]=='X'||
				b[0]=='X'&& b[4]=='X'&& b[8]=='X'||
				b[2]=='X'&& b[4]=='X'&& b[6]=='X') 
			 	res=1; break;
		case 2: if ( b[0]=='O' && b[1]=='O' && b[2]=='O'||  
				b[3]=='O'&& b[4]=='O'&& b[5]=='O'||
				b[6]=='O'&& b[7]=='O'&& b[8]=='O'||
				b[0]=='O'&& b[3]=='O'&& b[6]=='O'||
				b[1]=='O'&& b[4]=='O'&& b[7]=='O'||
				b[2]=='O'&& b[3]=='O'&& b[8]=='O'||
				b[0]=='O'&& b[4]=='O'&& b[8]=='O'||
				b[2]=='O'&& b[4]=='O'&& b[6]=='O') 
				res=2; break;
		}
		return res;
	}
	private static boolean play(int player) {
		// TODO Auto-generated method stub
		
	    boolean res=true;
	    symbol=player==1 ? 'X':'O';
		int input=getInput();
		if(input==1 && b[0]=='0') {
			b[0]=symbol;
		}
		else if(input==2 && b[1]=='0') {
			b[1]=symbol;
		}
		else if(input==3 && b[2]=='0') {
			b[2]=symbol;
		}
		else if(input==4 && b[3]=='0') {
			b[3]=symbol;
		}
		else if(input==5 && b[4]=='0') {
			b[4]=symbol;
		}
		else if(input==6 && b[5]=='0') {
			b[5]=symbol;
		}
		else if(input==7 && b[6]=='0') {
			b[6]=symbol;
		}
		else if(input==8 && b[7]=='0') {
			b[7]=symbol;
		}
		else if(input==9 && b[8]=='0') {
			b[8]=symbol;
		}
		else {
			res=false;
		}
		return res;
	}
	private static int getInput() {
		// TODO Auto-generated method stub
		System.out.println("Enter input between 1 to 9: ");
		return sc.nextInt();
	}
	private static void printBoard() {
		// TODO Auto-generated method stub
		System.out.println("Tic Tac Toe Game");
		System.out.println("Player 1: X");
		System.out.println("Player 2: O");
		System.out.println("-------------------");
		System.out.println("|  "+ b[0]+ "  |"+ "  "+ b[1]+ "  |  "+ b[2]+"  |");
		System.out.println("-------------------");
		System.out.println("|  "+ b[3]+ "  |"+ "  "+ b[4]+ "  |  "+ b[5]+"  |");
		System.out.println("-------------------");
		System.out.println("|  "+ b[6]+ "  |"+ "  "+ b[7]+ "  |  "+ b[8]+"  |");
		System.out.println("-------------------");
	}

}
