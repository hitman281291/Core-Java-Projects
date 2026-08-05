void main()
{
    for(int i=1;i<=4;i++)
    {
        for (int j=1; j<=i;j++)
        {
            IO.print(j+" ");
        }
        for (int k=i-1;k>=1;k--)
        {
            IO.print(k+" ");
        }

        IO.println();
    }
}