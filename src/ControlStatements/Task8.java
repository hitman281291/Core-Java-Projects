void main()
{
    IO.println("Print prime numbers between 1 & 100");
    
    Scanner sc = new Scanner(System.in);
    
    IO.println("1");

    for(int num=2; num<=100; num++)
    {
        boolean isPrime = true;
        
        for (int i=2; i<= num/2 ; i++)
        {
            if(num%i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
        {
            IO.println(num + " ");
        }
    }
    
}