void main()
{
    for(int i=4;i>=1;i--)
    {
        char ch='A';

        for(int j=1;j<=i;j++)
        {
            IO.print(ch+" ");
            ch++;
        }
        IO.println();
    }
}