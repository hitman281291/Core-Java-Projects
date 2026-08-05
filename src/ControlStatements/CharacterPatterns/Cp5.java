void main()
{
    for(int i=1;i<=4;i++) 
    {
        char ch = 'A';

        for (int j = 2; j <= i; j++) {
            IO.print(ch + " ");
            ch++;
        }
        
        for (int k = 1; k <= i; k++)
        {
            IO.print(ch + " ");
            ch--;
        }
        IO.println();
            

    }
}