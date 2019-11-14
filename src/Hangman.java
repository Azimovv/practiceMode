import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static void main (String[] args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);

        String word1 = "leviathan";
        String word2 = "nessie";
        String word3 = "iceborne";
        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();
        char[] third = word3.toCharArray();
        String repeat = "again";
        int attempt = 1;

        while (repeat.equals("again") && attempt <= 3)
        {
            if (attempt == 1)
                hangman(first);
            else if(attempt == 2)
                hangman(second);
            else if (attempt == 3)
                hangman(third);

            System.out.println();
            System.out.print("Play 'again' or 'quit'? ");
            repeat = keyboard.next();
            attempt++;
        }

    }

    public static void hangman(char[] word)
    {
        Scanner keyboard = new Scanner(System.in);
        char[] missedLetters = new char[6];
        char[] isCorrect = new char[word.length];
        System.out.print("Word: ");
        for (int n=0; n<isCorrect.length; n++)
        {
            isCorrect[n] = '_';
            System.out.print(isCorrect[n] + " ");
        }
        System.out.println("\n");
        System.out.println("Misses: ");
        System.out.println();
        System.out.print("Guess: ");

        char guess = keyboard.next().charAt(0);
        System.out.println();
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        boolean correct;
        int misses = 0;

        while(misses<5)
        {
            correct = false;
            System.out.println();
            System.out.print("Word: ");
            for (int n = 0; n<word.length; n++)
            {
                if(guess == word[n])
                {
                    isCorrect[n] = word[n];
                    correct = true;
                }
            }
            if (!correct)
            {
                missedLetters[misses] = guess;
                misses++;
            }

            for (int i=0; i<isCorrect.length; i++)
                System.out.print(isCorrect[i] + " ");

            System.out.println("\n");
            System.out.print("Misses: " + " ");
            for (int n = 0; n<misses; n++)
                System.out.print(missedLetters[n]);
            System.out.println();

            if (misses == 5)
                break;
            if (Arrays.equals(word, isCorrect))
                break;

            System.out.print("\nGuess: ");
            guess = keyboard.next().charAt(0);
            System.out.println();System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");

            correct = false;

        }
        if (misses==5)
            System.out.println("\nYou lost");
        else
            System.out.println("\nYou won");


    }

}
