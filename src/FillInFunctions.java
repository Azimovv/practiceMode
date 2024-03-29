// Fill-In Functions - Fix the broken functions and function calls.

public class FillInFunctions
{
    public static void main( String[] args )
    {
        // Fill in the function calls where appropriate.

        System.out.println("Watch as we demonstrate functions.");

        System.out.println();
        System.out.println("I'm going to get a random character from A-Z");
        char c = '!';
        System.out.println("The character is: " + randchar() + c );

        System.out.println();
        System.out.println("Now let's count from -10 to 10");
        int begin, end;
        begin = -10;
        end = 10;
        counter(begin, end);
        System.out.println("How was that?");

        System.out.println();
        System.out.println("Now we take the absolute value of a number.");
        int x;
        x = -10;
        System.out.println("|" + x + "| = " + abso(x) );

        System.out.println();
        System.out.println("That's all.  This program has been brought to you by:");
        credits();
    }


	public static void credits()
	{
		// displays some boilerplate text saying who wrote this program, etc.

		System.out.println();
		System.out.println("programmed by Graham Mitchell");
		System.out.println("modified by Phat Daddy");
		System.out.print("This code is distributed under the terms of the standard ");
		System.out.println("BSD license.  Do with it as you wish.");
	}



	public static char randchar()
	{
		// chooses a random character in the range "A" to "Z"

		int numval;
		char charval;

		// pick a random number from 0 to 25
		numval = (int)(Math.random()*26);
		// now add that offset to the value of the letter 'A'
		charval = (char) ('A' + numval);

		return charval;
	}



	public static void counter( int start, int stop )
	{
		// counts from start to stop by ones
		int ctr;

		ctr = start;
		while ( ctr <= stop )
		{
			System.out.print(ctr + " ");
			ctr = ctr+1;
		}
	}


	public static int abso( int absval )
	{
		// finds the absolute value of the parameter
		int value = absval;
		if ( value < 0 )
			absval = -value;
		else
			absval = value;

		return absval;
	}

}
