void main()
{
//        int count = 1;
//        for (int j=1;j<=5;j++)
//        {
//            IO.print(count+" ");
//            count++;
//        }
//        IO.println();


        int n=5;
        int count = 1;

        for (int i=1; i<=5; i++)
        {
            if (i % 2 == 0)
            {
                count = count + n-1;
                int temp = count;
                
                for (int j = 1; j <= n; j++)
                {

                    IO.print(temp+" ");
                    temp--;
                }
                count++;

            } else {
                for (int j = 1; j <= n; j++) 
                {
                    IO.print(count + " ");
                    count++;
                }
            }

            IO.println();
        }
}