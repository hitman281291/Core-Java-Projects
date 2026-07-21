void main()
{
    int inner_count = 0;
    int outer_count = 0;
    
    for(int i=1; i<=5; i++)
    {   
        outer_count++;
        IO.println("Outer for loop : "+outer_count);
        
        for(int j=1; j<=5; j++)
        {
            inner_count++;
            System.out.println("Inner for loop : "+inner_count);
        }
        
    }
}