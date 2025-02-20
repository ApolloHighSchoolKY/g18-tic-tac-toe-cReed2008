//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[][]
		{
			{'o', 'x', 'o', },
			{'o', 'x', 'o', },
			{'o', 'x', 'o', }
		};



	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
	
		int pos = 0;

	for(int row = 0; row<mat.length; row++)
	{
		for(int col = 0; col<mat[row].length; col++)
		{
			mat[row][col] = game.charAt(pos);
			pos++;
		}
	}



	}

	public String getWinner()
	{
		if(mat[0][0] == mat[0][1] &&  mat[0][1] == mat[0][2])
			return "" + mat[0][0] + " wins horizontally!"+ "\n";

		else if(mat[1][0] == mat[1][1] &&  mat[1][1] == mat[1][2])
			return "" + mat[1][0] + " wins horizontally!"+ "\n";

		else if(mat[2][0] == mat[2][1] &&  mat[2][1] == mat[2][2])
			return "" + mat[2][0] + " wins horizontally!"+ "\n";

		else if(mat[0][0] == mat[1][0] &&  mat[1][0] == mat[2][0])
			return "" + mat[0][0] + " wins vertically!"+ "\n";

		else if(mat[0][1] == mat[1][1] &&  mat[1][1] == mat[2][1])
			return "" + mat[0][1] + " wins vertically!"+ "\n";

		else if(mat[0][2] == mat[1][2] &&  mat[1][2] == mat[2][2])
			return "" + mat[0][2] + " wins vertically!"+ "\n";

		else if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])
			return "" + mat[0][0] + " wins diagonally!"+ "\n";

		else if(mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0])
			return "" + mat[0][2] + " wins diagonally!"+ "\n";

		else
			return "" + "CAT" + "\n";
	}

	public String toString()
	{
		String output = "";

		for (int row = 0; row < mat.length; row++)
		{
			output = output + ""; 
			for (int col = 0; col < mat[row].length; col++)
			{
				output = output + mat[row][col];
			}
			output = output + "\n"; 
		}
	
		return "" + output; 
	}
}