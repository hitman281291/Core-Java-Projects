void main()
{
    l1:for (int i=1; i<=5; i++)
    {
        
        l2:for(int j=1; j<=5; j++)
        {
            IO.println(j);
            
            if(j==3)
            {
                break l1;
            }
        }
    }
}