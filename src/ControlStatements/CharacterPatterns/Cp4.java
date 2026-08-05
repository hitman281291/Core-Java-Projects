void main()
{
    char ch='D';
    
    for(int i=1;i<=4;i++)
    {
        for(int j=4;j>=i;j--)
        {
            IO.print(ch+" ");
            ch--;
        }
        IO.println();

        ch = (char) ('D' - i);

    }
    
}