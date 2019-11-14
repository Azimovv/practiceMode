public class ArmstrongNumbers {

    public static void main (String [] args)
    {
        for (int x = 0; x<=9; x++)
            for (int y = 0; y<=9; y++)
                for (int z = 0; z<=9; z++)
                {
                    if ((Math.pow(x,3)+Math.pow(y,3)+Math.pow(z,3) == ((x*100)+(y*10)+z)))
                        System.out.println(x + "" + y + "" + z);
                }
    }

}
