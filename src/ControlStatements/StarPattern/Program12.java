void main()
{
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            if((i>=2 && j>=2) && (i<=4 && j<=4))
            {
                IO.print("  ");
            }
            else
            {
                IO.print("* ");
            }
        }
        
        IO.println();
    }
}