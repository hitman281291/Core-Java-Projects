void main()
{
    int inner_count = 0;
    int outer_count = 0;

    for(int i=1; i<=5; i+=2)
    {
        outer_count++;
        
       for(int j=1; j<=5; j++)
       {
           inner_count++;
//           System.out.println("i : "+i + " and j : "+j);
//           IO.println("---------------------");
       }
    }
    IO.println("Outer count is "+outer_count);
    IO.println("Inner count is "+inner_count);
}