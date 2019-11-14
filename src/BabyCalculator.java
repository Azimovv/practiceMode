/*import java.util.Scanner;

public class BabyCalculator
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        String a, b, op;
        int inA = 1, inB = 1, inC = 1;
        double dubA = 1, dubB = 1, dubC = 1;

        do
        {
            System.out.print("> ");
            a  = keyboard.next();
            op = keyboard.next();
            b  = keyboard.next();

            if (Numeric.isInteger(a))
                inA = Integer.valueOf(a);
            else if (Numeric.isDouble(a))
                dubA = Double.valueOf(a);

            if (Numeric.isInteger(b))
                inB = Integer.valueOf(b);
            else if (Numeric.isDouble(b))
                dubB = Double.valueOf(b);


            if ( op.equals("!") && Numeric.isDouble(a))
            {
                for (double n = dubA; n >= 1; n--)
                {
                    dubC*=n;
                }
            }
            else if ( op.equals("!") && Numeric.isInteger(a))
            {
                for (int n = inA; n >= 1; n--)
                {
                    inC*=n;
                }
            }
            else if ( op.equals("%") )
                c = a%b;
            else if ( op.equals("+") )
                c = a + b;
            else if (op.equals("-") )
                c = a - b;
            else if (op.equals("*") )
                c = a * b;
            else if (op.equals("/") )
                c = a / b;
            else if (op.equals("^") )
                c = Math.pow(a,b);
            else
            {
                System.out.println("Undefined operator: '" + op + "'.");
                c = 0;
            }

            if (a == 0)
                break;


            System.out.println(c);

        } while ( a!=0 );

        System.out.println("Thank you, goodbye");
    }
}
*/