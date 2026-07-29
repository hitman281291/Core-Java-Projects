void main()
{
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 4; j >= i; j--)
        {
            IO.print(" ");
        }


        for (int k=1 ; k<=i; k++)
        {
            if(k==1 || i==k || i==5) {
                IO.print("* ");
            }
            else
            {
                IO.print("  ");
            }

        }
        
        IO.println();
        
    }
    
}