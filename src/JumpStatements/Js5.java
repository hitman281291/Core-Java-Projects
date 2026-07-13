void main()
{
    for (int i=1; i<=5; i++)
    {
        
        for(int j=1; j<=5; j++)
        {
            IO.println(j);
            
            if(i==3)
            {
                continue;
            }
        }
    }
}