void main()
{
    int count=1;
    for(int i=1;i<=5;i++)
    {
        for (int j=1;j<=i;j++)
        {
            IO.print(count+" ");
        }

        count++;

        IO.println();
    }
}