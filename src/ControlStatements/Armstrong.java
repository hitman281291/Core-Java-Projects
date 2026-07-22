void main()
{

    IO.println("Armstrong numbers between 1 to 10000");


    for (int no = 1; no <= 10000; no++)
    {
        int originalNumber = no;
        int sum = 0;

        //Calculate number of digits
        int temp = no;
        int digits = 0;


        while(temp!=0)
        {
            temp = temp/10;
            digits++;   
        }

        int curreNumber  = no;
        while(curreNumber!=0)
        {
            int rem =  curreNumber%10;
            int power = 1;
            

            // Calculate power of rem to the number of digits
            for(int i=1;i<=digits;i++)
            {
                power = power * rem;
            }
            sum = sum + power;
            curreNumber = curreNumber/10;
        }

        if(sum == originalNumber)
        {
            IO.println(originalNumber);
        }

    }

}