//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

		int x = file.nextInt();
		file.nextLine();

		//Read how many times you should read

			for (int read = 0; read < x; read++)
			{
				//file.nextLine()
				String game = file.nextLine(); 

				//Make a TicTacToes object for each game in the file
				TicTacToe newGame = new TicTacToe(game);

				//Get the winner
				System.out.println(newGame.getWinner());

				//Print the game
				System.out.println(newGame.toString());
			}

				file.close();



	}
}



