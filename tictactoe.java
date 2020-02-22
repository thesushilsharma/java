import java.util.Scanner;

public class tictactoe {
	static Scanner s=new Scanner(System.in);
	static char player='X';
	static boolean tie=false;
	public static void main(String[] args) {
		char map[][]={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		while(check(map))
		{
		board(map);
		play(map);
		}
		if (player=='X'&& tie==false) {
			System.out.println("O wins,Congratulations");
		} 
		else 
		   if(player=='O'&& tie==false) {
			System.out.println("X wins, Congratulations");
		}
		else 
		System.out.println("Game Tie");
		board(map);
}	 
	public static void board(char A[][])
	{
		for(int i=0;i<A.length;i++)
		{	System.out.println();
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(" "+A[i][j]);
		      }
		   } 
		   System.out.println();
	}
	public static void play(char A[][])
	{
		int choice,row=0,column=0;
		if(player=='X')
		System.out.println("Player [X] Turn ");
		else
		System.out.println("Player [O] Turn ");
		System.out.print("Enter a location of u want ");
		choice=s.nextInt();
		switch (choice) {
		case 1:
			row=0;column=0;
			break;
		case 2:
			row=0;column=1;
			break;
		case 3:
			row=0;column=2;
			break;
		case 4:
			row=1;column=0;
			break;
		case 5:
			row=1;column=1;
			break;
		case 6:
			row=1;column=2;
			break;
		case 7:
			row=2;column=0;
			break;
		case 8:
			row=2;column=1;
			break;
		case 9:
			row=2;column=2;
			break;
		default:
		    System.out.println("Invalid Option");
			break;
		}
		if(player=='X'&&A[row][column]!='X'&&A[row][column]!='O')
		{A[row][column]='X';	
		player='O';}
	else	if(player=='O'&&A[row][column]!='X'&&A[row][column]!='O')
			{A[row][column]='O';
			player='X';	}
	else 
		    System.out.println("Field is already field!!!!. Choose different field ");		

	}
	public static boolean check(char A[][])
	{
		for (int i = 0; i < 3; i++) {
            if ((checkRowCol(A[i][0], A[i][1], A[i][2]) == true)||
				(checkRowCol(A[0][i], A[1][i], A[2][i]) == true)||
				(checkRowCol(A[0][0], A[1][1], A[2][2]) == true)|| 
				(checkRowCol(A[0][2], A[1][1], A[2][0]) == true))
				return false;
		}
		for (int i=0;i<3;i++) 
			{
				for(int j=0;j<3;j++)
			    if(A[i][j]!='X'&&A[i][j]!='O')
			    return true;	
		}
        tie=true;
		return false;
	}
	public static boolean checkRowCol(char c1, char c2, char c3) {
            return ((c1 == c2) && (c2 == c3));
	}
}
