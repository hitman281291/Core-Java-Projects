void main()
{
    IO.println("Check number is Armstrong or not");

    Scanner sc = new Scanner(System.in);
    
    IO.println("Enter the number which needs to be checked Armstrong or not");
    int num  = sc.nextInt();

    int temp1 = num;
   
    int digits = 0;

    while(temp1!=0)
    {
        digits++;
        temp1 = temp1/10;
    }

    int temp2 = num;
    int sum = 0;
    while(temp2!=0)
    {
        int rem = temp2 % 10;

        int mul = 1;
        for(int i=1; i<= digits; i++)
        {
            mul = mul * rem;
        }

        sum = sum + mul;

        temp2 = temp2/10;
    }
    
    if(sum==num)
    {
        IO.println("Number is Armstrong");
    }
    else
    {
        IO.println("Number is not Armstrong");
    }

}