public class TicTacToeClass
{
    // Instance Variables
    private char[][] board;
    private int turns;

    // Constructors
    public TicTacToeClass()
    {
        board = new char[3][3];
        turns = 0;

        for ( int r=0; r<3; r++ )
            for ( int c=0; c<3; c++ )
                board[r][c] = ' ';
    }

    // Accessor Methods

    public boolean isWinner( char p )
    {
        for (int r=0; r<3; r++)
        {
            if (board[r][0] == board[r][1] && board[r][1] == board[r][2])
            {
                if (board[r][0] == p)
                    return true;
            }
            else if (board[0][r] == board[1][r] && board[1][r] == board[2][r])
            {
                if (board[0][r] == p)
                    return true;
            }
            else if (board[0][0] == board[1][1] && board[1][1] == board [2][2])
            {
                if (board[0][0] == p)
                    return true;
            }
            else if (board[0][2] == board[1][1] && board[1][1] == board [2][0])
            {
                if (board[0][2] == p)
                    return true;
            }
        }
        return false;
    }

    public boolean isFull()
    {
        if (numTurns() >= 10)
            return true;

        return false;
    }

    public boolean isCat()
    {
        if(!(isWinner('X') || isWinner('O')) && isFull())
            return true;

        return false;
    }

    public boolean isValid( int r, int c )
    {
        if ( 0 <= r && r <= 2 && 0 <= c && c <= 2 )
            return true;
        else
            return false;
    }

    public int numTurns()
    {
        turns++;
        return turns;
    }

    public char playerAt( int r, int c )
    {
        if ( isValid(r,c) )
            return board[r][c];
        else
            return '@';
    }

    public void displayBoard()
    {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    // Modifiers
    public void playMove( char p, int r, int c )
    {
        board[r][c] = p;
    }

}