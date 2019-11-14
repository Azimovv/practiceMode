import java.util.Scanner;

public class TicTacToe
{

    private static char[][] board = new char[3][3];

    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        int winval = 0;

        initBoard();
        displayBoard();
        for (int turn = 1; turn <= 9 ; turn++)
        {
            System.out.println();
            if(turn%2 == 0)
            {
                System.out.print("'O', choose your location (row, column): ");
                int row = keyboard.nextInt();
                int col = keyboard.nextInt();
                board[row][col] = 'O';
            }
            else
            {
                System.out.print("'X', choose your location (row, column): ");
                int row = keyboard.nextInt();
                int col = keyboard.nextInt();
                board[row][col] = 'X';
            }
            System.out.println();
            displayBoard();

            for (int r = 0; r<3; r++)
            {
                if (board[r][0] == board[r][1] && board[r][1] == board[r][2])
                {
                    if (board[r][0] == 'X')
                    {
                        System.out.println("Congrats, 'X' won!");
                        return;
                    }
                    else if (board[r][0] == 'O')
                    {
                        System.out.println("Congrats, 'O' won!");
                        return;
                    }
                }
                else if (board[0][r] == board[1][r] && board[1][r] == board[2][r])
                {
                    if (board[0][r] == 'X')
                    {
                        System.out.println("Congrats, 'X' won!");
                        return;
                    }
                    else if (board[0][r] == 'O')
                    {
                        System.out.println("Congrats, 'O' won!");
                        return;
                    }
                }
                else if (board[0][0] == board[1][1] && board[1][1] == board [2][2])
                {
                    if (board[0][0] == 'X')
                    {
                        System.out.println("Congrats, 'X' won!");
                        return;
                    }
                    else if (board[0][0] == 'O')
                    {
                        System.out.println("Congrats, 'O' won!");
                        return;
                    }
                }
                else if (board[0][2] == board[1][1] && board[1][1] == board [2][0])
                {
                    if (board[0][2] == 'X')
                    {
                        System.out.println("Congrats, 'X' won!");
                        return;
                    }
                    else if (board[0][2] == 'O')
                    {
                        System.out.println("Congrats, 'O' won!");
                        return;
                    }
                }

            }
        }
        System.out.println("It's a tie");

    }

    public static void initBoard()
    {
        // fills up the board with blanks
        for ( int r=0; r<3; r++ )
            for ( int c=0; c<3; c++ )
                board[r][c] = ' ';
    }


    public static void displayBoard()
    {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }


    public static void displayBoard2()
    {
        for ( int r=0; r<3; r++ )
        {
            System.out.print("\t"+r+" ");
            for ( int c=0; c<3; c++ )
            {
                System.out.print( board[r][c] + " " );
            }
            System.out.println();
        }
        System.out.println("\t  0 1 2 ");
    }
}