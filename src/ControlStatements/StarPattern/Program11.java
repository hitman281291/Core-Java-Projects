void main()
{
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 4; j >= i; j--)
        {
            IO.print(" ");
        }

        for (int k = 1; k <= 5; k++)
        {
            IO.print("*");
        }
       
        IO.println();
    }
}