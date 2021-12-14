public class lab01task1
{
    public static void main(String[] args)
    {
        int[] source = {10, 20, 30, 40, 50, 60};
        leftshift(source, 3);

        for (int i = 0; i < source.length; i++)
        {
            if(i== source.length-1)
            {
                System.out.print(source[i]);
            }
            else
            {
                System.out.print(source[i]+",");
            }
        }
    }

    public static int [] leftshift(int[] s, int k)
    {
        for (int i = k; i < s.length; i++)
        {
            s[i - k] = s[i];
            s[i] = 0;
        }
        return s;
    }
}