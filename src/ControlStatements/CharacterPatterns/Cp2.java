void main()
{
    char ch='A';
    
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++)
        {
            IO.print(ch+" ");
        }
        ch++;
        IO.println();
    }
}