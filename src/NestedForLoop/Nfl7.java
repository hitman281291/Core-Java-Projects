void main()
{
    int inner_count = 0;
    int outer_count = 0;

    for(int i=1; i<=5; i++)
    {
        outer_count++;
        
       for(int j=1; j<=i; j++)
       {
           inner_count++;

       }
    }
    IO.println("Outer count is "+outer_count);
    IO.println("Inner count is "+inner_count);
}